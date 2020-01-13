/**
 * 
 */

//
 //


//
package com.crm.api; //// class aire cercle

/**
 * @author CRM
 *
 */
public class AireCercle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double R = 6;
		double aire;
		

		aire = Utils.aireCercle(R);

		System.out.println(aire);

		//System.out.println("le cercle est de couleur " + Utils.COULEUR_BLEUE);
		System.out.println( aire);
		
		double volume= Utils.volumeCercle2(R);
		
		System.out.println("le volume du cercle est de :" + volume +  " cm3");
	}

}
