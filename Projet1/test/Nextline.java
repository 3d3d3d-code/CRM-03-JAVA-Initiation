import java.util.Scanner;



/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Nextline {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int nb ;
		System.out.println("taper un entier");
		String s = sc.nextLine();
		
		int i = Integer.parseInt(s);
		System.out.println(i);

	}

}
