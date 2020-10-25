package app.thikwa.com;

import java.util.Scanner;

/**
 * 
 * @author sgulari
 *
 *         Generic Interest Amount Calculator which can calculate your monthly
 *         payments including principle, interest amounts.
 * 
 *         This has the ability to calculate the monthly interest + principle
 *         amounts by removing the previous monthly principle amount paid.
 *         i.e.., It will accurately calculates the interest amount based on
 *         remaining total principle amount
 */

public class InterestCalculator {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter Amount you want to lend");

		int totalAmountToLend = myObj.nextInt();

		System.out.println("Please Enter The Loan Term In Months");

		int loanTerm = myObj.nextInt();

		int finalLoanTerm = loanTerm + 1;

		double monthlyPrinciplePayment = totalAmountToLend / loanTerm;

		System.out.println("Enter percentage");

		double interestPercentage = myObj.nextDouble();

		System.out.println("Here are the details you gave us :" + "Total Amount To Lend = " + totalAmountToLend
				+ " Loan Term = " + loanTerm + " , Monthly Principle Payment Amount = " + monthlyPrinciplePayment
				+ " ,and Interest Percentage = " + interestPercentage);

		for (int i = 0; i < finalLoanTerm; i++) {

			System.out.println("Month Number = " + i);

			double remainingAmount = (totalAmountToLend - monthlyPrinciplePayment * i);

			System.out.println("Remaining Principle Amount =" + remainingAmount);

			double newTotalAmount = remainingAmount;

			System.out.println("New Total Amount To Lend =" + newTotalAmount);

			double interestAmountPerMonth = (remainingAmount * interestPercentage) / 100;

			System.out.println("Interest Amount For Month number ---> " + i + " is = " + interestAmountPerMonth);

			double totalMonthlyPayment = interestAmountPerMonth + monthlyPrinciplePayment;

			System.out.println("Total Monthly Payment = " + totalMonthlyPayment);

		}

	}

}
