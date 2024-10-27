package qsdqsd;


import java.util.Scanner;

public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque biblio=new Bibliotheque(10);
        Scanner sc=new Scanner(System.in);
        boolean quit= false;

        while (!quit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Supprimer un document");
            System.out.println("3. Voir l'inventaire complet");
            System.out.println("4. Liste des livres");
            System.out.println("5. Liste des articles");
            System.out.println("6. Liste des documents simples");
            System.out.println("7. Liste des périodiques");
            System.out.print("Choisissez une option: ");
            int choix=sc.nextInt();

            switch (choix) {
                case 1: 
                    System.out.println("Ajouter un document:");
                    System.out.println("1.Article");
                    System.out.println("2.Livre");
                    System.out.println("3.Périodique");
                    System.out.println("Choisissez un type: ");
                    int typeDoc=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titre:");
                    String titre=sc.nextLine();
                    System.out.print("Numéro d'identification:");
                    int numI=sc.nextInt();
                    System.out.print("Nombre de pages:");
                    int nbpage=sc.nextInt();
                    sc.nextLine(); 

                    switch (typeDoc) {
                        case 1: 
                            System.out.print("Nom de l'auteur: ");
                            String auteur=sc.nextLine();
                            biblio.ajoutDoc(new Articles(titre,numI,nbpage,auteur));
                            break;
                        case 2:
                            System.out.print("Nom de l'auteur: ");
                            String auteurLivre=sc.nextLine();
                            System.out.print("Nom de l'éditeur: ");
                            String editeur=sc.nextLine();
                            biblio.ajoutDoc(new Livres(titre, numI, nbpage, auteurLivre, editeur));
                            break;
                        case 3: 
                            System.out.print("Fréquence de parution: ");
                            String frequence=sc.nextLine();
                            biblio.ajoutDoc(new Periodiques(titre, numI, nbpage, frequence));
                            break;
                        default:
                            System.out.println("Type de document invalide.");
                    }
                    break;

                case 2: 
                    System.out.print("Entrez le numéro d'identification du document à supprimer: ");
                    int numSupp=sc.nextInt();
                    biblio.supprimDoc(numSupp);
                    break;

                case 3: 
                    System.out.println("Inventaire complet:");
                    biblio.inventaireDoc();
                    break;

                case 4:
                    System.out.println("Liste des livres:");
                    Bibliotheque biblioLivres=biblio.listeLivre();
                    biblioLivres.inventaireDoc();
                    break;

                case 5: 
                    System.out.println("Liste des articles:");
                    Bibliotheque biblioArticles=biblio.listeArticle();
                    biblioArticles.inventaireDoc();
                    break;

                case 6:
                    System.out.println("Liste des documents simples:");
                    Bibliotheque biblioDocsSimples=biblio.listeDocsimples();
                    biblioDocsSimples.inventaireDoc();
                    break;

                case 7: 
                    System.out.println("Liste des périodiques:");
                    Bibliotheque biblioPeriodiques=biblio.listePeriodiques();
                    biblioPeriodiques.inventaireDoc();
                    break;

                default:
                    System.out.println("Option invalide. Veuillez choisir une option correcte.");
            }
        }
        sc.close();
    }
}
