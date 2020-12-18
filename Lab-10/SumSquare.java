import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= max) {
			int square = (i * i);
			System.out.println("Number " + i + " squared is " + square);
			sum = sum + square;
			i++;
		}
		System.out.println("");
		System.out.println("The sum of squares of all numbers from 1 till " + max + " is: " + sum);
		input.close();
	}

}