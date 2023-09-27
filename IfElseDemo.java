import java.util.Scanner;
public class IfElseDemo
{
	public static void main(String[]args)
	{
	 System.out.println("enter marks in number");
	 
	 Scanner sc = new Scanner(System.in);
	 
	 int marks = sc.nextInt();
	 
	 System.out.println("you have entered marks:"+marks);
	 
	 if(50<=60)
	 {
		 System.out.println("grade C");
	 }
	 else if(61<=70)
	 {
		 System.out.println("grade B");
	 }
	 else if(71<=80)
	 {
		 System.out.println("grade A");
	 }
	 else if(81<=100)
	 {
		 System.out.println("grade A+");
	 }
	 else
	 {
		 System.out.println("false");
	 }		 
	 
	}
}