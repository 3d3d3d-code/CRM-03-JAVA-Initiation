/**
 * 
 */
package com.crm.bo;

import java.util.Vector;

/**
 * @author reda
 *
 */
public class VectorApp {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		Vector/*<Personne> */groupe = new Vector();
		Personne michael = new Personne("Michael" ,"jordan");
		Personne lebron = new Personne("Lebron" ,"james");
		
		groupe.addElement(michael);
		groupe.addElement(lebron);
	
		Personne unBasketteur1 = (Personne)groupe.get(0);
		System.out.println(unBasketteur1.getNom());
		System.out.println("Mon equipe a :"+ groupe.size()+ "joueurs");
		
		Personne kobe = new Personne("kobe","Bryant");
		groupe.addElement(kobe);
		System.out.println("Mon equipe a :"+ groupe.size() + "joueurs");
		System.out.println("Le joueur Lebron james est à la" + (groupe.indexOf(lebron)+1));
		
		lebron.surnom = "The king";
		Personne lebronModif = (Personne)groupe.get(1);
		System.out.println("Le surnom de Lebron james est : " +  lebronModif.surnom);
		
	}

}
