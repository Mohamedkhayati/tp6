package qsdqsd;

public class Livres extends Documents {
    private String editeur;

    public Livres(String t, int n, int nb, String nA, String e) {
    	super(t,n,nb);
        this.editeur=e;
    }

    public void edition() {
        super.edition();
        System.out.println("Éditeur:"+editeur);
    }

    public String getEditeur() {
        return editeur;
    }
}
