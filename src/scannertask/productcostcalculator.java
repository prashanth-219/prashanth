package scannertask;

import java.util.Scanner;

public class productcostcalculator {
	
	private static final double Price = 0;
	private static final String Totalcost = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        final double priceperunit = 10.0;
        final double discountpercentage = 10.0;
        System.out.println("Enter the quantity ordered:");
        int Quantity = scan.nextInt();
        
        double totalcost;
        if(Quantity < 10) {
        	totalcost = Price * priceperunit;
        }
        else
        {
        	double discountedprice = priceperunit - (priceperunit * discountpercentage / 100);
        	totalcost = Quantity * discountedprice;
        }
        System.out.println("Total cost for "+ Quantity +" units:"+ Totalcost +"/-");
	}

}


