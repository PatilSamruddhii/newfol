import java.util.Scanner;
public class LeapYear
{
	public static void main(String[]args)
	{
		int year;
		System.out.print("entered year :");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		System.out.println("Enterd year is:");
		if(year % 4==0)
		{
		  if(year % 100==0)
			{
				if(year % 400==0){
					System.out.println("leap");
				}
				else
				{
					System.out.println("not leap");
				}
			}
			else
			{System.out.println("leap");}
		}else
		{System.out.println("not leap");}
	}
}