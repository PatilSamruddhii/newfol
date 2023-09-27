public class FinalDemo
{
public static int square(byte a)
{
	int res = a*a;
	return res;
}
public static void main(String[]args)
{
	byte b= 2;
	int a = (byte)b;
	int returnValue=square(b);
	System.out.println(returnValue);
}
}