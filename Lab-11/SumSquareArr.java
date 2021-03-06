import java.util.Scanner;

public class SumSquareArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		
		if (max != 0) {
			int[] arr1 = new int[max + 1];
			int[] arr2 = new int[max + 1];
			int[] arr3 = new int[max + 1];

			int i = 1;

			// For-loop to calculate sums
			for (i = 1; i < max + 1; i++) {
				
				if (i != 0) {
					arr1[i] = arr1[i-1] + (i * i);
				}
				else {
					arr1[i] = (i * i);
				}
				
			}	
			
			// While-loop to calculate sums
			i = 1;
			while (i < max + 1) {
				
				if (i != 0) {
					arr2[i] = arr2[i-1] + (i * i);
					i++;
				}
				else {
					arr2[i] = (i * i);
					i++;
				}
				
			}	
			
			i = 1;
			
			// Do-While-loop to calculate sums
			do {
				if (i != 0) {
					arr3[i] = arr3[i-1] + (i * i);
					i++;
				}
				else {
					arr3[i] = (i * i);
					i++;
				}
				
			}
			while (i < max + 1);
			
			for (i = 0; i < max + 1; i++) {
				System.out.println("Arr1: " + arr1[i] + ", Arr2: " + arr2[i] + ", Arr3: " + arr3[i]);
			}
			System.out.println("Sum of numbers 1 to max is: " + arr1[(max + 1) - 1]);
		}
		else {
			System.out.println("");
			System.out.println("No numbers to sum up. Exiting program.");
		}
		input.close();

	}

}
