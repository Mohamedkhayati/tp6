package qsdqsd;

public class Documents {
    private String titre;
    private int numI;
    private int nbpage;

    public Documents(String t, int n, int nb) {
        this.titre=t;
        this.numI=n;
        this.nbpage=nb;
    }

    public void edition() {
        System.out.println("Titre:"+titre);
        System.out.println("ID:"+numI);
        System.out.println("Nombre de pages:"+nbpage);
    }

    public String getTitre() {
        return titre;
    }

    public int getNumI() {
        return numI;
    }

    public int getNbPage() {
        return nbpage;
    }
}














