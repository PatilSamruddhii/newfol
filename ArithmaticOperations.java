class ArithmaticOperations

{
	static int a = 10;
	static int b = 50;
	
	public void sum()
	{
		int result=a+b;
		System.out.println("additionn is:"+result);
	}
	
	public void substraction()
	{
		int result=a-b;
		System.out.println("substraction is:"+result);
	}
	
	public void multiflication()
	{
		int result=a*b;
		System.out.println("multiflication is:"+result);
	}
	
	public void division()
	{
		int result=a/b;
		System.out.println("division is:"+result);
	}
	
	  public static void main(String[]args)
	{
	
	 ArithmaticOperations obj = new ArithmaticOperations();
	  obj.sum();
	  obj.substraction();
	  obj.multiflication();
	  obj.division();
	  
	 
	    
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
