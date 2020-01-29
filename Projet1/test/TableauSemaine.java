import java.util.Scanner;

/**
 * 
 */

/**
 * @author reda
 *
 */
public class TableauSemaine {

	/**
	 * @param args
	 * @param
	 */
	public static void main(String[] args) {
		final String LOGIN = "REDA";
		final String MDP = "1234";

		// declaration d'un tableau à 2D

		String[][] tab = { { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" },
				{ "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" } };

		Scanner sc = new Scanner(System.in);

		System.out.println("choisir une langue/enter a language");
		String langue = sc.nextLine();
		// choix du français
		if (langue.equals("français")) {
			System.out.println("entrer le login");
			String login = sc.nextLine();
			if (LOGIN.equalsIgnoreCase(login)) {
				System.out.println("entrer le mot de passe");
				String mdp = sc.nextLine();
				if (MDP.equalsIgnoreCase(mdp)) {

					System.out.println("taper un jour/enter a day");
					String jour = sc.nextLine();
					// parcours du premier tableau
					for (int i = 0; i < tab[0].length; i++) {
						// compare le premier tableau au mot tapé
						if (jour.equals(tab[0][i])) {
							// affiche l element du 2eme tableau correspondant au premier tableau
							System.out.println(tab[1][i]);

							return;
						}
						// si pas de correspondance alors erreur

						if (i == tab[0].length - 1) {
							System.out.println("erreur/mistake");

						}
					}
				}
			}
			// meme chose qu au debut mais pour l'anglais.

		} else if (langue.equals("anglais/english")) {
			System.out.println("enter the login");
			String login2 = sc.nextLine();
			if (LOGIN.equalsIgnoreCase(login2)) {
				System.out.println("enter the password");
				String mdp = sc.nextLine();
				if (MDP.equalsIgnoreCase(mdp)) {
					System.out.println("enter a day");
					String jour = sc.nextLine();
					for (int i = 0; i < tab[1].length; i++) {
						if (jour.equals(tab[1][i])) {
							System.out.println(tab[0][i]);
							return;
						}
						if (i == tab[1].length - 1) {
							System.out.println("erreur/mistake");
						}
					}
				}
			}

		} else {
			System.out.println("choisir français ou anglais");
		}

	}
}