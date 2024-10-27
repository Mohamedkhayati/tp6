package qsdqsd;

public class Bibliotheque {
	
	    private Documents[] listdoc;
	    private int capmax;
	    private int nbDoc=0;

	    public Bibliotheque(int n) {
	        this.listdoc=new Documents[n];
	        this.capmax=n;
	    }

	    public int getCapacite() {
	        return capmax;
	    }

	    public int getNombreDocument() {
	        return nbDoc;
	    }

	    public void ajoutDoc(Documents d) {
	        if (nbDoc<capmax) {
	            listdoc[nbDoc++]=d;
	        } else {
	            System.out.println("Capacité maximale atteinte.");
	        }
	    }

	    public void supprimDoc(int num) {
	        boolean ok=false;
	        for (int i=0;i<nbDoc; i++) {
	            if (listdoc[i].getNumI()==num) {
	                for (int j=i;j<nbDoc-1;j++) {
	                    listdoc[j]=listdoc[j+1];
	                }
	                listdoc[--nbDoc]=null;
	                ok=true;
	                break;
	            }
	        }
	        if (!ok) {
	            System.out.println("Document non trouvé.");
	        }
	    }

	    public void inventaireDoc() {
	        for (int i=0;i<nbDoc;i++) {
	            listdoc[i].edition();
	            System.out.println("----------");
	        }
	    }


	    public Bibliotheque listeArticle() {
	        Bibliotheque biblioArticles = new Bibliotheque(capmax);
	        for (int i=0;i<nbDoc;i++) {
	            if (listdoc[i] instanceof Articles) {
	                biblioArticles.ajoutDoc(listdoc[i]);
	            }
	        }
	        return biblioArticles;
	    }

	    public Bibliotheque listePeriodiques() {
	        Bibliotheque biblioPeriodiques=new Bibliotheque(capmax);
	        for (int i=0;i<nbDoc;i++) {
	            if (listdoc[i] instanceof Periodiques) {
	                biblioPeriodiques.ajoutDoc(listdoc[i]);
	            }
	        }
	        return biblioPeriodiques;
	    }
	    public Bibliotheque listeLivre() {
	        Bibliotheque biblioLivres=new Bibliotheque(capmax);
	        for (int i=0;i<nbDoc;i++) {
	            if (listdoc[i] instanceof Livres) {
	            	biblioLivres.ajoutDoc(listdoc[i]);
	            }
	        }
	        return biblioLivres;
	    }
	    public Bibliotheque listeDocsimples() {
	        Bibliotheque biblioDoc=new Bibliotheque(capmax);
	        for (int i=0;i<nbDoc;i++) {
	            if (listdoc[i] instanceof Documents) {
	            	biblioDoc.ajoutDoc(listdoc[i]);
	            }
	        }
	        return biblioDoc;}
	}
