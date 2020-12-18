import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("What is your name? ");
	String name = scan.next();
	

	System.out.print("What is your favorite number? ");
	String number = scan.next();
	
	
	System.out.print("What do you like to do? ");
	String hobby = scan.next();
	
	
	System.out.print("What is your favorite color? ");
	String color = scan.next();
	
	System.out.print("What is your height? ");
	float height = scan.nextFloat();
	float cm =(float)(height * 2.54);
	
	System.out.print("Where do you live? ");
	String campus = scan.next();

	

	System.out.print("So your name is " + name + ". ");
	System.out.print("Your favorite number is " + number + ". ");
	System.out.print("You like to " + hobby + ". " + "\n");
	System.out.print("You live " + campus + ". ");
	System.out.print("Your favorite color is " + color + ". ");
	System.out.print("Your height in centimeters is " + "\n" + cm + " cm.");
	
	
	scan.close();
	}

}
