package string1;
////////////////////Enter a String and check it is palindrome or not
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args)
	{
       String s2="";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String :");
       String s1=sc.next();
       for(int i= s1.length()-1;i>=0;i--)
       {
    	   s2=s2+s1.charAt(i);
    	   
       }
       System.out.println(s2);
       if(s1.equalsIgnoreCase(s2))
       {
    	   System.out.println("Entered String is palindrome:");
       }
       else
       {
    	   System.out.println("Entered String is not a palindrome");
       }
       
	}

}
