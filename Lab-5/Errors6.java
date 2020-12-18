import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);

		int n1, n2;

		//System.out.print("Please enter the first number: ");
		System.out.print("Please enter the first integer: ");
		n1 = input.nextInt();

		//System.out.print("Please enter the second number: ");
		System.out.print("Please enter the second integer: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		//System.out.print("The average of the numbers is " + average);
		System.out.println("The average of the numbers is " + average);
		System.out.println("");

		//Scanner input = new Scanner(System.in); (deleted)

		//float n1, n2;
		float f1, f2;

		//System.out.print("Please enter the first number:");
		System.out.print("Please enter the first float:");
		f1 = input.nextFloat();

		//System.out.print("Please enter the second number: ");
		System.out.print("Please enter the second float:");
		f2 = input.nextFloat();

		//float average;
		float floatAvg;
		floatAvg = (f1+f2)/2;
		//System.out.print("The average of the numbers is " + average);
		System.out.println("The average of the numbers is " + floatAvg);
		System.out.println("");

		short s1, s2;

		//System.out.print("Please enter the first number: ");
		System.out.print("Please enter the first short:");
		s1 = input.nextShort();

		//System.out.print("Please enter the second number: ");
		System.out.print("Please enter the second short:");
		s2 = input.nextShort();

		short shortAvg;
		//shortAvg = (short)(n1+n2)/2;
		shortAvg = (short)((s1+s2)/2);
		System.out.print("The average of the numbers is " + shortAvg);
		
		input.close();
	}

}
