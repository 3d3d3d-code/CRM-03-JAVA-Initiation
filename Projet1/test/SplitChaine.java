/**
 * 
 */

/**
 * @author reda
 *
 */
public class SplitChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strToSplit = "toto,titi,tata";
		String[] tabSplit = strToSplit.split("t");

		for (String str : tabSplit) {
			System.out.println(str);

		}
	}
}
