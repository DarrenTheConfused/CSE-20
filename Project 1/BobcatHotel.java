import java.util.Scanner;
import java.lang.Math;

public class BobcatHotel {

	public static void main(String[] args) {
		//ROOMS
		System.out.println("ROOM OPTIONS");
		//sizes
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ $100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		double mDiscount = 0;
		double mDiscountApp = 0;
		double baseCost = 0;
		int youWon = 0;
		double preTotal;
		System.out.print("Number of guests: ");
		int guest = scan.nextInt();
		
		System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		int room = scan.nextInt();
		
		System.out.print("Please enter the number of nights: ");
		int night = scan.nextInt();
		
		//base room cost
		switch (room) {
		case 1:
			baseCost = night * 50.50;
			break;
		case 2:
			baseCost = night * 75.00;
			break;
		case 3:
			baseCost = night * 100.75;
			break;
		case 4:
			baseCost = night * 150.25;
			break;
		case 5:
			baseCost = night * 225.50;
			break;
		}
		
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		int aaa = scan.nextInt();
		
		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		int member = scan.nextInt();
		System.out.println("");
		
		//4 night promotion
		if (member == 1) {
			int rand = (int)(Math.random() * 10) + 1;
			if (rand >= 4) {
				youWon = 1;
				mDiscount = (int)(night/4);
				System.out.println("Congratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\" ");
				System.out.println("Discount will be applied during checkout depending on the number of days");
				System.out.println("");
				//member discount
				switch (room) {
				case 1:
					mDiscountApp = (mDiscount * 50.50);
					break;
				case 2:
					mDiscountApp = (mDiscount * 75.00);
					break;
				case 3:
					mDiscountApp = (mDiscount * 100.75);
					break;
				case 4:
					mDiscountApp = (mDiscount * 150.25);
					break;
				case 5:
					mDiscountApp = (mDiscount * 225.50);
					break;
				}
			}
			else {
				System.out.println("Unfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck");
				System.out.println("next time!");
				System.out.println("");
			}
		}
		System.out.println("");
		//MEAL TIME
		System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
		System.out.println("0. Complementary @ $0 per guest");
		System.out.println("1. Standard @ $30 per guest");
		System.out.println("2. Deluxe @ $50 per guest");
		if (room == 5) {
			System.out.println("3. Indulgence @ $85 per guest");
		}
		System.out.println("");
		System.out.println("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown ");
		System.out.print("above): ");
		int meal = scan.nextInt();
		System.out.println("");
		//meal cost
		double mCost = 0;
		switch (meal) {
		case 0:
			mCost = guest * night * 0;
			break;
		case 1:
			mCost = guest * night * 30;
			break;
		case 2:
			mCost = guest * night * 50;
			break;
		case 3:
			mCost = guest * night * 85;
			break;
		}
		//meal cost check
		if (mCost == 0) {
			preTotal = baseCost;
		}
		else {
			preTotal = (baseCost + mCost);
		}
		//aaa member discount
		double aMemDiscount = (0.1 * preTotal);
		//total discount initialized
		double totalDiscount = 0;
		//extra check for total discount
		if (member == 1) {
			if (youWon == 1) {
			}
			else {
				member = 0;
			}
		}
		if ((member == 0) && (aaa == 0)) {
			totalDiscount = 0;
		}
		if (aaa == 0) {
			aMemDiscount = 0;
		}
		totalDiscount = mDiscountApp + aMemDiscount;
		//complete total
		double compTotal = preTotal - totalDiscount;
		
		System.out.println("CHECKOUT");
		System.out.println("Room Cost:\t\t" + "$" + baseCost);
		if (mCost == 0) {
		}
		else {
			System.out.println("Meal Cost:\t       " + "+$" +  mCost);
		}
		System.out.println("Preliminary Total Cost:\t" + "$" + preTotal);
		if (aaa == 1) {
			System.out.println("AAA Discount:\t       " + "-$" + aMemDiscount);
		}
		if (member == 1) {
			if (youWon == 1) {
				System.out.println("Club Member Discount:  " + "-$" + mDiscountApp);
			}
			else {
				member = 0;
			}
		}
		if ((member == 0) && (aaa == 0)) {
			System.out.println("No Discounts Applied");
		}
		System.out.println("Total Cost of Booking:\t" + "$" + compTotal);
		
		scan.close();
		
	}

}
