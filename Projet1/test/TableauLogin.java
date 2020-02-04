import java.util.Scanner;

/**
 * 
 */

/**
 * @author reda
 *
 */
public class TableauLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int j = 0;
		Scanner sc = new Scanner(System.in);
		// declaration et initialisation tableau
		String[][] tab = { { "lapin", "loup", "girafe", "ours" }, { "123", "234", "345", "456" } };

		// demander le nom de l animal

		System.out.println("nom de l'animal");
		String animal = sc.nextLine();
		System.out.println("taper le mdp");
		String mdp1 = sc.nextLine();
		// parcourir le tableau
		for (int i = 0; i < tab[0].length; i++) {
			// verifier si le tableau
			if (animal.equalsIgnoreCase(tab[0][i])) {
				String mdp = tab[1][i];
//if (animal !=(tab[0][i])) {System.out.println();}
				if (mdp.equals(mdp1)) {
					System.out.println("connexion réussie ");

					return;

				}
				while (mdp != mdp1 && j < 2) {

					// que faire si le mdp est erroné
					System.out.println("mot de passe érroné, retaper le mdp");
					mdp1 = sc.nextLine();
					j++;
					if (mdp.equals(mdp1)) {
						System.out.println("connexion réussie ");
						return;
						
					}
				}
			
				

			
			}

		}
	}
}
