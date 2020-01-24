/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class AssignementTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double total = 0;

		double num = 1;
		double pourcentage = 0.5;
// ancien total = nouveau total + num
		total = total + num;
		System.out.println(total);
// la même chose que le précedent
		total += num;
		System.out.println(total);
// ancien total moins num
		total -= num;
		System.out.println(total);
// 
		total *= pourcentage;

		System.out.println(total);

		total /= 2;

		System.out.println(total);

		// TODO Auto-generated method stub

	}

}
