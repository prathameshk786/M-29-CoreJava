package org.tnsif.looping;

import java.util.*;

public class NestedForLoopProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows ");
		int r = s.nextInt();
		System.out.print("Enter number of columns ");
		int c = s.nextInt();
		
		for(int i = 1; i<=r; i++) {
			for(int j = 1; j<=c; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
