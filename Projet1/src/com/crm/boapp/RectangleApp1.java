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
		
		Rectangle rect1=new Rectangle();
		
		rect1.afficherPerimetre();
		
		Rectangle rect2= new Rectangle(3,2);
		rect2.afficherPerimetre();
		
		System.out.println(rect2.getLongueur());
		
		
		
		

	}

}
