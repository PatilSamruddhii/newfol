public class CalculateRectangle
{
	public int AreaOfRectangle(int s1, int s2)
  {
	int result = s1*s2;
	System.out.println("Area of Rectangle:"+result);
	return result;
  }
  public static void main(String[]args)
  {
	  CalculateRectangle obj = new CalculateRectangle();
	  obj.AreaOfRectangle(60,34);
  }

}