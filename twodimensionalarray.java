
package stringsandarrays;
import java.util.Scanner;
public class twodimensionalarray {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows:");
	int rows=sc.nextInt();
	
	//Scanner sc=new Scanner(System.in);
	System.out.println("enter number of columns:");
	int column=sc.nextInt();
	
	
	int array2d[][]=new int [rows][column];
	System.out.println("enter the data");
	
	for (int i=0;i<rows;i++)
	{for (int j=0;j<column;j++)
		
	array2d[i][j]=sc.nextInt();}	
	for (int i=0;i<rows;i++)
	{for (int j=0;j<column;j++)
		{System.out.print(array2d[i][j]);
	}
	System.out.println();
	}}
	
	
	
}


