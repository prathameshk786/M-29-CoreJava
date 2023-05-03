package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		if(num>0) {
			if(num<0) {
				System.out.println("Non-zero number");
			}
			else {
				System.out.println("Number is positive/zero");
			}
		}
		else {
			System.out.println("Number is negative/zero");
		}
	}

}
