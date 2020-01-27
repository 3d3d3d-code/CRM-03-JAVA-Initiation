
public class TableauChaine {

	public static void main(String[] args) {

		String tab[] = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		String jour = tab[6];
		for (int i = 0; i < tab.length; i++) {

			System.out.println(tab[i]);
		}
		String tab1[] = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		String jour1 = tab1[6];
		for (int i=tab.length-1;i>=0;i--) {
			System.out.println(tab1[i]);
			
		}

	}

}
