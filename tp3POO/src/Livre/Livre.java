package Livre;

public class Livre {

		private String auteur ;
		private String titre ; 
		private int nbPages;
	public Livre() {
	}
			public Livre (String unAuteur, String unTitre ) {
				this.auteur=unAuteur;
				this.titre=unTitre;
				
			}
			public String getAuteur() {
				return this.auteur;
			}
			public int getNbPages() {
		        return this.nbPages;
		   }
		   
		    public void setAuteur(String Auteur) {
			     this.titre = Auteur;
			   }
			public void setNbPages (int nb) {
				if(nb>=0) {
			   this.nbPages=nb; 
			   }
				else 
				System.out.println(" ");
			}
			public void affiche() {
				System.out.println();
			}
			public String getTitre() {
		        return titre;
		   }
			 public void setTitre(String Titre) {
			     this.titre = Titre;
			   }
			public void afficheToi() {
			  System.out.printf(toString() );
			  
			}
			
			public String toString() {
				return "Livre: titre="+this.titre    +"auteur="+this.auteur +"nbp="+this.nbPages ;
			}
			

}


