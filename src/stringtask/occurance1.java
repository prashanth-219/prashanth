package stringtask;

import java.util.Scanner;

public class occurance1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String w="inheritance used  extend key word";
		
		int p1=w.length();//totall length
		int p2= w.replace("e","").length();//remove length
      
      int count=p1-p2;
     System.out.println("count string:"+count);
	}
}





