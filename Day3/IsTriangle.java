package com.flm.conditional;

import java.util.Scanner;

public class IsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();
		int angle3 = sc.nextInt();
		
		if(angle1+angle2+angle3 == 180) {
			System.out.println("Triangle can be formed with these angles");
		}else {
			System.out.println("Triangle cannot be formed with these angles");
		}
		
		
	}
}