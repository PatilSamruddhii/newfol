public class CalculateExpression
{
	public static int Expression(int x, int y)
	{
		int result = (4*x*x + 5*y*y*y)/2*x*y;
		
		System.out.println("result:"+result);
		return result;
	}
	
	public static void main(String[]args)
	{
		Expression(6,7);
	}
}