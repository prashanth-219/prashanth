package scannertask;

import java.util.Scanner;

public class Numberclassifier {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter an integer:");
	   scan.next();
	   String integer = scan.next();
	   
	   int number = 0 ;
	if(number > 0) {
		System.out.println("The number is positive.");
	}
	else if(number < 0) {
		System.out.println("The number is negative.");
	}
	else {
		System.out.println("The number is zero.");
	}
	}

}


