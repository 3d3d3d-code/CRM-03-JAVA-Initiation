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
		

		

		// TODO Auto-generated method stub

	}

}
