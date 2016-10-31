/**
 * 
 */
package pkgCollege;

import java.util.Scanner;

/**
 * @author twats
 *
 *This is for Challenge 2 of the lynda course "Java Essential Training for STudents" by Peggy Fisher
 *
 *OBJECTIVES:
 *Compute yearly cost of college. Consider the following:
 *	Dorm or commuting?
 *		Dorm: Duration of stay
 *			  Cost per week for dorm
 *			  living expenses
 *
 *      All:  Name
 *      	  sophmore, fresh, etc
 *            Cost of supplies (books, etc)
 *            number credit hours
 *            cost per credit hour
 * 
 * Write separate methods for each request, and only use the main method to call the others
 * 
 */
public class CostApp {

	/**
	 * @param args
	 */
	static String name;
	static int numCreditHours;
	static double costCreditHours;
	static Scanner sc = new Scanner(System.in);
	static double costSupplies;
	
	public static void main(String[] args) {
		
		double dormCostTotal = 0.;
		String standing;
		String inputText;
		double eduCost = 0.;
		
		// Dorm costs
		dormCostTotal = DormCosts();
		
		// Get academic standing
		System.out.println("Please enter standing (freshman, sophomore, junior, senior)");
		try {
			inputText = sc.next();
		}
		catch (Exception e) {
			System.out.println("you must be a freshman");
			inputText = "freshman";
		}
		
		standing = getStanding(inputText);
		
		// Get student's name
		name = getName();
		
		// Get educational costs
		eduCost = creditCost();
		
		System.out.println("Thanks, "+name+".");
		System.out.println("Your standing is " + standing+".");
		System.out.println("Your Lodging will cost $" + dormCostTotal);
		System.out.println("your education expenses are $" + eduCost);
				
		
	}

	
	
	
	public static double DormCosts() {
		int numWeeks = 0;
		double costWeek = 0.; 
		double expensesWeek = 0.;
		int dormChoice = 0;
		
		System.out.println("Will you be staying on campus or commuting?");
		System.out.println("Enter 1 for Dorm, 2 for Commuting");
		
		// Try catch to make sure integer was entered for dorm/commuting
		try {
			dormChoice = sc.nextInt();
		}
		catch (Exception e) {
			System.err.println("invalid entry. exiting program");
			System.exit(1);
		}
		// If staying in dorm, calculate cost based on num weeks, boarding expenses, and other living expenses.
		if (dormChoice == 1) {
			
			System.out.println("Please enter length of stay in weeks");
			// try-catch to make sure an integer is entered
			try {
				numWeeks = sc.nextInt();
			}
			catch (Exception e) {
				System.err.println("invalid entry. exiting program");
				System.exit(1);
			}
			
			System.out.println("Please enter boarding cost per week");
			
			// Try catch to make sure cost is entered (not text, etc)
			try {
				costWeek = sc.nextDouble();
			}
			catch (Exception e) {
				System.err.println("Invalid entry. exiting program");
				System.exit(1);
			}
			
			// Try catch to make sure other expenses are correct data type
			System.out.println("please enter other living expenses per week");
			try {
				expensesWeek = sc.nextDouble();
			}
			catch (Exception e) {
				System.err.println("invalid entry. exiting program");
				System.exit(1);
			}
			
		}
		else if (dormChoice == 2) {
			numWeeks = 0;
			costWeek = 0.;
			expensesWeek = 0.;
		}
		else if (dormChoice > 2) {
			System.out.println("nope... didn't follow the rules.. you must live with your parents");
			System.out.println("but that's ok.. at least it's cheap! Dorm cost is zero dollars and your dignity");
		}
		
		double total = numWeeks*(costWeek + expensesWeek);
		return total; 
	}
	
	public static String getStanding(String inputText) {
		String outputText;
		String myMessage = "Please enter standing (freshman, sophomore, junior, senior)";
		//System.out.println(myMessage);
		
		if ( !( myMessage.contains(inputText.toLowerCase()) ) ) {
			outputText = "Smartass";
		}
		else {
			outputText = inputText;
		}
		
		return outputText.toLowerCase();
	}
	
	public static String getName() {
		System.out.println("Enter your name");
		try {
			name = sc.next();
		}
		catch (Exception e) {
			name = "dumbass who can't type";
		}
		return name;
	}
	
	public static double creditCost() {
		System.out.println("enter number of credit hours to take");
		numCreditHours = sc.nextInt();
		System.out.println("enter cost per credit hour");
		costCreditHours = sc.nextDouble();
		System.out.println("enter cost of school supplies");
		costSupplies = sc.nextDouble();
		
		return (numCreditHours*costCreditHours + costSupplies);
	}
	
}
