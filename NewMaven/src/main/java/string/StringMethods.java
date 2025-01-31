package string;

public class StringMethods {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     String a="Hello";
     String c="hello";
     String d="welcome";
     String b="This is a Java program";
     System.out.println(a.charAt(0));
     System.out.println(a.length());
     System.out.println(a.concat(" Gopikrishnan"));
     System.out.println(b.contains("This"));
     System.out.println(b.contains("Hi"));
     System.out.println(c.equals(a));
     System.out.println(a.contains("H"));
     System.out.println(c.equalsIgnoreCase(a));
     System.out.println(c.compareTo(d));
	}

}
