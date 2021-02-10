package Comptebancaire ;

public class Comptebancaire {
	String nom;
	char [] numero; 
	double solde;
	
	public Comptebancaire() {
	}
	 public Comptebancaire (String proprio, char[] num,double montant ) {
		 this.nom=proprio;
		 this.numero=num;
		 this.solde=montant;
	 }
	 public void  deposer(double x) {
		 this.solde+=x;
	 }
	 public void retirer(double y) {
		 this.solde-=y;
	 }
	 public void afficher() {
		 System.out.println("votre solde est " + this.solde +"TND");
	 }
	 public void virervers(Comptebancaire cb ,  int monatant) {
		 this.retirer(monatant);
		 cb.deposer(monatant);
	 }
	}

