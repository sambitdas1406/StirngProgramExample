package string1;
////////////enter a string and check character repeated   occurence of a string 



import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) 
	{int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String:");
     String s1=sc.nextLine();
     System.out.println("Enter a charcter that you want to search:");
     String s2=sc.nextLine();
     for(int i=0;i<s1.length();i++)
     {
    	 String s3=Character.toString(s1.charAt(i));
    	 if(s3.equals(s2))
         {
        	 count++;
        	 
         } 
    	 
     }
     System.out.println("character occurance for given String is----->"+count);
	}

}
