package Vehicule;

public class voiturederrive extends Vehicule {
	private int nombreDePortes;
	public voiturederrive() {
	   super();
	   nombreDePortes = 2;
	}
	public voiturederrive(boolean m,int v,int n) {
	    super(m,v);
	    nombreDePortes = n;
	}
	public String toString(){
	    String S;
	    S=super.toString();
	    S=S+" C'est une voiture de " +nombreDePortes + " portes.\n";
	return S;
	}
	public int getnombreDePortes () {
		   return nombreDePortes;
		}

}
