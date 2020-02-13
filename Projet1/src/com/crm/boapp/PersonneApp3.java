/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author reda
 *
 */
public class PersonneApp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//question nbr de personnes a l'utilisateur
		
		System.out.println("combien y a t il de personnes? "); 
		int nbre ;
		nbre= sc.nextInt();
		
		//je creer un tableau qui contient des objets de type personnes 
		
		// Déclaration des variables
		Personne[] persTab = new Personne[nbre];
		
		for(int i=0;i<persTab.length;i++) {
			//creation parcours tableau pour rajouter une nouvelle personne
			persTab[i]=new Personne();
			System.out.println("rajouter une personne : " );
			
			
			
			
			
		}
		Personne pers1 = new Personne();
		Personne pers2 = new Personne();
		Personne pers3 = new Personne();
		// Initialisation
		pers1.setPrenom("jack ");
		pers1.setNom("london ");
		pers2.setPrenom("rio");
		pers2.setNom("bravo ");
		pers2.surnom = "boss";
		pers3.setPrenom("michaêl ");
		pers3.setNom("Jackson ");
		persTab[0] = pers1;
		persTab[1] = pers2;
		persTab[2] = pers3;
		// Parcours du tableau avec methode afficher detail
		System.out.println("le groupe est composé de : " + persTab.length + " personnes");

		for (Personne p : persTab) {

			p.afficherDetail();

		}
	}
}
