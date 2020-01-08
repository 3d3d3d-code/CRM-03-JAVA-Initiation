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
		System.out.println("please help me and hunter help you et eventuellement tape le rayon ");
		R=sc.nextDouble();
		volume=Utils.volumeCercle(R);
		
		System.out.println(volume);
		
		
		System.out.println("c est pas ça wech ,reviens demain!");
		
		// TODO Auto-generated method stub
		
		
		

	}

}
