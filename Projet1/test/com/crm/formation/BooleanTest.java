/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class BooleanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = bool1 && bool2;
		boolean bool4 = bool1 || bool2;
		boolean bool5 = bool1 & bool2;
		boolean bool6 = bool1 | bool2;
		boolean bool7 = bool1 ^ bool2;
		short nb1, nb2, nb3, nb4;
		nb1 = 1;
		nb2 = 2;
		nb3 = 3;
		nb4 = 7;

		boolean bool8 = nb1 > nb2;
		boolean bool9 = (nb1 == nb2);
		boolean bool10 = bool8 || bool9;

		System.out.println(bool10);

		System.out.println(bool6);
		System.out.println(bool7);
		System.out.println(bool8);
		System.out.println(bool9);

		// TODO Auto-generated method stub

	}

}
