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
	
	// Methodes

	/**
	 * @return la methode getNom renvoi la valeur de l'attribut nom
	 */
	public String getNom() {

		return nom;

	}
	public void setNom(String n) {
		nom=n;
	}
	
	public String getPrenom() {
		return prenom;
		
	}
	public void setPrenom(String p) {
		prenom=p;
	}
	
	
	
	public void afficherDetail() {
		
		System.out.println("Votre profil est "+ nom + prenom );
		
		
		
		
	}
	
	

}
