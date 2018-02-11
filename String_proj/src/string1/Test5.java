package string1;

import java.util.Scanner;
///////////////////////enter a string and ignore whitespace

public class Test5 {

	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String:");
     String s1=sc.nextLine();
     for(int i=0;i<s1.length();i++)
     {
    	 if(s1.charAt(i)==' ')
    	 {
    		 
    	 }
    	 else
    	 {
    		 System.out.print(s1.charAt(i));
    	 }
     }
      
     
     
     
     
	}

}
