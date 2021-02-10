package Vehicule;

public class Vehicule {
	private boolean moteur;
	private int vitesseMax;
	public Vehicule (boolean Moteur, int VitesseMax) {
		this.moteur=Moteur ;
		this.vitesseMax=VitesseMax;
	}
	public boolean getMoteur() {
		return moteur;
	}
	public void setMoteur(boolean moteur) {
		this.moteur = moteur;
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
	public void affiche () {
		System.out.println();
	}
	public String toString() {
		String s= "vehicule";
		if (moteur) 
			s=s+"a moteur,";
			else 
				s=s+"sans moteur ";
		        s=s+"dont la vitesse max est de "+vitesseMax+"km/h";
		return s;
	}
	public void Vmax() {
		System.out.println("vitesse max="+vitesseMax+"Km/h");	}
	
}
