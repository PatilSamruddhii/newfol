import java.util.Scanner;

 public class CalculateTotalAmount
 { 
		static double interest_amount_result;
		static double total_amount_result;
		static double loan_amount;
	 
	public static double interestCalculator()
	{
		interest_amount_result = loan_amount*12/100;
     
		total_amount_result = loan_amount + interest_amount_result;
	 
		System.out.println("interest amount:"+interest_amount_result);
		System.out.println("total amount:"+total_amount_result);
		return total_amount_result;
	}
	
	public static void main(String[]args)
	{
	 
	 System.out.println("enter loan_amount:");
	 
	 Scanner sc = new Scanner(System.in);
	 
	 loan_amount = sc.nextDouble();
	 System.out.println("you have entered loan amount:"+loan_amount);
	 
	 interestCalculator();
	}
 }