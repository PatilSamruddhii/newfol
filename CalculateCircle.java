public class CalculateCircle
{
	public static double AreaOfCircle(double radius)
  {
	double result = 3.14*radius*radius;
	
	double result1 = 2*3.14*radius;
	
	System.out.println("Area of circle:"+result);
	System.out.println("circumferance of circle:"+result1);
	return result;
  }
  
  public static void main(String[]args)
  {
	  AreaOfCircle(7);
  }
}