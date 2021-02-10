package vehicule;

public class Avion extends vehicule {
	private String moteur ;
	private int nombrebheures;
	public Avion (String marque, int date , double prixA,double prixC,String moteur , int nbheures) {
	super(marque ,date , prixA,prixC);
	this.moteur=moteur;
	nombrebheures=nbheures;
	}
public void calculePrix(int anneActuelle) {
    double decote;
    if (moteur == "HELICES") {
       decote = 0.1 * nombrebheures / 100.0;
    } 
    else {
    decote = 0.1 * nombrebheures / 1000.0;
    }
    setPrixCourant(Math.max(0.0, (1.0 - decote) * getPrixAchat()));
}
public void affiche() {
    System.out.println(" ---- Avion Ã " + moteur + "----");
    super.affiche();
    System.out.println(nombrebheures + " heures de vol.");
}
 
}
