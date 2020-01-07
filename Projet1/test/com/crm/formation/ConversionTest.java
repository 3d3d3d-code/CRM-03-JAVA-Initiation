/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class ConversionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int x= 123456;
		long y=x;
		
		
		System.out.println(x);
		
		
		int x1=65537;
		short z = (short) x;
		System.out.println(x1);
		
		int x2 =-125;
		short w=(short) x2;
		System.out.println(x2);
		
		long L1 =123456789;
		long L2= 123456788;
		
		float f1= L1;
				
		float f2= L2;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(L1-L2);
		System.out.println(f1-f2);
		
		System.out.println(L1+"\n"+L2);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
