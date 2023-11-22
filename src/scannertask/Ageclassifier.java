package scannertask;

import java.util.Scanner;

public class Ageclassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scan.nextInt();
       
        
        String category;
        
        if(age >= 0 && age <= 12) {
        	category = "Child";
        }
        else if(age >= 13 && age <= 19) {
        	category = "teenager";
        }
        else if(age >= 20 && age <= 64) {
        	category = "adult";
        }
        else
        {
        	category = "senior";
        }
        System.out.println("you are a " +category+".");
        
	}

}

