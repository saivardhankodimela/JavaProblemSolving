package com.flm.conditional;

import java.util.Scanner;

public class NegPosZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println("Positive number");
		}else if(number<0) {
			System.out.println("Negative number");
		}else {
			System.out.println("Zero");
		}
	}

}
