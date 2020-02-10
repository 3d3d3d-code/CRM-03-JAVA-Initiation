/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Personne;

/**
 * @author reda
 *
 */
public class PersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creation d'un objet
		Personne pers = new Personne();
		pers.surnom = "joe";
		pers.setNom("charih");
		pers.setPrenom("khalil");
		System.out.println("bienvenue " + pers.getNom() + " " + "(" + pers.surnom + ")" + " " + pers.getPrenom());

		Personne pers1 = new Personne();
		pers1.setNom("hamza");
		pers1.setPrenom("reda");
		Personne pers3 = new Personne();
		pers3.afficherDetail();
		Personne pers4 = new Personne("bob", "dylan");
		
		// aller chercher afficher detail sur la classe Personne

		pers4.afficherDetail();
		pers4.afficherDetail("en");
		pers4.afficherDetail("it");

	}

}
