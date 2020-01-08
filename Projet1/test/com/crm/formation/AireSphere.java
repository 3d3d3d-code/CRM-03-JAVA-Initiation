/**
 * 
 */
package com.crm.formation;

//import java.text.DecimalFormat;
import java.util.Scanner;

import com.crm.api.Utils;



/**
 * @author CRM
 *
 */
public class AireSphere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double R = 0;
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez le rayon de la sphere");
		
		
		

		R = sc.nextDouble();
		System.out.println("le rayon est de" + R);
		double aire = 4*pi*R*R;
		System.out.println("l'aire de la sphere est de :" + aire +" cm2");
		double volume =4/3*pi*R*R*R;
		System.out.println("et son volume est de " + volume +  " cm3");
		
	//	Utils.aireCercle(aire, pi);


		// TODO Auto-generated method stub

	}

}
