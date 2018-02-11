package string1;

public class Test9 {

	public static void main(String[] args) 
	
	{
     String s1="Hello world";
     int i=s1.length();
     
     char [] ch=new char[i];
     ch=s1.toCharArray();
     for(int j=0;j<i;j++)
     {
    	 System.out.println(ch[j]);
     }
     
	}

}
