package Personne;

public class Personne {
	protected String nom ;
	private String pr�nom;
	private String adresse;
	 
	
	public Personne (String unNom , String unPr�nom , String unAdresse   ) {
		this.nom=unNom;
		this.pr�nom=unPr�nom;
		this.adresse=unAdresse;
	}
	public String getNom() {
		return this.nom;
	}
	public String getPr�nom() {
		return this.pr�nom ;
	}
	public String getAdresse() {
		return this.adresse ;
	}
	public void setNom(String Nom) {
	     this.nom = Nom;
	   }
	public void setPr�nom(String Pr�nom) {
	     this.pr�nom = Pr�nom ;
	   }
	public void setAdresse(String Adresse) {
	     this.adresse = Adresse;
	   }
	public void affiche() {
		System.out.println();
	}
	
	public String toString() {
		return " Nom="+this.nom +","  +"pr�nom="+this.pr�nom  +"," +"adresse="+this.adresse ;}
	
}

