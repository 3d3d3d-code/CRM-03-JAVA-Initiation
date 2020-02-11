/**
 * 
 */
package com.crm.bo;

// TODO: Auto-generated Javadoc
/**
 * The Class Coordonnees.
 *
 * @author reda c'est la clas metier
 */
public class Point {

	/**
	 *
	 * 
	 * @param args the arguments
	 */

	private int abs;
	private int ord;

	// constructeur

	public Point() {

	}

	// construction avec parametres
	public Point(int x, int y) {
		abs = x;
		ord = y;

	}

	/**
	 * @return the abs
	 */
	public int getAbs() {
		return abs;
	}

	/**
	 * @param abs the abs to set
	 */
	public void setAbs(int abs) {
		this.abs = abs;
	}

	/**
	 * @return the ord
	 */
	public int getOrd() {
		return ord;
	}

	/**
	 * @param ord the ord to set
	 */
	public void setOrd(int ord) {
		this.ord = ord;
	}
	
	public void afficherDetails() {
		System.out.println("le point a pour abscisse" + abs);
	}
	public double calculDistance(Point point) {
		return Math.sqrt(Math.pow(getAbs()-point.getAbs(), abs ))+(Math.pow(getOrd()-point.getOrd(),2));
	}
	}

