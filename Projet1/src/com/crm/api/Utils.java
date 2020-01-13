
// class Utils
package com.crm.api;

public class Utils {

	public static final String COULEUR_BLEUE = "bleue";
	private static final double PI = 0;

	public static float perimetre(float l, float L) {
		float p = (l + L) * 2;
		return p;

	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;

	}

	public static void afficherMessage(String texte) {

		System.out.println(texte);

	}

	public static double aireCercle(double R) {
		// declaration de la constante PI
		final double PI = 3.14;
		double aire = PI * R * R;
		return aire;
	}

	public static double volumeCercle(double R) {

		double PI = 3.14;
		double volume = 4 / 3 * PI * R * R * R;
		return volume;

	}

	public static double airecercle2(double R) {

		double aire = Math.PI * Math.pow(R, 2);
		return aire;

	}

	public static double volumeCercle2(double R) {

		double volume = Math.PI * Math.pow(R, 3);
		return volume;

	}
	
	
		
	}

