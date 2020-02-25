/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Voiture;

/**
 * @author reda
 * en date de :
 *
 */
public class VoitureApp2 {

	/**
	 * @param args
	 *   
	 */
	public static void main(String[] args  ) {

		Scanner sc = new Scanner(System.in);

		System.out.println("taper la vitesse");
		int setVitesse = sc.nextInt();
		System.out.println("la vitesse est de " + setVitesse + "km/h");
	

	}


}