/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Primitif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float decimal, fl;
		System.out.println("taper un decimal");
		fl = sc.nextFloat();
		System.out.println("vous avez saisi :" + fl);

		boolean ageBoolean;

		System.out.println("avez vous 21 ans ?(true/false)");
		ageBoolean = sc.nextBoolean();

		if (ageBoolean = true) {
			System.out.println("vous êtes bon pour la casse !");

		} else {

			System.out.println("Vous êtes un gros bébé !");

		}

		int age;

		System.out.println("quel âge avez vous ,");
		int ageBolean = sc.nextInt();
		if (ageBoolean = false) {
			System.out.println("c'est bien grandissez encore ! ");
		}
		else {
			System.out.println("arretez de grandir !");

		}
	}
}


