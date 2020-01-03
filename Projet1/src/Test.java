/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Bonjour");
		System.out.println("Comment ça va?");

//		mavariableInt =2;
		int mavariableInt = 2;byte maVariableByte = 25;
		short maVariableShort = -584;
		long maVariableLong = 25555555555l;
		
		{
			
			
			System.out.println(mavariableInt);
			mavariableInt = 10;
			System.out.println(mavariableInt);
			
		}
		float maVariableFloat = 2.5f;
		double maVariableDouble = 2.565654654;
		char maVariableChar1 = 'c';
		char maVariableChar2 =  '\u0059';
		boolean maVariableBool =true;
		String maChaine1= "Mon texte";
		String maChaine2="est super";
		String maChaine3 =maChaine1 + maChaine2;
		
		String maCompilation = maChaine1 + maVariableFloat;
		
	}
	

}
