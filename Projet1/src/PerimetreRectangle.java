
/**
 * 
 */

/**
 * @author CRM
 *
 */
import java.util.Scanner;

public class PerimetreRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int l = 0;
		int L = 0;
		int perimetre;

		Scanner sc = new Scanner(System.in);// init scanner de l'objet

		System.out.println("saisir la longueur du rectangle :");
		l = sc.nextInt();

		System.out.println("la longueur du rectangle est de : " + l + "cm");

		System.out.println("saisir la largeur du rectangle :");
		L = sc.nextInt();
		System.out.println("la largeur du rectangle est de" + L + "cm");

		perimetre = (l + L) * 2;

		System.out.println(" le perimetre du rectangle est de " + perimetre + "cm");

		// TODO Auto-generated method stub

	}

}
