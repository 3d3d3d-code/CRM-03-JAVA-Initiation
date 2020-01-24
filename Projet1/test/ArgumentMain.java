/**
 * 
 */

/**
 * @author reda
 * @version 1   
 * comment placer un argument dans un tableau
 */
public class ArgumentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("La taille du tableau args est : " + args.length);
		for (String str : args) {
			System.out.println(str);
		}
	}

}
