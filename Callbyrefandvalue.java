package stringsandarrays;

public class Callbyrefandvalue {
	
	public static void main(String[] args) {
		int number =25;int[]value= {125,127};
	
	System.out.println("before calling display method number="+number);
	display(number);
	System.out.println("after calling display method number=" +number);
	displayarray(value);
	System.out.println("after calling display array method value is:"+ value[0]);}
	
 private static void display(int num)
	{
	System.out.println("inside display method"+ num);
	num=100;
	System.out.println("inside display method="+ num);}
	

  private static void displayarray(int[] value)
	{
	System.out.println("inside displayarray method first element is" +value[0]);
	value[0]=100;
	System.out.println("Inside display array method first element is modified to " +value[0]);
	
	}
	
}

	

	

	
