package com.flm.conditional;

import java.util.Scanner;

public class DivBy4and100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 4 == 0 && number % 100 == 0) {
			System.out.println("Number is divisible by 4 and 100");
		} else {
			System.out.println("Number is not divisible by 4 and 100");
		}
	}

}
