
public class TableauTest {

	public static void main(String[] args) {
		/*
		 * int[] tabInt; tabInt = new int[5];
		 * 
		 * int[] tabInt1 = new int[5]; System.out.println(tabInt1[0]);
		 * 
		 * int[] tabInt2 = { 8, 9, 6, 2, 4, 2, 9 }; System.out.println(tabInt2[6]);
		 * 
		 * tabInt2[6] = 10; System.out.println(tabInt2[6]);
		 * 
		 * tabInt2[0]=2; System.out.println(tabInt2[4]);
		 */

		// declaration de tableau
		int[] tabInt1 = new int[5];
		// ou bien
		int tablInt2[] = new int[5];

		// initialiser un tableau

		int[] tabInt3 = { 1, 2, 3 };

		// acceder a un tableau
		int premierElement = tabInt3[0];
		System.out.println("premierElement");

		// deuxieme element
		int deuxiemeElement = tabInt3[1];
		System.out.println("premierElement");
		// troisieme element

		int troisiemeElement = tabInt3[2];
		System.out.println("premierElement");

		// quatrieme element impossible donc erreur
		// int quatriemeElement =tabInt3[3];
		// System.out.println("premierElement");

		// l indice depasse la taille du tableau
		// donc erreur

		// java.lang.ArrayIndexOutOfBoundsException: 3
		// modifier la valeur dun element du tableau

		tabInt3[0] = 10;
		premierElement = tabInt3[0];
		System.out.println(premierElement);

		// afficher la taille du tableau

		for (int i = 0; i < tabInt3.length; i++) {
			
		}
			System.out.println(tabInt3[deuxiemeElement]);

		// parcours du tableau(1 ere version)

		for (int i = 0; i < tabInt3.length; i++) {
			System.out.println(tabInt3[i]);
		}
		
		//parcours du tableau (2e version)
		System.out.println("Parcours du tableau(2eme version ):");
		
		for (int nb : tabInt3) {
			System.out.println(nb);
		}
		

	}

}
