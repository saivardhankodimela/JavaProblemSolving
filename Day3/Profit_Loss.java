package com.flm.conditional;

import java.util.Scanner;

//Write a program to calculate profit and loss on a transaction.  (inputs from scanner class , SellingPrice and CostPrice).
public class Profit_Loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Selling Price :");
		int sellingPrice = sc.nextInt();
		System.out.println("Enter cost Price :");
		int costPrice = sc.nextInt();
		
		int difference = sellingPrice - costPrice;
		if(difference>0) {
			System.out.println("Profit is "+difference+" units");
		}else if(difference<0) {
			System.out.println("Loss is "+difference*-1+" units");
		}else {
			System.out.println("There is neither profit nor loss");
		}
	}

}
