class Box
{
	public static int volume(int length, int breadth, int hight)
  {
	int result = length*breadth*hight;
	
	System.out.println("Box voulume:"+result);
     
    return result;
  }

 public static void main(String[]args)
 {
	 volume(4,8,6);
 } 
}