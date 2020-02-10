/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Rectangle;

/**
 * @author reda
 *
 */
public class RectangleApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		rect1.setLargeur(20);
		rect1.setLongueur(50);
		rect1.afficherSurface();

		System.out.println(rect1.calculPerimetre("cm"));
		Rectangle rect2 = new Rectangle(3, 2);
		rect2.afficherSurface();

		System.out.println(rect2.getLongueur());

		if (rect1.compareRectangle(rect2) == true) {
			System.out.println("rect1 est plus grand que rect2");
		} else {
			System.out.println("rect2 est plus grand que rect1");
		}

	}

}
