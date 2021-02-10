package Personne;

public class Eleve extends Personne {
	private String classe ;
	public Eleve (String nom ,String pr�nom ,String adresse ,String classe) {
	  super (nom,pr�nom,adresse);
	  this.classe=classe;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String toString () { 
		return " Nom="+this.nom  +"," +"pr�nom="+this.getPr�nom() +"," +"adresse="+this.getAdresse() +"," +"classe="+this.classe;
	}
    
}

