package Exercice1;

public class Livre {
    private String titre, auteur;
    private int nbPages; // Correction du type de données pour le nombre de pages (int au lieu de float)

    public Livre(String auteur, String titre) { // Correction du constructeur
        this.auteur = auteur;
        this.titre = titre;
    }
    public String getAuteur() { // Type de retour String et n'est pas void
        return auteur;
    }

    public void setNbPages(int nb) { // Correction du type de données du paramètre (int nb)
        nbPages = nb;
    }

    public int getNbPages() { // Ajout du getter pour le nombre de pages
        return nbPages;
    }
    /*@Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }*/
}
