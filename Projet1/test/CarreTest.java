import java.util.Scanner;

public class CarreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le coté du carré");
		int coté = sc.nextInt();
		
		int i;
		int j;

		for (i = 0; i < coté; i++) {
			for (j = 0; j < coté; j++) {

				System.out.print(" ");
				System.out.print("a");
			}
			System.out.print("\n");

			sc.close();

		}
	}
}
