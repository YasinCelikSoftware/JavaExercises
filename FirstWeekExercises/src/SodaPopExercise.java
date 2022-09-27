
public class SodaPopExercise {

	public static void main(String[] args) {
		
		double artificialSweetenerPerSoda = 0.001;
		double killBoundery = 0.07;
		int weigthOfDieter = 110;
		int desiredWeightOfDieter = 95;
		int sodaNeedPerPound = 5;
		int poundsShouldLose = weigthOfDieter - desiredWeightOfDieter;
		int needToDrinkSoda = poundsShouldLose * sodaNeedPerPound;
		double drinkableSoda = killBoundery/artificialSweetenerPerSoda;
		
		System.out.printf("You should drink %d sodas for lose %d pounds but you can drink only %.0f sodas. Be careful!"
																							,needToDrinkSoda,poundsShouldLose,drinkableSoda);
		
	}

}
