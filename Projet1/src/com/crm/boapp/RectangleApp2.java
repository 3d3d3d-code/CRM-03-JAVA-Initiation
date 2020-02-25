package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class RectangleApp2.
 */
public class RectangleApp2 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// demander la couleur du rectangle
		int longueur;
		int largeur;
		int longueur2;
		int largeur2;
		System.out.println("entrer la longueur du rectangle");

		longueur = sc.nextInt();
		System.out.println("entrer la largeur du rectangle");
		largeur = sc.nextInt();

		System.out.println("entrer la longueur du 2eme rectangle");
		longueur2 = sc.nextInt();
		System.out.println("entrer la largeur du 2eme rectangle");
		largeur2 = sc.nextInt();

		Rectangle rect = new Rectangle(longueur, largeur);// premiere instance de l'objet

		Rectangle rect2 = new Rectangle(longueur2, largeur2);// 2eme instance de l'objet

		rect.afficherPerimetre();
		rect.afficherSurface();
		rect2.afficherPerimetre();
		rect2.afficherSurface();

		rect.compareRectangle(rect2);

		sc.close();

	}

}
