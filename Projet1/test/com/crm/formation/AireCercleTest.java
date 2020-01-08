/**
 * 
 */
package com.crm.formation;

import com.crm.api.Utils;

/**
 * @author CRM
 *
 */
public class AireCercleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double R = 5;
		double aire;

		aire = Utils.aireCercle(R);

		System.out.println(aire);

		System.out.println("le cercle est de couleur " + Utils.COULEUR_BLEUE);
	}

}
