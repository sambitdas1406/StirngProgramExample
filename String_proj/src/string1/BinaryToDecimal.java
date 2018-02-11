package string1;

import java.util.Scanner;

public class BinaryToDecimal 
{
public static void main(String[] args) 
{
	int rem,sum=0,power=0;
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Binary   Number:");
     int num=sc.nextInt();
     while(num!=0)
     {
    	 rem=num%10;
    	 num=num/10;
    	 sum=(int) (sum+rem*Math.pow(2, power));
    	 power++;
    	 
     }
    System.out.println(sum);
	
}
}
