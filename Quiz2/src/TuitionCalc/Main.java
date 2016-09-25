package TuitionCalc;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	private static double InitialTuitionFee;
	private static double PercentOfIncrease;
	private static double APR;
	private static int Term;
	
	public static void main(String[] args) {
		Tuition.input();
		double Total = TuitionCalculationForm.Calculate(InitialTuitionFee, PercentOfIncrease, APR, Term);
		System.out.printf("The Total Price to Pay Back is %.2f", Total);
		double Monthly = TuitionCalculationForm.Monthly(Total, Term);
		System.out.printf("Total Due Each Month %.2f", Monthly);
	}
	public static class Tuition{
		public static void input() {
			System.out.println("Enter Initial Tuition Fee: ");
			InitialTuitionFee = scan.nextDouble();
			System.out.println("Eneter Percent of Increase on Tuition: ");
			PercentOfIncrease = scan.nextDouble();
			System.out.println("Enter the Repayment APR: ");
			APR = scan.nextDouble();
			System.out.println("Enter Term for Loan: ");
			Term = scan.nextInt();
		}
	}
}
