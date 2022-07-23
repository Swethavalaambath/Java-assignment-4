package stringsandarrays;

public class Arrayevenodd {



	public static void main(String[] args) {
		
		
		int array1[]= {1,2,3,4,5,6,7,8,9,10};int even=0;int odd=0;
		
		for(int i=0;i<array1.length;i++)
		{if (array1[i]%2==0)
		{even=even+array1[i];}
		else
		{odd=odd+array1[i];	
		}
		
		}
	System.out.println("sum of even numbers="+even)	;
	System.out.println("sum of odd numbers="+odd);
	}}

