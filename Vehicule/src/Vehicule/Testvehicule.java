package Vehicule;

public class Testvehicule {

	public static void main(String[] args) {
		Vehicule v1=new Vehicule(true,121);
		System.out.println(v1);
		v1.Vmax();
		voiturederrive v2 = new voiturederrive(true,150,2);
	    System.out.println(v2);
	    System.out.println(v2.getMoteur());
	    System.out.println(v2.getVitesseMax());
	    System.out.println(v2.getnombreDePortes());
	    v2.Vmax();
	    voiturederrive v3 = new voiturederrive(true,152,4);
		System.out.println(v3);
		System.out.println(v3.getnombreDePortes());
		System.out.println(v3.getVehicule().getVitesseMax());
		System.out.println(v3.getVehicule().getMoteur());
		v3.getVehicule().Vmax();
	}

}
