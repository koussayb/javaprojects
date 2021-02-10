package Personne;

public class Etudiant extends personne  {
	
      public String classe ;
		public Etudiant (String nom ,String prenom ,String adresse ,String classe) {
		  super(nom,prenom,adresse);
		  this.classe=classe;
}
		public String getClasse() {
			return classe;
		}
		public void setClasse(String classe) {
			this.classe = classe;
		}
		
		public String toString() {
			return " nom="+this.nom  +"," +"prenom="+this.getPrenom() +"," +"adresse="+this.getAdresse() +"," +"classe="+this.classe;
		}
		
}
