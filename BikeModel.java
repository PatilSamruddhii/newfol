import java.util.Scanner;
public class BikeModel
{
	public static void main(String[]args)
	{
	   int modelNumber;
	   Scanner sc = new Scanner(System.in);
	   modelNumber = sc.nextInt();
	   System.out.println("select model number:2014, 2019, 2020");
	   
	   switch(modelNumber)
	   {
		   case 2014:
		   System.out.println("model based on petrol");
		   break;
		   
		   case 2019:
		   System.out.println("model based on CNG");
		   break;
		   
		   case 2020:
		   System.out.println("model based on diesel");
		   break;
		   
		   default:
		   System.out.println("Invalid Model Number");
	   }
	   
	}
}