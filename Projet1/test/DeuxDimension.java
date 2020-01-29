/**
 * 
 */

/**
 * @author reda
 *
 */
public class DeuxDimension {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaration d'un tableau à 2 dimensions
		int[][] tab2d = new int[5][6];

		// TODO Auto-generated method stub
//Declaration avec initialisation
		int[][] tab2dim = { { 2, 6, 58 },
				{ 5, 9, 18 }

		};
		System.out.println("le 3 eme element du tableau 0 est :  " + tab2dim[0][2]);
		System.out.println("le 3eme element du tableau 1 est  : " + tab2dim[1][2]);
System.out.println(tab2d);
System.out.println("la taille du tableau est de :" + tab2dim.length + " car il contient 2 tableaux.");
	System.out.println("nbre de colonnes: " + tab2dim[0].length);
	
	//parcours du tableau
	System.out.println("parcours du tableau");
	for(int i = 0;i<tab2dim.length;i++) {
		for(int j =0;j<tab2dim[i].length;j++) {
			System.out.println("element ["+ i +"]["+j+"] :"+ tab2dim[i][j]);
		}
	}
	}
	
}
