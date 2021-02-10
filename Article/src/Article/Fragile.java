package Article;

public class Fragile extends Article {
	String emballage; 
	public Fragile ( String nom , double  prixHT) {
		super(nom , prixHT);	
	}
   public Fragile (String emballage ,String nom , double prixHT ) {
	  super (nom , prixHT);
	   this.emballage =emballage;
   }
   public double prixTransport () { 
	   return 2 * prixTransport();
   }
}
