package IPersonne;

public class Personne implements IPersonne{
	private int id;
	private String nom;
	private String prenom;
	private double salaire;
	private profil profil;
    private static int comp=0;
    public Personne (String Nom , String Prenom , double Salaire ,profil profil) {
    	comp++;
    	this.id=comp;
    	this.nom=Nom;
    	this.prenom=Prenom;
    	this.salaire=Salaire;
    	this.profil=profil;
    }
   
    public void affiche() {
    	System.out.println("Je suis le "+this.profil.getLibelle() +" "+nom+" "+prenom+ " mon salaire est "+calculerSalaire()+ " dollars") ;}
    public double calculerSalaire() {
    		
            if(this.profil.getCode().equals("DG"))
    		   return this.salaire= this.salaire+ 0.2*this.salaire;
    	    if(this.profil.getCode().equals("EMP"))
    	       return this.salaire= this.salaire+ 0.1*this.salaire;
    	    return this.salaire;}
}
