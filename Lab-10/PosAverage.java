import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 0 or less to stop entering numbers.");

		int i = 0;
		int num = 1;
		int sum = 0;
		do {
			System.out.print("Enter value #" + (i + 1) + ": ");
			num = input.nextInt();
			if (num > 0) {
				sum = sum + num;
			}
			else {
				i--;
			}
			i++;
		} while ( num > 0);
		
		
		double avg = (double)sum/i;
		System.out.println("Average is " + avg);
		input.close();

	}

}
