import java.util.Scanner;
public class Manipulate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//INTEGER
		System.out.println("Insert a integer:");
		int n1 = scan.nextInt();
		System.out.println("Insert another integer:");
		int n2 = scan.nextInt();
		
		System.out.println("");
		
		int sum = n1 + n2;
		int difference = n1 - n2;
		int product = n1 * n2;
		int cast1 = (int)(n1 / n2);
		int cast2 = (int)(n1 % n2);
		
		
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + difference);
		System.out.println("Product of " + n1 + " and " + n2 + " is " + product);
		System.out.println("Integer cast of (" + n1 + " / " + n2 + ")" + " is " + cast1);
		System.out.println("Integer cast of (" + n1 + " % " + n2 + ")" + " is " + cast2);
		
		System.out.println("");
		//SHORT
		
		System.out.println("Insert a short:");
		short s1 = scan.nextShort();
		System.out.println("Insert another short:");
		short s2 = scan.nextShort();
		
		System.out.println("");
		
		int sumS = s1 + s2;
		int differenceS = s1 - s2;
		int productS = s1 * s2;
		int cast1S = (int)(s1 / s2);
		int cast2S = (int)(s1 % s2);
		
		System.out.println("Sum of " + s1 + " and " + s2 + " is " + sumS);
		System.out.println("Difference of " + s1 + " and " + s2 + " is " + differenceS);
		System.out.println("Product of " + s1 + " and " + s2 + " is " + productS);
		System.out.println("Integer cast of (" + s1 + " / " + s2 + ")" + " is " + cast1S);
		System.out.println("Integer cast of (" + s1 + " % " + s2 + ")" + " is " + cast2S);
		
		System.out.println("");
		//FLOAT
		
		System.out.println("Insert a float:");
		float f1 = scan.nextFloat();
		System.out.println("Insert another float:");
		float f2 = scan.nextFloat();
		
		System.out.println("");
		
		float sumF = f1 + f2;
		float differenceF = f1 - f2;
		float productF = f1 * f2;
		int cast1F = (int)(f1 / f2);
		int cast2F = (int)(f1 % f2);
		
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + sumF);
		System.out.println("Difference of " + f1 + " and " + f2 + " is " + differenceF);
		System.out.println("Product of " + f1 + " and " + f2 + " is " + productF);
		System.out.println("Integer cast of (" + f1 + " / " + f2 + ")" + " is " + cast1F);
		System.out.println("Integer cast of (" + f1 + " % " + f2 + ")" + " is " + cast2F);
		
		System.out.println("");
		//DOUBLE

		System.out.println("Insert a double:");
		double d1 = scan.nextDouble();
		System.out.println("Insert another double:");
		double d2 = scan.nextDouble();
		
		System.out.println("");
		
		double sumD = d1 + d2;
		double differenceD = d1 - d2;
		double productD = d1 * d2;
		int cast1D = (int)(d1 / d2);
		int cast2D = (int)(d1 % d2);
		
		System.out.println("Sum of " + d1 + " and " + d2 + " is " + sumD);
		System.out.println("Difference of " + d1 + " and " + d2 + " is " + differenceD);
		System.out.println("Product of " + d1 + " and " + d2 + " is " + productD);
		System.out.println("Integer cast of (" + d1 + " / " + d2 + ")" + " is " + cast1D);
		System.out.println("Integer cast of (" + d1 + " % " + d2 + ")" + " is " + cast2D);
		
		scan.close();
	}

}
