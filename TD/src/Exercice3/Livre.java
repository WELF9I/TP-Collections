package Exercice3;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

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
    public Livre(String auteur, String titre, int nbPages, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
        this.prix = prix;

    }


    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.out.println("Le prix a été fixé et ne peut pas être modifié.");
        }
    }
    public boolean testPrix() {
        return prix > 0;
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
