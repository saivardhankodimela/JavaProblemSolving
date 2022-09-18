package com.flm.conditional;

import java.util.Scanner;

public class IntegerM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if(m>0) {
			System.out.println("n is 1");
		}else if(m==0) {
			System.out.println("n is 0");
		}else {
			System.out.println("n is '-1'");
		}
	}

}
