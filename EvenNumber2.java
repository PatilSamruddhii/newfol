public class EvenNumber2
{
	public int square(int a)
	{
		System.out.println("square method started!!");
		
		int res = a*a;
		
		
		System.out.println("square method ended!!");
		
		return res;
	}

	
	public static void main(String[]args)
	{
		System.out.println("main method started!!");
		
		EvenNumber2 obj = new EvenNumber2();
		
		int square_result = obj.square(7);
		
		System.out.println("square is:"+square_result);
		
        System.out.println("main method ended!!");
		
	}
	}