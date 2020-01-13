package com.crm.api;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class NombrePair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Entrez un nombre");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int rest = p % 2;
		if (rest == 0) {
			System.out.println("CE NOMBRE EST PAIR");
		} 
		
		else {
			System.out.println("ce nombre est impair");
		}
		sc.close();
	}

}
