package Article;

import java.util.ArrayList;
import java.util.List;

public class Magasin extends Article {
	private List<Article> articles;
    public Magasin (String nom , double prixHT) {
    	 
    	super ( nom , prixHT);
    	articles=new ArrayList<>();
    }
    public void add(Article x) {
    	articles.add(x) ;
    }
    public boolean contains (Article x ) {
    	for (Article y : articles) {
    		if (y.getCode()==x.getCode()) 
    			return true ;
    		
    	
  
    		}
		return false;
    	
    }
}

