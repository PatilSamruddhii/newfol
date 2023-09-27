import java.util.Scanner;
public class IfElseDemo3
{
	public static void main(String[]args)
	{ 
	    Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the marks");
		
		int marks = sc.nextInt();
		
		if(50<=60)
		{
			System.out.println("grade C");
		}
		else if(61<=70)
		{
			System.out.println("grade B");		
		}
		else if (71<=80)
		{
			System.out.println("grade A");
		}
		else if (81<=100)
		{
			System.out.println("grade A+");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}