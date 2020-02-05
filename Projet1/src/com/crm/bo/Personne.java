/**
 * 
 */
package com.crm.bo;

import java.util.Date;

/**
 * 
 * @author reda
 * @version 1
 * @since 3/02/20
 */

//Attributs
public class Personne {

	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// creation constructeur

	public Personne() {

		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("construction d'un objet");
	}

	public Personne(String nom, String prenom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	// Methodes

	/**
	 * @return la methode getNom renvoi la valeur de l'attribut nom
	 */

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void afficherDetail() {

		System.out.println( nom  + " " +  prenom );
	}

}
