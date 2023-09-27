class AssignmentOperator
{
	public static void main (String[]args)
{
	byte a = 70;
	byte b = 40;
	
	int res1 = a+=b;
	int res2 = a-=b;
	int res3 = a*=b;
	int res4 = a%=b;
	int res5 = a/=b;
	
    System.out.println("res1:"+res1);
	System.out.println("res2:"+res2);
	System.out.println("res3:"+res3);
	System.out.println("res4:"+res4);
	System.out.println("res5:"+res5);
 }
}
