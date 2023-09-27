import java.util.Scanner;
public class CalculateSalary
{
 public static double EmployeeSalary(double salary)
     { 
       double result = (salary*45/100*25/100*30/100)-(5/100*25/100);
	   System.out.println("Net salry:"+result);
	   
	    return result;
	 }	
	   
	 public static void main(String[]args)
      { 
	     System.out.println("enter ur salary");
	     Scanner sc = new Scanner(System.in);
	     salary = sc.nextDouble();
	     System.out.println("you have entered salary");
	  }	  
}
	
