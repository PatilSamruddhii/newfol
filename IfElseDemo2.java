public class IfElseDemo4
{
	public static void main(String[]args)
	{
		int n1=8;
		int n2=553;
		int n3=90;
      if(n1>=n2 && n1>=n3)
	  {
		System.out.println("greater number is n1");
	  }
	  else if(n2>n3 && n2>n1)
	  {
		 System.out.println("greater number is n2");
	  }
	  else
	  {
		  System.out.println("greater number is n3");
	  }
	}
}