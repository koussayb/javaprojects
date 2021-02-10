package Vheicule;

public class VoitureDerivee extends Vheicule {
	private int nombreDePortes;
	public VoitureDerivee() {
		super();
		nombreDePortes=2;
	}
	public VoitureDerivee(boolean m,int v ,int n) {
		super(m,v);
		this.nombreDePortes=n;
	}
	public String toString() {
		String S;
		S=super.toString();
		S=S+"c'est une voiture de nombre" +nombreDePortes + "portes. \n";
				return S;
	}
	public int getnombreDePortes() {
		return nombreDePortes;
	}
	

}
