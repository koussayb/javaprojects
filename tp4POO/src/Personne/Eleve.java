package Personne;

public class Eleve extends Personne {
	private String classe ;
	public Eleve (String nom ,String prénom ,String adresse ,String classe) {
	  super (nom,prénom,adresse);
	  this.classe=classe;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String toString () { 
		return " Nom="+this.nom  +"," +"prénom="+this.getPrénom() +"," +"adresse="+this.getAdresse() +"," +"classe="+this.classe;
	}
    
}

