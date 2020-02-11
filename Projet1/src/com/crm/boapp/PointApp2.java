/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Point;

/**
 * @author reda utiliser le scanner pouyr utilisateur
 * 
 */
public class PointApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int abs = 0;
		int ord = 0;
		int abs2;
		int ord2;
		Point p = new Point(abs, ord);
		Point p2 = new Point(abs, ord);

		System.out.println("taper  abscisse");
		abs = sc.nextInt();
		System.out.println("taper ordonnée");
		ord = sc.nextInt();
	}

}
