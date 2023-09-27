public class IfElseDemo4
{
	public static void main(String[]args)
	{
	  int n1=89;
	  int n2=178;
	  int n3=94;
	  int n4=100;
	  
	  if(n1<n2 && n1<n3 && n1<n4)
	  {
		  System.out.println("smaller number is n1");
	  }
	  else if(n2<n1 && n2<n3 && n2<n4)
	  {
		  System.out.println("smaller number is n2");
	  }
	  else if (n3<n1 && n3<n2 && n3<n4)
	  {
		  System.out.println("smaller number is n3");
	  }
	  else 
	  {
		  System.out.println("smaller number is n4");
	  }
	}
}
  