/**
 * 
 */
package com.crm.bo;

/**
 * @author reda
 * @version 1.0
 * @updated 05-févr.-2020 09:06:48
 *
 */
public class Rectangle {

	private int longueur;
	private int largeur;

//constructeur de l'objet rectangle
	public Rectangle() {

		longueur = 0;
		largeur = 0;

	}

	public Rectangle(int longeur, int largeur) {
		this.longueur = longeur;
		this.largeur = largeur;
	}

	/**
	 * @return the longueur
	 */
	public int getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void afficherPerimetre() {

		System.out.println(" le perimetre du rectangle est de : " + (longueur + largeur) * 2 + "cm") ;
	}
	
	public void afficherSurface() {
		System.out.println("la surface du rectangle est de :  " + (longueur * largeur) + "cm2");
	}
}
