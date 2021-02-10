package Livre;

public class TestAuteur {

	public static void main(String[] args) {
		Livre Livre1,Livre2;
		Livre1 =new Livre("Victor HUGO","les Miserables");
	    System.out.println("By:Victor HUGO" );
	    Livre2 =new Livre("Musso Guillaume","ET Aprés");
	    System.out.println("By:Musso Guillaume");
	    
	
	System.out.printf(Livre1.getTitre(),Livre1.getAuteur(),Livre1.getNbPages());
	System.out.println();
	System.out.printf(Livre2.getTitre(),Livre2.getAuteur(),Livre2.getNbPages());
	System.out.println();
	Livre1.setNbPages(992);
	Livre2.setNbPages(512);
	if(Livre1.getNbPages()>0) {
		System.out.println();
	}else {
		System.out.print("erruer");
		
	}
System.out.printf("la somme de pages des deux livres =  " +(Livre1.getNbPages()+Livre2.getNbPages()));
System.out.println("/n");
Livre2.afficheToi();
System.out.println("/n");
System.out.println(Livre1);

	}
	
	}
	



