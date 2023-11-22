package scannertask;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = scan.nextInt();
        System.out.println("Enter the third integer:");
        int num3 = scan.nextInt();
        int Largest;
        if(num1 >= num2 && num1 >= num3) {
        	Largest = num1;
        }
        else if(num2 >= num1 && num2 >= num3) {
        	Largest = num2;
        }
        else
        {
        	Largest = num3;
        }
        System.out.println("The largest number among "+num1+","+num2+",and"+num3+" is:");
	}

}

