package string1;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{    int [] a=new int[10];
	     int i;
	     
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Decimal  Number:");
	     int n=sc.nextInt();//5
	     for(i=0;n>0;i++)
	     {
	    	 a[i]=n%2;
	    	 n=n/2;
	    	 
	     }
	     
	     System.out.println("Binary of given Number");
	     for(i=i-1;i>=0;i--)
	     {
	    	System.out.println(a[i]);
	    	
	     }
	     
	     
	     
	}

}
