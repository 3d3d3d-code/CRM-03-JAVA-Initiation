package com.crm.api;

import java.ramdom;
import java.util.Scanner;

public class NombreAleatoire {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nbDeviner = 5;
		int nb = 0;
		int compt = 0;
		System.out.println("entrer un nombre entre 1 et 10");
		while (nb != nbDeviner && compt < 3) {

			nb = sc.nextInt();
			compt++;
			if (nb == nbDeviner) {
				System.out.println("super tu as trouvé en " + compt + " essais");
			} else if (compt >= 3) {
				System.out.println("tu as perdu");

			} else {

				System.out.println("Cherchez encore");

			}

		}

	}
}
