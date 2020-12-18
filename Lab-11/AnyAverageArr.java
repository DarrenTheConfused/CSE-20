import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will find the average of any set of numbers.");
		
		System.out.print("Please choose number of values to average: ");
		int max = scan.nextInt();
		if (max == 0) {
			System.out.println("");
			System.out.println("No numbers to average. Exiting program.");
		}
		else {
			System.out.print("Please choose column width for output formatting: ");
			int width = scan.nextInt();
			
			System.out.println("");
			
			int[] array1 = new int[max];
			
			for (int i = 0; i < max; i++) {
				System.out.print("Please enter value #" + (i + 1) + ": ");
				array1[i] = scan.nextInt();
			}
			System.out.println("");
			System.out.println("The numbers being averaged are ...");
			int print = (max/width) + (max % width);
			int c = 0;
			for (int j = 0; j < print; j++) {
				for (int k = 0; k < width; k++) {
					if (c <= array1.length - 1) {
						System.out.print(array1[c] + " ");
					}
					else {
						System.out.print(" ");
					}
					c++;
				}
				System.out.println("");
			}
			double avg = 0;
			double sum = 0;
			for (int h = 0; h < max; h++) {
				sum = sum + array1[h];
			}
			avg = sum/max;
			System.out.println("");
			System.out.println("Average is: " + avg);
		}
		scan.close();
	}

}
