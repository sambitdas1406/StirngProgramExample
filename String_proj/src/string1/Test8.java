package string1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) 
	{
     int upper = 0 ,lower = 0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a character:");
     String s1=sc.nextLine();
     for(int i=0;i<s1.length();i++)
     {
    	 if(s1.charAt(i)>65 && s1.charAt(i)<91)
    	 {
    		 upper++;
    		// System.out.println("upper character are:"+s1.charAt(i));
    	
    	 }
    	 else
    	 {
    		 lower++;
    		 //System.out.println("lower character are:"+s1.charAt(i));
    	 }
     }
     System.out.println("----------------------------------------------------");
     System.out.println("upper character"+upper);
     System.out.println("lower character"+lower);

	}

}
