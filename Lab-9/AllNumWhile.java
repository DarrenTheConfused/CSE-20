import java.util.Scanner;

public class AllNumWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		System.out.print("Please enter the number whose multiples to print: ");
		int mul = input.nextInt();
		System.out.println("");
		int i = 1;
		System.out.println("Multiples of " + mul + " from 1 till " + max + " are:" );
		while ( i <= max) {
			if ((i % mul) == 0) {
				System.out.println("Number " + i);
			}
			i++;
		}
		
		input.close();
	}
}
