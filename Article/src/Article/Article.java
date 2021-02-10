package Article;

public class Article {
  protected int code ;
  protected String nom ;
  protected double prixHT; 
  
  private static int comp;
   
  public Article ( String Nom, double PrixHT) {
	  this.code=++comp ;
	  this.nom=Nom; 
	  this.prixHT=PrixHT;
  }
  public String getNom() {
		return this.nom;
	}
	public int getCode() {
		return this.code ;
	}
	public double getPrixHT() {
		return this.prixHT ;
	}
	public void setNom(String Nom) {
	     this.nom = Nom;
	   }
	public void setCode(int Code) {
	     this.code =Code ;
	   }
	public void setPrixHT(double PrixHT) {
	     this.prixHT = PrixHT;
	   }
	public void affiche() {
		System.out.println();
	}
	
	public String toString() {
		return "code="+this.code  +","  + "Nom="+this.nom +"," +"prixHT="+this.prixHT ;}
	
	
}
