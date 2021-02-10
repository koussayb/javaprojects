package Personne;

public class Professeur extends Employe {
	  public String matiere ;
			public Professeur (String nom ,String prenom ,String adresse ,double salaire,String matiere) {
			  super(nom,prenom,adresse,salaire);
			  this.matiere=matiere;
			}
			public String getMatiere() {
				return matiere;
			}
			public void setMatiere(String matiere) {
				this.matiere = matiere;
			}
			
			public String toString() {
				return "Professeur [matiere=" + this.matiere + ", salaire=" + this.salaire + ", nom=" +this.nom + ", prenom=" +this.prenom
						+ ", adresse=" + this.adresse + ", classe=" + classe  + "]";
			}  

}
