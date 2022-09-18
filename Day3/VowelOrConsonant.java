package com.flm.conditional;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char alphabet = sc.next().charAt(0);
		if (alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u'
			|| alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O' || alphabet=='U') {
			System.out.println("Its a vowel");
		}else {
			System.out.println("Its a Consonant");
		}
	}

}
