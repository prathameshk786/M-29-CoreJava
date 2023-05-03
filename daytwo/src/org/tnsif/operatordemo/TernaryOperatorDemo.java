package org.tnsif.operatordemo;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		/*Syntax
		 * (Condition)?"T":"F";
		 */
		String isEven=(5%2==0)? "Even":"False";
		System.out.println(isEven);
	}

}
