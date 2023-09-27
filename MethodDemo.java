public class MethodDemo
{
  public static void print()
  {
	  System.out.println("print method started!!");
	  System.out.println("Samruddhi");
	  print2();
	  print3();
	  System.out.println("print method ended");
  }
  public static void print2()
  {
	  
	  System.out.println("Tanaji");
  }
  public static void print3()
  {
	  
	  System.out.println("Patil");
  }
  public static void main(String[]args)
  {
	  System.out.println("main method started!!");
	  print();
	  System.out.println("main method ended!!");
  }

}