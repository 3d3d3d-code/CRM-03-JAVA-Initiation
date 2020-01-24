import java.util.Scanner;

public class CarreTest {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le coté du carré");
		int coté = sc.nextInt();
		//exercice dessiner un carre

		int i;
		int j;

		for (i = 0; i < coté; i++) {
			for (j = 0; j < coté; j++) {

				System.out.print(" ");
				System.out.print("a");
			}
			System.out.println("\n");

			sc.close();

		}
	}
}
