package com.crm.api;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LoginForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login;
		String mdp;
		final String LOGIN = "CRM";
		final String MDP = "CDI1234";

		System.out.println("Entrez le login");
		login = sc.nextLine();
		System.out.println("Taper le mot de passe");
		mdp = sc.nextLine();

		if (login.equals(LOGIN) && mdp.equals(MDP)) {
			System.out.println("COMBIEN DE POGNON VOUS VOULEZ ?");
		} else {
			System.out.println("REVENEZ DEMAIN, PAS DE SOUS AUJOURD'HUI");
		}
		sc.close();

		/*
		 * if (login.equals("CRM")) {
		 * 
		 * System.out.println("login accepté");
		 * 
		 * 
		 * 
		 * if (mdp.equals("CDI1234")) { System.out.println("BIENVENUE"); } else {
		 * System.out.println("si tu me donnes des sous je te laisse rentrer "); }
		 * 
		 * } else { System.out.println("login incorrect ,Entrez le login à nouveau"); }
		 */

	}
}
