import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		System.out.println("");
		
		System.out.print("Please enter the max amount of numbers to add: ");
		int max = input.nextInt();
		
		int i = 0;
		int sum = 0;
		
		while ( i <= max) {
			System.out.println("Number " + i);
			sum = sum + i;
			++i;
		}
		
		System.out.println("");
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + sum);
		input.close();

	}

}
