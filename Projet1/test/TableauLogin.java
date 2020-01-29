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
				if (mdp.equals(mdp1)) {
					System.out.println("connexion réussie yo");
				}else {
						System.out.println("mot de passe érroné, retaper le mdp");
						mdp=tab[1][i]=sc.nextLine();
						
					}
				}
			}
		}

	}


