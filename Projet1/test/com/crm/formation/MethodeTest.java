/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class MethodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nb1 = 2;
		int nb2 = 3;
		int s1 = somme(nb1, nb2);
		System.out.println(s1);

		float l = 4;
		float L = 7;
		float P = perimetre(l, L);
		
		System.out.println(P);
	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;

	}

	public static float perimetre(float l, float L) {
		float P = (l + L) * 2;
		return P;

	}
	
	
	// TODO Auto-generated method stub

}
