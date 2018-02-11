package string1;

import java.util.Scanner;
////check a  string it is equal or not

public class Test4 
{

	 public static void main(String[] args) 
	 { 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter  first String:");
	 String s1=sc.next();
	 System.out.println("Enter  second String:");
	 String s2=sc.next();
	 if(s1.equals(s2))
	 {
		 System.out.println("Equal String:");
	 }
	 else 
	 {
		 System.out.println("Unequal String");
	 }
	 }

}
