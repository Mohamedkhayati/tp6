package qsdqsd;

public class Periodiques extends Documents {
    private String frequence;

    public Periodiques(String t, int n, int nb, String f) {
        super(t,n,nb);
        this.frequence=f;
    }

    public void edition() {
        super.edition();
        System.out.println("Fréquence:"+frequence);
    }

    public String getFrequence() {
        return frequence;
    }
}
