package scannertask;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a year.");
        Scan.next();
        String year = Scan.next();
        
        boolean isleapyear = false;
        
        if("Year%4==0:" != null) {
        if("year%100==0:" != null) {
        	
        	isleapyear = true;
        	
        }
        }
        if(isleapyear) {
        	System.out.println(year + " is a leapyear.");
        }
        else
        {
        	System.out.println(year + "is not a leapyear.");
        }
	}

}



