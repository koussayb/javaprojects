package Vheicule;

public class TestVoitureCompose {

	public static void main(String[] args) {
		
	    Vheicule v1=new Vheicule(true,121);
		System.out.println(v1);
		v1.Vmax();
		VoitureDerivee v2 = new VoitureDerivee(true,150,2);
	    System.out.println(v2);
	    System.out.println(v2.getMoteur());
	    System.out.println(v2.getVitesseMax());
	    System.out.println(v2.getnombreDePortes());
	    v2.Vmax();
	    VoitureCompose v3 = new VoitureCompose(true,152,4);
		System.out.println(v3);
		System.out.println(v3.getNombreDePortes());
		System.out.println(v3.getVheicule().getVitesseMax());
		System.out.println(v3.getVheicule().getMoteur());
		v3.getVheicule().Vmax();
		System.out.println(v3.toString());
	
	}

}
