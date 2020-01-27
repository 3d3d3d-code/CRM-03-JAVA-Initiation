import java.util.Scanner;

public class SommeElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tab1[] = { 56, 2, 7, 4 };
		int somme = SommeElement.sommeElementTableau(tab1);
		System.out.println(somme);

		int tab2[] = {2,5,6,3,};
		
		System.out.println("taper un nombre");
		tab2=sc.nextInt();
		somme= sommeElementTableau(tab2);
			System.out.println(somme);
		}

	

	/**
	 * Cette méthode calcule la somme de tous les éléments d'un tableau passé en
	 * paramètre
	 * 
	 * @param tab tableau d'entiers
	 * @return la somme de tous les éléments du tableau
	 */
	public static int sommeElementTableau(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
//			somme = somme + tab[i];
			somme += tab[i];
		}
		return somme;

	}

}
