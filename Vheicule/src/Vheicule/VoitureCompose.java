package Vheicule;

public class VoitureCompose {
	private  Vheicule v; 
	private int nombreDePortes;
	public VoitureCompose() {
		v=new Vheicule ();
		nombreDePortes=2;
	}
   public VoitureCompose(boolean m, int vit ,int n ) {
	   v=new Vheicule(m,vit);
	   nombreDePortes=n;   
   }
   public String toString() {
	   String S;
	   S=v.toString();
	   S=S+" c'est une voiture de" +nombreDePortes + "portes. /n";
	   return S;
   }
    public Vheicule getVheicule() {
	   return v;
   }

   public int getNombreDePortes() {
	  return nombreDePortes;
   }
}
