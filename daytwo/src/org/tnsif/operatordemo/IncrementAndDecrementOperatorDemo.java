package org.tnsif.operatordemo;

public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		int a = 12, b = 7, c = 3;
		int x = a++;
		++a;
		--b;
		int y = b--;
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(y);
	}

}
