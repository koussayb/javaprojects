package Comptebancaire;

public class GetSoldeCourant {

	public static void main(String[] args) {
		Comptebancaire monComptebancaire1; 
		Comptebancaire monComptebancaire2; 
		Comptebancaire monComptebancaire3; 
		String num1="11111111";
		String num2="22222222";
		String num3="33333333";
	    monComptebancaire1 =new Comptebancaire("koussay",num1.toCharArray(),1000.00);
	    System.out.println("votre slolde est 1000" + "TND");
	    monComptebancaire2 =new Comptebancaire("amir",num2.toCharArray(),2300.00);
	    System.out.println("votre slolde est 2300" + "TND");
	    monComptebancaire3 =new Comptebancaire("hamdi",num3.toCharArray(),5000.00);
	    System.out.println("votre slolde est 5000" + "TND");
		monComptebancaire1.deposer(100);
		monComptebancaire1.virervers (monComptebancaire2,1000);
		monComptebancaire2.retirer (200);
		monComptebancaire3.afficher();
		
	}

}
