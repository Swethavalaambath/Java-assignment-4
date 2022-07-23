package stringsandarrays;
import java.lang.String;

public class Stringexample {
		public static void main(String[] args) {
			
			
			String s1="hello"; 
			String s2="whatsup"; 
			System.out.println("string length is: "+s1.length());  
			System.out.println("string length is: "+s2.length()); 
			s1=s1.concat("how are you");
			System.out.println(s1);
			System.out.println(s1+"how are you");         
			System.out.println(s1.trim()+"how are you");
			int value=20; 
			String s3=String.valueOf(value); 
			System.out.println(s3+17);
			
			
			
		}

	}


