package Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Etudiant E1,E2;
		System.out.println("La liste des étudiants :");
		E1=new Etudiant ("AMINE","Youssef","tunis","2eme");
		System.out.println("Je suis AMINE Youssef mon CNE est: 65678754");
		E2=new Etudiant ("ALSENY","Amir","tunis","2eme");
		System.out.println("Je suis ALSENY Amir mon CNE est: 87543543");
		
		Employe EP1,EP2;
		System.out.println("La liste des empoyes :");
		EP1=new Employe ("BEN","MARIO","Lyon",1000);
		System.out.println("Je suis BEN Mario mon salaire est: 1000.0 Euros");
		EP2=new Employe ("NGOYE","Philippe","paris",1000);
		System.out.println("Je suis NGOYE Philippe mon salaire est: 1000.0 Euros");
		
		Professeur P1,P2;
		System.out.println("La liste des professeurs :");
		P1=new Professeur("TATI","kevin","Lyon",5700,"JAVA/JEE");
		System.out.println("Je suis TATI Kevin mon salaire est: 5700.0 Euros ma spécialité est: JAVA/JEE");
		P2=new Professeur  ("NGOYE","Philippe","paris",5000,"Mathematique");
		System.out.println("Je suis SFAR Ahlem mon salaire est: 5000.0 Euros ma spécialité est: Mathématique");
		
	}

}
