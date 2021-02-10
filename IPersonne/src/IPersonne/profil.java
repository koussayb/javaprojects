package IPersonne;

public class profil {
	private int id;
	private String code;
	private String libelle;
	private static int comp=0;
	public profil (String code,String libelle ) {
		comp++;
		this.id=comp;
		this.code=code;
		this.libelle=libelle;
		
	}
	public String getCode() {
		return code;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	

}
