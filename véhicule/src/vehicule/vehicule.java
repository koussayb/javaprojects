package vehicule;

public class vehicule {
	private String marque ;
	private int dateAchat;
	private double prixAchat;
	private double prixCourant;
	public vehicule (String m, int d , double pA, double pC) {
		this.marque=m;
		this.dateAchat=d;
		this.prixAchat=pA;
		this.prixCourant=pC;
	}
	public void calculePrix(int anneeActuelle) {
		double decote = (anneeActuelle - dateAchat)*0.01;
		prixCourant = Math.max(0.0, (1.0 - decote)*prixAchat);
	}
   public void affiche() {
	   System.out.println("marque : "+marque+", dateAchat"+dateAchat+", prixCourant"+prixCourant);
	   System.out.println();
   }
public String getMarque() {
	return marque;
}
public int getDateAchat() {
	return dateAchat;
}
public double getPrixAchat() {
	return prixAchat;
}
public void setPrixCourant(double prixCourant) {
	this.prixCourant = prixCourant;
}
   
}
