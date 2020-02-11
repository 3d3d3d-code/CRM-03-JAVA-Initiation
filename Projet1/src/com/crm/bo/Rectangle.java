/**
 * 
 */
package com.crm.bo;

/**
 * @author reda
 * @version 1.0
 * @updated 05-févr.-2020 09:06:48
 *la class rectangle est la classe metier
 */
public class Rectangle {

	private int longueur;
	private int largeur;

	/**
	 * {@}constructeur de l'objet rectangle sans parametres
	 */

	public Rectangle() {

	}

// Constructeur avec parametres
	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

//Creation des getters et setters
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

	// Creation methode affichache du perimetre

	public void afficherPerimetre() {

		System.out.println(" le perimetre du rectangle est de : " + calculPerimetre() + "cm");
	}
	// Creation méthode

	public void afficherSurface() {
		System.out.println("la surface du rectangle est de :  " + calculSurface() + "cm2");
	}

	public int calculPerimetre() {
		return (longueur + largeur) * 2;
	}

	public String calculPerimetre(String unite) {
		return this.calculPerimetre() + unite;

	}

	public int calculSurface() {
		return (longueur * largeur);
	}

	// comparer la surface des 2 rectangles
	public boolean compareRectangle(Rectangle rect) {
		if (this.calculSurface() > rect.calculSurface()) {
			System.out.println("le rectangle 1 est plus grand que le rectangle 2");

			return true;
		} else if (this.calculSurface() < rect.calculSurface()) {

			System.out.println("le rectangle 1 est different");
		}
		return false;

	}
}
