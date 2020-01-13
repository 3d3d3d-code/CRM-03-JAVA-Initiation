package com.crm.formation;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 * @return 
	 
	 */
	public static  void main(String[] args) {
		
		String texte;
		texte ="bonjour";
		System.out.println(texte);

		 texte = "au revoir";
		System.out.println(texte);
		
		float dec;
		dec = 25.2F;
		
		System.out.println("donner une decimal "+ dec);
		
		
		String str = "java c'est c'est genial!!";
		System.out.println("le nombre de caracteres est de " + str.length( ));
//mettre en majuscule
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
		String str2 = str.replace('a', 'e');
		System.out.println(str2);
		
		//comparaison de chaines
		String chaine1="test";
		String chaine2="TEST";
		System.out.println(chaine1.equals(chaine2));
		
		// ou bien
		
		System.out.println(chaine1.equalsIgnoreCase(chaine2));
		
	
		
		
		
		/*int index = 0;
		int str3 = str.hashCode();
		//compter les caractères
		System.out.println (texte.length());
		// Mettre en majuscule
		String str2 =texte.toUpperCase();
		System.out.println(str2);
		//Suppression des blancs
		String str3 = texte.replaceAll(" ", "");
		System.out.println(str3);
		//remplacer des caractères
		String str4 = texte.replace('e', 'a');
		System.out.println(str4);
		//Extraction d'une sous chaine
		String str5 = texte.substring(0, 4);
		System.out.println(str5);*/

		

		// TODO Auto-generated method stub

	}

}
