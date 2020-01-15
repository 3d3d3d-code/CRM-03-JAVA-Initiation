package com.crm.api;

import java.util.Scanner;

public class WhyleEntier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i = 0;
		int somme = 0;
		System.out.println("pliiiiz ant heure euhh numbeurre");
		n = sc.nextInt();
		while (i <= n) {
			somme = somme + i;
			i++;
		}
		System.out.println("la somme des nombres entre 0 et " + n + " est de " + somme);
		sc.close();

	}

}
