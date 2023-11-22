package stringtask;

import java.util.Scanner;

public class countwords {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
		String d=sc.nextLine();//
		int count=1;
		int m=d.length();//9
		for(int i=0;i<m-1;i++)//how  are you          
		{
		if((d.charAt(i)==' ')&&(d.charAt(i)==' ')||(d.charAt(i)!=' '))
		{
			count++;
	
}
		
			
		}
		System.out.println("count the string:"+count);

	}
}


