package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

public class RectangleApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// demander la couleur du rectangle
		int longueur;
		int largeur;

		System.out.println("entre la longueur du rectangle");

		longueur = sc.nextInt();
		System.out.println("entrer la largeur du rectangle");
		largeur = sc.nextInt();

		Rectangle rect = new Rectangle(longueur, largeur);

		rect.afficherPerimetre();
		rect.afficherSurface();

		sc.close();

	}

}
