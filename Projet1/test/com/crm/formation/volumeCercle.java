/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

import com.crm.api.Utils;

/**
 * @author CRM
 *
 */
public class volumeCercle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double R;
		double volume;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("entrer le rayon! ");
		R=sc.nextDouble();
		volume=Utils.volumeCercle(R);
		
		System.out.println(volume);
		
		
		System.out.println("le rayon est de");
		
		// TODO Auto-generated method stub
		
		
		

	}

}
