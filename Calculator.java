import java.util.Scanner;
public class Calculator
{
	public static void main(String[]args)
	{
		char operator;
		double number1;
		double number2;
		double result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose an Operator: +,-,/,*");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter number1:");
		number1 = sc.nextDouble();
		
		System.out.println("Enter number2:");
		number2 = sc.nextDouble();
		
		switch(operator)
		{
			case '+':
			result = number1+number2;
			System.out.println("result is:"+result);
			break;
			
			case '-':
			result = number1-number2;
			System.out.println("result is:"+result);
			break;
			
			case'/':
			result = number1/number2;
			System.out.println("result is:"+result);
			break;
			
			case'*':
			result = number1*number2;
			System.out.println("result is:"+result);
			break;
			
		}
	}
}