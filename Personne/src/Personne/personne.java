package Personne;

public class personne {
	private int id;
	public  String nom ; 
	public String prenom ;
	public String adresse ;
	public String classe;
	public double salaire ;
	private static int comp;
	public personne (String Nom,String Prenom,String Adresse) {
		this.id=++comp;
		this.nom=Nom;
		this.prenom=Prenom;
		this.adresse=Adresse ;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
    public void affiche () {
		System.out.println();
	}
	public String toString() {
		return "personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse +  
				  ", ]";
	}

}
