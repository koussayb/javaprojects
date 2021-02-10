package vehicule;

public class voiture extends vehicule {
	private double cylindree;
	private int nbrdeportes;
	private double puissance ;
	private double kilometrage;
	public voiture (String marque, int date , double prixA,double prixC,double cylindree,int nbdeports,double cv , double km ) {
		super (marque ,date , prixA,prixC );
		this.cylindree=cylindree;
		nbrdeportes=nbdeports;
		puissance =cv;
		kilometrage = km ;	
	}
   public void calculePrix(int anneeActuelle) {
	  double decote =(anneeActuelle - getDateAchat()) * 0.02 ;
	  decote += 0.05 *(int)(kilometrage/10000);
	  if ((getMarque() == "Fiat") || (getMarque() == "Renault")) {
		  decote += 0.1;
	  }
	  else if ((getMarque() == "Ferrari") || (getMarque()== "Porche" )){
		decote -= 0.2;  
	  }
	  setPrixCourant(Math.max(0.0, (1.0 -decote)*getPrixAchat()));
	  
 }
   public void affiche() {
	   System.out.println("---voiture---");
	   super.affiche();
	   System.out.println(cylindree +"litres,"+nbrdeportes+"portes,"+puissance+"cv,"+kilometrage+"km.");
   }
}
