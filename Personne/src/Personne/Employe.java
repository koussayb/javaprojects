package Personne;

public class Employe extends personne  {
	
    public double salaire ;
		public Employe (String nom ,String prenom ,String adresse ,double salaire) {
		  super(nom,prenom,adresse);
		  this.salaire=salaire;
		  
}
		public double getSalaire() {
			return salaire;
		}
		public void setSalaire(double salaire) {
			this.salaire = salaire;
		}
		
		public String toString() {
			return " nom="+this.nom   +"prenom="+this.getPrenom()  +"adresse="+this.getAdresse()   + "salaire="+this.salaire;
		}
		
		
}
