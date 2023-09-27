class Addition
{  
    int a = 60;
    int b = 40;
		
	public void sum()
	{
	    int result = a+b;
		System.out.println("Addittion result is:"+  result);
	}
	
	public void substraction()
	{
        int result = a-b;
		System.out.println("Subtraction is:"+ result);
	}
	
	public static void main(String[]args)
	{
		Addition obj = new Addition();
		obj.sum();
		obj.substraction();
	}
}