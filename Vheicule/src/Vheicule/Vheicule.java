package Vheicule;

public class Vheicule {
	private boolean moteur;
	private int vitesseMax;
	public Vheicule () {
		moteur= false;
		vitesseMax=0;
	}
	public Vheicule (boolean m , int v) {
		this.moteur=m;
		this.vitesseMax=v;
	}
    public String toString() {
    	String S="\n vehicule ";
    	if (moteur) S=S+"a moteur, ";
    	else 
    		S=S+"sans moteur, ";
    	    S=S+"dont la vitesse maximale est de"+vitesseMax+"km/h \n";
    	    return S; 
    }
    public void Vmax() {
    	System.out.println("\n vitesse max :"+vitesseMax+"km/h \n");
    }
	public boolean getMoteur() {
		return moteur;
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	
}
