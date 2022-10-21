/*Q.3..Write a Java method to compute the future investment 
value at a given interest rate for a specified number 
of years. 

Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Output:
Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31
*/

package Lab_21Oct;

import java.util.Scanner;

public class CompoundInterest {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		// Prompt the user to enter the investment amount and interest rate
		System.out.print("Input the investment amount : ");
		double amount = input.nextDouble();
		System.out.print("Input the rate of interest : ");
		double annualInterestRate = input.nextDouble();
		System.out.println("Input no of years  : ");
		int no = input.nextInt(); 

		// Get monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Print a table that displays future value for the years from 1 to 30
		System.out.println("Years     Future Value"); // Table header
		for (int years = 1; years <= no; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyInterestRate, years));
		}
	}

	//Method futureInvestmentValue computes future investement value 
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}