package org.tnsif.looping;

import java.util.*;

public class DoWhileLoopProgram {

	public static void main(String[] args) {
		int i=1;
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		do {
			System.out.print(i + " ");
			i++;
		}while(i<N);
	}

}
