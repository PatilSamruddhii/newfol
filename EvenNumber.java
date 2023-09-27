public class EvenNumber
{
	static int res;
	static int a , b; 
	public static int addition(int a, int b)
	{
	 // static int res;
	  res =  a + b;  
	 System.out.println(res);
	 //Number();
	  
	  return res;
	}
	

	public static boolean Number(int number)
	{
		if(number %2==0)
		{
			return true;
	    }
	else
	{
		return false;
	}
	}
	
	  public static void main(String[]args)
	{
		
		System.out.println("main method started!!");
		
		addition(3,4);
		
		System.out.println("Addition is:" +res);
          
         boolean obj = Number(res);
		 
		 System.out.println(obj);
		 
		System.out.println("main method ended!!");
		
	}
}