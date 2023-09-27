import java.util.Scanner;
public class IfElseDemo1
{
	
	public static void main(String[]args)
	{   
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter number:");
		
         int number = sc.nextInt();

	    System.out.println("entered number is:");
		
		//in number;
		
		if(number>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
	}
}