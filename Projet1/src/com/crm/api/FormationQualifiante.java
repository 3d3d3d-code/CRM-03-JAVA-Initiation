package com.crm.api;

import java.util.Scanner;

public class FormationQualifiante {

	public static void main(String[] args) {
		final char CDA = 'c';
		final char DWM = 'd';
		final char REORIENTATION = 'r';
		final char ENCOURSDEREFLEXION = 'e';

		char choix;

		Scanner sc = new Scanner(System.in);

		System.out.println("taper un choix");
		choix = sc.nextLine().charAt(0);

		switch (choix) {
		case CDA:
			System.out.println("vous allez en CDA");
			break;
		case DWM:
			System.out.println("");
			
		}

	}

}
