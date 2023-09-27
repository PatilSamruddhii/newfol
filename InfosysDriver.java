import java.util.Scanner;
public class InfosysDriver
{
	public static void main(String[]args)
	{
		int age;
		int experience;
		int marks;
		
		System.out.println("enter candidate details:");
		Scanner sc = new Scanner(System.in);
	    age = sc.nextInt();
		experience = sc.nextInt();
		 marks = sc.nextInt();
		System.out.println("On the basis of above details:");
		
		if(age>=40 && experience>=10 && marks>=60)
		{
			System.out.println("Selected!!!!");
		}
		else
		{
			System.out.println("Not selected!!!");
		}
	}
}