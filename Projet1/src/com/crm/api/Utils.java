package com.crm.api;

public class Utils {

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
		
		double pi = 3.14;
		double aire =  pi * R * R;
		return aire;

	}
	
	public static double volumeCercle(double R) {
		
		
	double	pi = 3.14;
		double volume = 4/3*pi*R*R*R;
		return volume;
		
		
		
	}
}