package Personne;

public class Pérsonne {

	public static void main(String[] args) {
		Personne P1,P2; 
		P1=new Personne ("Koussay","Bouchaala","sfax") ;
		System.out.println("Personne1 :"+P1);
		P2=new Personne ("khalil","Nakhli","Tunis");
		System.out.println("Personne2 :"+P2);
	
	
    Eleve E1,E2;
	E1=new Eleve ("Hamdi","Bali","Rades","LGLSI-1A");
	System.out.println("Eleve1 :"+E1);
	E2=new Eleve ("Amir","Bargouigui","Megrin","LGLSI-1A");
	System.out.println("Eleve2 :"+E2);
	
	
	
	Enseignant prof1, prof2;
	prof1=new Enseignant("mouna","kolsi","sfax", 10 , 17);
	System.out.println("Enseignant1 :"+prof1);
	prof2=new Enseignant("Wided","Abidi","Tunis", 10 , 10);
	System.out.println("Enseignant2 :"+prof2);
	
	System.out.println("salaire du prof1="+prof1.calculSalaire());
	System.out.println("salaire du prof2="+prof2.calculSalaire());
	
	}
}