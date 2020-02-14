package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Voiture;

public class VoitureApp {

	public static void main(String[] args) {
		// creation d'objets

		Voiture voit = new Voiture("ford", "bleu", 5, "automatique", 25000);

		Voiture voit1 = new Voiture("bird", "rouge", 3, "manuel", 10000);

		Scanner sc = new Scanner(System.in);

		System.out.println("voulez vous demarrer la voiture ? (oui/non)");
		String choix = sc.nextLine();

		if (choix.equalsIgnoreCase("oui")) {
			System.out.println("quel type de route voulez vous prendre?(autoroute/nationale/village");
			String choix3 = sc.nextLine();

			if (choix3.equals("autoroute")) {

				voit.setAutoroute(true);
				voit.setNationale(false);
				voit.setVillage(false);

				System.out.println("vous ne devez pas depasser les 130km/h ");
			} else if (choix3.equals("nationale")) {
				voit.setAutoroute(false);
				voit.setNationale(true);
				voit.setVillage(false);

				System.out.println("vous ne devez pas depasser les 80 km/h");

			} else if (choix3.equals("village")) {
				voit.setAutoroute(false);
				voit.setNationale(false);
				voit.setVillage(true);

				System.out.println("vous ne devez pas depasser les 30 km/h");

			} else {
				System.out.println("veuillez repreciser svp");
				return;
			}

			voit.setEtat(true);
			System.out.println("la voiture demarre" + voit.toString());
			while (voit.getEtat() == true) {
				System.out.println("que voulez vous faire?");
				String choix2 = sc.nextLine();
				switch (choix2) {
				case "klaxonner":
					voit.klaxonner();
					break;
				case "arreter":
					voit.setEtat(false);
					break;

				case "ralentir":
					System.out.println("de combien voulez vous ralentir ?");
					int vitesse = Integer.parseInt(sc.nextLine());
					voit.ralentir(vitesse);
					System.out.println("votre vitesse est de " + voit.getVitesse() + " km/h");
					
				case "accelerer":
					
					System.out.println("de combien voulez vous accelerer? ");
					vitesse = Integer.parseInt(sc.nextLine());
					voit.accelerer(vitesse);
					System.out.println("votre vitesse est de " + voit.getVitesse() + " km/h");
					
					if (getVitesse()<50) {
						System.out.println("vous devez etre a moins de 50 km/h");
					}

				}
			}

		}

		else {
			System.out.println("restez chez vous");

		}
	}

	private static int getVitesse() {
		// TODO Auto-generated method stub
		return 0;
	}
}
