package com.crm.api;

import java.util.Scanner;

public class ForEntier {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=0;
		
		int somme=0;
		int n=0;
		System.out.println("Entrez un nombre" );//definit le nombre de fois ou la boucle se repetera
		n=sc.nextInt();
		
		for( i=0;i<=n;i++) {
			
			somme=somme+i;
			
			
		
		}
		System.out.println("somme " + somme);
	}

}
