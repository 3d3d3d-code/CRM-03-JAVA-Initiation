package com.crm.api;

import java.util.Scanner;

public class ResultatExamen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int note = 0;
		System.out.println("entrez votre note!");
		note = sc.nextInt();

		if (note < 10 && note > 8) {
			System.out.println("Vous devez aller au rattrapage!");
		}else if(note>20) {
				System.out.println("Erreur de saisie");
		} else if (note > 17 && note <= 20) {
			System.out.println("Vous êtes recçu à l'examen avec mention!");
		} else if (note > 10 && note < 17) {
			System.out.println("Vous êtes reçu!");
		} else if (note < 8) {
			System.out.println("Restez chez vous !");
		} else {
			System.out.println("Erreur de saisie !");
		}
		sc.close();
	}}
