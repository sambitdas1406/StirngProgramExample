package string1;

import java.util.Scanner;
////////Enter a string and calculate length without using in build method or function
public class Test3 {

	public static void main(String[] args) 
	{ 
      Scanner sc=new Scanner(System.in); 
      System.out.println("enter a string:");
      String s1=sc.next();
      int j=0;
      
      for(int i=s1.length();i>0;i--)
      {
    	  j++;
    	  
      }
      System.out.println(j);

	}

}
