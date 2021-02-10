package Personne;

public class Personne {
	protected String nom ;
	private String prénom;
	private String adresse;
	 
	
	public Personne (String unNom , String unPrénom , String unAdresse   ) {
		this.nom=unNom;
		this.prénom=unPrénom;
		this.adresse=unAdresse;
	}
	public String getNom() {
		return this.nom;
	}
	public String getPrénom() {
		return this.prénom ;
	}
	public String getAdresse() {
		return this.adresse ;
	}
	public void setNom(String Nom) {
	     this.nom = Nom;
	   }
	public void setPrénom(String Prénom) {
	     this.prénom = Prénom ;
	   }
	public void setAdresse(String Adresse) {
	     this.adresse = Adresse;
	   }
	public void affiche() {
		System.out.println();
	}
	
	public String toString() {
		return " Nom="+this.nom +","  +"prénom="+this.prénom  +"," +"adresse="+this.adresse ;}
	
}

