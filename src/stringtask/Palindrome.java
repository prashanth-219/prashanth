package stringtask;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner m = new Scanner(System.in);
        System.out.println("enter string:");
    	String a=m.next();
    	String rev= "";
    	int len=a.length();
    	for(int i=len-1;i>=0;i--)
    	{
    		rev=rev+a.charAt(i);
    		
    	}
    	System.out.println("reverse string:"+" "+rev);
    	if(a.equals(rev))
    			{
    		   System.out.println(a +"palindrome");
    		
    			}
    	else {
    		System.out.println(a+"not palindrome");
    	}
    			
	}

}


