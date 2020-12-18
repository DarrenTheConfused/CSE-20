import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the average of as many numbers as you like.");
		System.out.println("");
		
		System.out.print("Please choose the number of values to average: ");
		int max = input.nextInt();
		
		if (max != 0) {
		
			int i = 1;
			int sum = 0;
			int userNum = 0;
			while ( i <= max) {
				System.out.print("Please enter the " + i + " Number: ");
				userNum = input.nextInt();
				sum = sum + userNum;
				i++;
			}
		
			double average = (double)(sum/max);
		
			System.out.println("");
			System.out.println("The average of all the numbers is: " + average);
		}
		else {
			System.out.println("The average of all the numbers is: 0.0");
		}
		
		input.close();
		
	}
		


}


