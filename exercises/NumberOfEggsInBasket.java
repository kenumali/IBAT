public class NumberOfEggsInBasket{
	public static void main(String[] args) {
		System.out.println("The number of eggs is " + NumberOfEggs());
	}
	
	public static int NumberOfEggs() {
		int eggs = 1;
		while(true) {
			if(eggs % 2 == 1 && eggs % 3 == 1 && eggs % 4 == 1 && eggs % 5 == 1 && eggs % 6 == 1 && eggs % 7 == 0) {	
				break;
			}
			eggs += 1;
		}
		return eggs;
	}
}
