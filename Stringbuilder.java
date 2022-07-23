package stringsandarrays;

public class Stringbuilder {


	public static void main (String[] args)
	{StringBuilder sb = new StringBuilder("trying out stringbuilder,");
	
	System.out.println(sb);
	System.out.println(sb.append(" interesting!"));
	

	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.insert(10, " learning"));
	System.out.println(sb.delete(6, 10));
	System.out.println(sb.reverse());


}}
