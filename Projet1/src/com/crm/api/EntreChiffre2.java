package com.crm.api;

import java.util.Scanner;

public class EntreChiffre2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre SVP");
		int chiffre = sc.nextInt();

		switch (chiffre) {
		case 1:
			System.out.println("vous etes debutant");
			break;
		case 2:
			System.out.println(" cest bien");
			break;
		case 3:
			System.out.println(" cest bien");
			break;
		case 4:
			System.out.println(" cest bien");
			break;
		case 5:
			System.out.println(" cest bien");
			break;
		case 6:
			System.out.println(" cest bien");
			break;
		case 7:
			System.out.println(" cest bien");
			break;
		case 8:
			System.out.println(" cest bien");
			break;
		case 9:
			System.out.println(" cest bien");
			break;
		default:
			System.out.println("c est pas ça");
			sc.close();
		}

	}
}
