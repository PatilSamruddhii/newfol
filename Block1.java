class Block1
{
 public static void addition(int a, int b)
 {
	 int res = a+b;
	 System.out.println("Addition res:"+res);
	 
 }
 {
	 System.out.println("inside instace block!!");
 }
 public Block1()
 {
	 System.out.println("inside no-arg constructor!!");

 }
 public static void main (String[]args)
 {
	 System.out.println("Inside main!!");
	 addition(20,30);
	 Block1 obj = new Block1();
 }
 
 }
