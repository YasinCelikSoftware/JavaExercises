import java.util.Random;

public class CrapsGame {

	public boolean win;

	public int dices() {
		Random randomGenerator = new Random();
		int total = 0;
		for (int i = 0; i < 2; i++) {

			total += randomGenerator.nextInt(6)+1;

		}
		return total;
	}

	public void craps() {

		int point = dices();

		if (point == 7 || point == 11) {

			System.out.println("Congratulations you won the game. (Total = 7 or 11)");
			win = true;
			return;
		}
		if (point == 2 || point == 3 || point == 12) {

			System.out.println("Uh, you lost the game. (Total = 2 or 3 or 12)");
			win = false;
			return;
		} else {

			int newDices = dices();
			while (newDices != 7) {
				
				if (newDices == point) {

					System.out.println("Congratulations, you won the game. (ReDice equals to point)");
					win = true;
					return;
				}
				newDices = dices();
			}
			
			System.out.println("Uh, you lost the game. (ReDice total equals to 7)");
			win = false;
			return;
		}
		
	}
	
	public boolean didWin() {
		return win;
	}
}
