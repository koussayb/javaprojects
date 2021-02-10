package vehicule;

public class GestionVehicule {
	private static int ANNEE_ACTUELLE = 2012;
	public static void main(String[] args) {
		
		
		vehicule[] vehicules = new vehicule [5];
		vehicules[0] = new voiture("Peugeot", 2005, 147325.79, 147325.79, 2.5, 5, 180.0, 12000);
		vehicules[1] = new voiture("Porsche", 1999, 250000.00, 250000.00, 6.5, 2, 280.0, 81320);
		vehicules[2] = new voiture("Fiat", 2001, 7327.30 , 7327.30, 1.6, 3, 65.0, 3000);
		vehicules[3] = new Avion("Cessna", 1982, 1230673.90 , 1230673.90, "HELICES", 250);
		vehicules[4] = new Avion("Nain Connu", 1993, 4321098.00, 4321098.00, "REACTION", 1300);
		for (int i = 0; i < vehicules.length; i++) {
			vehicules[i].calculePrix(ANNEE_ACTUELLE);
			vehicules[i].affiche();
			}

	}

}
