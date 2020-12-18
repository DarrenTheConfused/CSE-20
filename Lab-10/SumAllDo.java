import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int i = 0;
		int sum = 0;
		do {
			System.out.println("Number " + i);
			sum = sum + i;
			i++;
			
		} while ( i <= max);
		
		System.out.println("");
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + sum);
		input.close();
	}
	
}
