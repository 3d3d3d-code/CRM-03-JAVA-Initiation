
public class BreakContinueTest {

	public static void main(String[] args) {
		/** break est là pour finir une operation,
		 *  surtout illustré dans un switch case.(comme x=0 et bien tout s'arrete)
		 * 
		 */
		for(int x=-5; x<=5;x++) {
			if(x==0) {
				System.out.println("division par 0");
				break;
			
			}
			System.out.println("1.0/x");
		}
		/**continue sert à ignorer certaines actions,certaines erreurs quelquefois.
		 * 
		 */
		for(int x=-5; x<=5;x++) {
			if(x==0) {
				System.out.println("division par 0");
				continue;
			
			}
			System.out.println("1.0/x");
		}

	}

}
