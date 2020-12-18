import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the sameple size: ");
		int size = scan.nextInt();
		if (size != 0) {
			
		
			System.out.println("");
		
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
		
			int[] array1 = new int[size];
			int[] array2 = new int[size];
			int[] array3 = new int[size];
			int[] array4 = new int[size];
		
			double[] averages = new double[4];
		
			double min = Integer.MIN_VALUE;
			double max = Integer.MAX_VALUE;
		
			int input = 0;
		
			for (int i = 0; i < 4; i++) {
				System.out.println("Enter the numbers for Trial " + (i + 1));
			
				for(int k = 0; k < size; k++) {
					System.out.print("Enter Sample #" + (k + 1) + ": ");
					input = scan.nextInt();
					if (i == 0) {
						array1[k] = input;
						sum1 = sum1 + input;
					}
					if (i == 1) {
						array2[k] = input;
						sum2 = sum2 + input;
					}
					if (i == 2) {
						array3[k] = input;
						sum3 = sum3 + input;
					}
					if (i == 3) {
						array4[k] = input;
						sum4 = sum4 + input;
					}
				
				}// end of nested for loop
				System.out.println("");
			
			
			}//end of main for loop
			double avg1 = sum1/size;
			if (sum1 == 0) {
				avg1 = 0;
			}
		
			double avg2 = sum2/size;
			if (sum2 == 0) {
				avg2 = 0;
			}
		
			double avg3 = sum3/size;
			if (sum3 == 0) {
				avg3 = 0;
			}
		
			double avg4 = sum4/size;
			if (sum4 == 0) {
				avg4 = 0;
			}
			
			System.out.println("");
			System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
			for (int print = 0; print < size; print++) {
				System.out.println("\t"+ (print + 1) +"\t\t"+ array1[print] +"\t"+ array2[print] +"\t"+ array3[print] +"\t"+ array4[print]);
			}
			System.out.println("\t" + "------------------------------------------------------------");
			System.out.println("Averages:" + "\t\t" + avg1 +"\t" + avg2 +"\t" + avg3 +"\t" + avg4);
			
			System.out.println("");
		
			averages[0] = avg1;
			averages[1] = avg2;
			averages[2] = avg3;
			averages[3] = avg4;
			
			double tempMax = 0;
			double tempMin = 0;
			
			for (int j = 0; j < averages.length; j++) {
				if (averages[j] < max) {
					tempMin = averages[j];
					max = tempMin;
				}
				if (averages[j] > min) {
					tempMax = averages[j];
					min = tempMax;
				}
				
			}	
		
			System.out.println("Min Average: " + max);
			System.out.println("Max Average: " + min);
			
			System.out.println("");
			
			if (min == max) {
				System.out.println("The trials match EXACTLY!");
			}
			else if (min < (2 * max)) {
				System.out.println("The trials concur with each other!");
			}
			else {
				System.out.println("The trials do NOT concur!");
			}
			scan.close();
		}
		else {
			System.out.println("No data to analyze. Ending program.");
		}
	}
	

}
