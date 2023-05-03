package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int songInput = s.nextInt();
		switch(songInput) {
		case 1:
			System.out.println("Calm Down");
			break;
		case 2:
			System.out.println("Players");
			break;
		case 3:
			System.out.println("Perfect");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
