
public class TableauTest {

	public static void main(String[] args) {
		int[] tabInt;
		tabInt = new int[5];
		
		int[] tabInt1 = new int[5];
		System.out.println(tabInt1[0]);
		
		int[] tabInt2 = { 8, 9, 6, 2, 4, 2, 9 };
		System.out.println(tabInt2[6]);
		
		tabInt2[6] = 10;
		System.out.println(tabInt2[6]);
		
		tabInt2[0]=2;
		System.out.println(tabInt2[4]);

	}

}
