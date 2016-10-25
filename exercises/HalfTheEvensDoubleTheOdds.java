import java.util.Scanner;
public class HalfTheEvensDoubleTheOdds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len         =  sc.nextInt();
		int[] num_array =  new int[len];
		//for loop depends on the number entered
		for(int i=0; i < num_array.length; i++) {
			num_array[i] = sc.nextInt();
			//if the number is even, divide it by 2, else if the number is odd, multiply it by 2
			if(num_array[i] % 2 == 0) {
			num_array[i] = num_array[i] / 2;
			} else {
			num_array[i] = num_array[i] * 2;
			}
		}
	    printIntArray(num_array);
	}
	
	public static void printIntArray(int[] array) {
		System.out.println();
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
