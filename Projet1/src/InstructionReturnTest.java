
public class InstructionReturnTest {

	public static void main(String[] args) {
		System.out.println("Debut methode main ");
		int nombre = 6;
		afficherListeNombre(nombre);
		System.out.println("Fin methode main ");
	}

	public static void afficherListeNombre(int nb) {
		System.out.println("Debut methode afficherListeNombre ");
		for (int i = 0; i < nb; i++) {
			if (i == 5) {				
				return;
				
			}
			System.out.println(i);
		}
		System.out.println("fin methode afficherListeNombre ");

	}
}
