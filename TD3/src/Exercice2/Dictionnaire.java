package Exercice2;

public class Dictionnaire {
    private int nbMots;
    private MotDico[] dico;
    private String nom;

    Dictionnaire(String nom, int Taille) {
        this.dico = new MotDico[Taille];
        this.nom = nom;
        this.nbMots = 0;
    }

    public void ajouterMot(MotDico m) {
        if (nbMots < dico.length) {
            dico[nbMots] = m;
            nbMots++;
        }
    }

    public void supprimerMot(String ch) {
        int pos = chercherMot(ch);
        if (pos != -1) {
            for (int i = pos; i < nbMots - 1; i++) {
                dico[i] = dico[i + 1];
            }
            nbMots--;
        }
    }

    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot()==ch) {
                return i;
            }
        }
        return -1;
    }

    public void listerDico() {
        System.out.println("Contenu du dictionnaire " + nom + ":");
        for (int i = 0; i < nbMots; i++) {
            System.out.println(dico[i].getMot() + " : " + dico[i].getDefinition());
        }
    }

    public int nbSynonymes(MotDico m) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].synonyme(m) && !(dico[i].getMot()==m.getMot())) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Dictionnaire Larousse = new Dictionnaire("Larousse", 10);

        MotDico mot1 = new MotDico("informatique", "Science du traitement de l'information.");
        MotDico mot2 = new MotDico("ordinateur", "Machine  de traitement  d'information.");
        MotDico mot3 = new MotDico("programme", "Ensemble d'instructions exécutables .");

        Larousse.ajouterMot(mot1);
        Larousse.ajouterMot(mot2);
        Larousse.ajouterMot(mot3);

        Larousse.listerDico();

        int essai1 = Larousse.chercherMot("informatique");
        int essai2 = Larousse.chercherMot("anglais");
        if (essai1 != -1) {
            System.out.println("Mot trouvé : " + Larousse.dico[essai1].getMot() + " ,Définition : " + Larousse.dico[essai1].getDefinition());
        } else {
            System.out.println("Mot informatique non trouvé.");
        }

        if (essai2 != -1) {
            System.out.println("Mot trouvé : " + Larousse.dico[essai2].getMot() + " ,Définition : " + Larousse.dico[essai2].getDefinition());
        } else {
            System.out.println("Mot anglais non trouvé.");
        }

        int nbSynonymes = Larousse.nbSynonymes(mot1);
        System.out.println("Nombre de synonymes de mot informatique : " + nbSynonymes);

        Larousse.supprimerMot("informatique");
        Larousse.listerDico();
    }
}


