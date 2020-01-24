/**
 * 
 */

/**
 * @author reda
 *
 */
public class TableauEnParametre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tableau = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		afficherTableau(tableau);
		/**
		 * faire une methode tableau(nommée afficherTableau) nb permet de parcourir tout
		 * le tableau(comme i++) ensuite appeller afficherTableau avec la methode main
		 * 
		 * 
		 */
	}

	public static void afficherTableau(int[] tabInt) {

		for (int nb : tabInt) {
			System.out.println(nb);
		}
	}

}
