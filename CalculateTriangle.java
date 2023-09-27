public class CalculateTriangle
{
	public static int TriangleArea(int h, int b)
  {  	
	int result = 1/2*h*b;
	
	System.out.println("Area of triangle:"+result);
	
	return result;
  }	
	public static void main (String[]args)
	{
		TriangleArea(8,8);
	}
}