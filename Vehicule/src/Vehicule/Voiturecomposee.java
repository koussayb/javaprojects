package Vehicule;

public class Voiturecomposee {
	private Vehicule v;
    private int nombreDePortes;
    public Voiturecomposee() {
      // v = new Vehicule();
 	   nombreDePortes = 2;
    }
    public Voiturecomposee(boolean m,int vit, int n){
 	   v = new Vehicule(m,vit);
 	   nombreDePortes = n;
 	}
 	public String toString(){
 	   String S;
 	   S = v.toString();
 	   S = S+" C'est une voiture de " +nombreDePortes + " portes.\n";
 	return S;
 	}
 	public int getnombreDePortes () {
 		   return nombreDePortes;
 		}
 	Vehicule getVehicule()
 	{
 		return v;
 	}
}
