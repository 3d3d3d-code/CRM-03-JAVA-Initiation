/**
 * 
 */
package com.crm.bo;

/**
 * @author reda
 * classe metier 
 */
public class Voiture {

	/**
	 * @args the vitesseVoiture
	 * creation des getter/setter
	 */
	public int getVitesseVoiture() {
		return vitesseVoiture;
	}

	/**
	 * @param vitesseVoiture the vitesseVoiture to set
	 */
	public void setVitesseVoiture(int vitesseVoiture) {
		this.vitesseVoiture = vitesseVoiture;

	}

	/**
	 * @return the autoroute
	 */
	public boolean isAutoroute() {
		return autoroute;
	}

	/**
	 * @param autoroute the autoroute to set
	 */
	public void setAutoroute(boolean autoroute) {
		this.autoroute = autoroute;
	}

	/**
	 * @return the nationale
	 */
	public boolean isNationale() {
		return nationale;
	}

	/**
	 * @param nationale the nationale to set
	 */
	public void setNationale(boolean nationale) {
		this.nationale = nationale;
	}

	/**
	 * @return the village
	 */
	public boolean isVillage() {
		return village;
	}

	/**
	 * @param village the village to set
	 */
	public void setVillage(boolean village) {
		this.village = village;
	}
	/*
	 * declaration des variables 
	 * 
	 */

	private String marque;
	private String couleur;
	private int nbPorte;
	private String boite;
	private int prix;
	private int vitesseVoiture;
	private boolean etat = false;
	private boolean autoroute = false;
	private boolean nationale = false;
	private boolean village = false;

	/**
	 * @param marque
	 * @param couleur
	 * @param nbPorte
	 * @param boite
	 * @param prix
	 */
	public Voiture(String marque, String couleur, int nbPorte, String boite, int prix) {

		this.marque = marque;
		this.couleur = couleur;
		this.nbPorte = nbPorte;
		this.boite = boite;
		this.prix = prix;
	}

	/**
	 * @return the vitesse
	 */

	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean x) {
		this.etat = x;
	}

	public int getVitesse() {
		return vitesseVoiture;
	}

	/**
	 * @param vitesse
	 */
	public Voiture(int vitesse) {

		this.vitesseVoiture = vitesse;
	}

	/**
	 * @param rajout vitesse en paramètre
	 */
	public void setVitesse(int vitesse) {
		this.vitesseVoiture = vitesse;
	}

	public Voiture() {

	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the nbPorte
	 */
	public int getNbPorte() {
		return nbPorte;
	}

	/**
	 * @param nbPorte the nbPorte to set
	 */
	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}

	/**
	 * @return the boite
	 */
	public String getBoite() {
		return boite;
	}

	/**
	 * @param boite the boite to set
	 */
	public void setBoite(String boite) {
		this.boite = boite;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void vitesseCourante() {

	}

	public int accelerer(int vitesse) {


		
		
		return vitesseVoiture = getVitesse() + vitesse;
		
	}

	public int ralentir(int vitesse) {

		return vitesseVoiture = getVitesse() - vitesse;

	}

	public void klaxonner() {
		System.out.println("tuuuut");

	}

	public String toString() {
		return (" marque " + marque + "  couleur  " + couleur + " " + nbPorte + " portes " + "  boite  " + boite);

	}

	public void typeAutoroute() {
		if(accelerer(getVitesse())<50) {
			System.out.println("");
			
		}

	}

	public void typeNationale() {

	}

	public void typeVillage() {

	}
}
