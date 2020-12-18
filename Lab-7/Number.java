import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		double num = input.nextInt();
		
		System.out.println("You have entered " + num);
		if ((num >= 1) && (num <= 26)) {
			char numlet = (char)(num + 64);
			System.out.println("Character " + num + " of the alphabet is " + numlet);
		}
		else {
			System.out.println("Invalid Input! Number is outside of acceptable range.");
		}
		input.close();
	}

}
