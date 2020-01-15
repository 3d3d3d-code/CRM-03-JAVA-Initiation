package com.crm.api;

import java.util.Scanner;


public class EntrerChiffre {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int chiffre = 0;

		System.out.println("Entrez un chiffre SVP");
		chiffre = sc.nextInt();

		if (chiffre >= 0 && chiffre < 5) {
			System.out.println("Vous devez travailler encore");
		} else if (chiffre >= 5 && chiffre <= 10) {
			System.out.println("tout est ok");
		}
		else System.out.println("Ca n'est pas un chiffre");
	}
}
