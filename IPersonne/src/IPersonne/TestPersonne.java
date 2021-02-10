package IPersonne;

public class TestPersonne {

	public static void main(String[] args) {
		profil profiles[] = new profil[2];
		profiles[0] = new profil("EMP","Employé");
		profiles[1] = new profil("DG","Directeur Géneral");
		Personne personnes[] = new Personne[3];
		personnes[0] = new Personne("ELALAOUI", "Mohamed" ,9000.0, profiles[0]);
		personnes[1] = new Personne("DOURID", "Raouan", 10000.00, profiles[1] );
		personnes[2] = new Personne("ALAOUI", "Sara", 8200.00, profiles[0] );
		for(Personne per : personnes){ 
			per.affiche();
			System.out.println(per.calculerSalaire());
			}
		
	}

}
