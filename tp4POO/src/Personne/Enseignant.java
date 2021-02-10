package Personne;

public class Enseignant extends Personne {
	public int echelon  ;
	public float nbHeures ; 
	public static double [] tauxSalaire= new double [] {40,42,43,44,45,46,50,52,54,56,60,65};
	
	public Enseignant (String nom , String prénom , String adresse, int echelon , float nbHeures ) {
    super(nom ,prénom , adresse );
    this.echelon=echelon ;
    this.nbHeures=nbHeures ;
    
	}
	public int getEchelon() {
		return this.echelon;
	}
	public float getNbHeures() {
		return this.nbHeures; 
	}
	public void setEchelon(int echelon) {
		this.echelon=echelon  ; 	
	}
	public void setNbHeures(float nbHeures ) {
		this.nbHeures=nbHeures ;
	}
	public String toString() {
		return "Nom="+this.getNom()  +"," +"Prenom="+this.getPrénom()  +"," +"adresse="+this.getAdresse()   +","   +"echelon= "+this.echelon  +","  +"nbHeures="+this.nbHeures ;
	}
	public boolean echelonValide() {
		if (echelon >=1 && echelon <=11 ) 
		return true ;
		
		else 
			return false  ;
	}
	public double getPrixHeure(int echelon ) {
		if (this.echelonValide())
			return Enseignant.tauxSalaire[this.echelon - 1];
		else return 0 ;
	}
	public double calculSalaire() {
		if (this.echelonValide()) {
			  return this.getPrixHeure( echelon)*this.nbHeures;
	
		}
		else 
			return 0;
	}
	
	
}
