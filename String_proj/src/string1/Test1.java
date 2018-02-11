////////////////////Reverse a String///////////////////

package string1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args)
	{
     String s2="";
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String:");//sambit
     String s1=sc.next();
     System.out.println(s1.length());//6
     System.out.println("initial value of a String is----->"+s1);
     
     for(int i=s1.length()-1;i>=0;i-- )
     {
    	 s2=s2+s1.charAt(i);
    	 
     }
     System.out.println("reversed value of  string is----->"+s2);
    
     
	}

}
