
public class Main {

	public static void main(String[] args) {

		double totalPlay = 6;
		double winCounter = 0;
		CrapsGame game = new CrapsGame();

		for (int i = 0; i < totalPlay; i++) {
		
			game.craps();
			
			if (game.didWin()) {
				
				winCounter += 1;
				
			}
			
		}
		
		double winRate = (winCounter / totalPlay) * 100;
		System.out.printf("Your win rate is %.2f%%" ,winRate);
		
	}

}
