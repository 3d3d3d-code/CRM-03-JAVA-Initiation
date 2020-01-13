package com.crm.api;

import java.util.Scanner;

public class NombreMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int nb1 = 0;
		int nb2 = 0;
		int nb3 = 0;
		System.out.println("Entrez un premier nombre");
		nb1 = sc.nextInt();
		System.out.println("Entrez un second nombre");
		nb2 = sc.nextInt();
		System.out.println("Entrez un troisieme nombre");
		nb3 = sc.nextInt();

		if (nb1 > nb2 && nb1 > nb3) {
			max = nb1;
		} else if (nb2 > nb1 && nb2 > nb3) {
			max = nb2;
		} else {
			max = nb3;
		}

		System.out.println("Le nombre le plus grand est le : " + max);

		sc.close();
	}
}
