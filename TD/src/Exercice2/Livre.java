package Exercice2;

public class Livre {
    private String titre, auteur;
    private int nbPages;

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }
    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.nbPages = 0;
    }


    public Livre(String titre, int nbPages) {
        this.titre = titre;
        this.auteur = "";
        this.nbPages = nbPages;
    }


    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    public String getAuteur() { // Type de retour String et n'est pas void
        return auteur;
    }
    public void setAuteur(String Au) { // Ajout du setter pour l'auteur
        auteur = Au;
    }
    public String getTitre() { // Type de retour String et n'est pas void
        return titre;
    }
    public void setTitre(String Ti) { // Ajout du setter pour l'auteur
        auteur = Ti;
    }
    public int getnbPages() { // Type de retour String et n'est pas void
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre de pages indiqué est faible. Veuillez entrer un nombre supérieur à 20.");
        }
    }

    public int getNbPages() { // Ajout du getter pour le nombre de pages
        return nbPages;
    }
    @Override
    public String toString() {
        return "Livre intitulé "+titre+" de "+auteur+",contenant "+nbPages+" pages." ;
    }
    public void decrire() {
        System.out.println(toString());
    }
}

