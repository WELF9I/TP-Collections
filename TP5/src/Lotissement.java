public class Lotissement extends GestionPropriete {
    protected Propriete[] tabProp;
    protected int nombre;

    Lotissement(int capacite) {
        if (capacite < MAX_PROPRIETES) {
            tabProp = new Propriete[capacite];
        } else {
            System.out.println("Vous avez atteint la capacité maximale");
        }
    }

    @Override
    void afficherProprietes() {
        for (int i = 0; i < tabProp.length; i++) {
            if (tabProp[i] != null) {
                System.out.println(tabProp[i].toString());
            }
        }
    }

    @Override
    boolean ajouter(Propriete p) {
        if (tabProp.length < MAX_PROPRIETES && p != null) {
            int pos = nombre;
            tabProp[pos] = p;
            nombre++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean supprimer(Propriete p) {
        boolean exist = false;
        for (int i = 0; i < this.tabProp.length; i++) {
            if (this.tabProp[i] != null && this.tabProp[i].equals(p)) {
                exist = true;
                for (int j = i; j < tabProp.length - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[tabProp.length - 1] = null;
            }
        }
        return exist;
    }

    Propriete getproprieteByIndice(int i) {
        return this.tabProp[i];
    }


    int getnbPièces() {
        int nbp = 0;
        for (int i = 0; i < this.tabProp.length; i++) {
            if (this.tabProp[i] instanceof ProprietePrivee) {
                nbp += ((ProprietePrivee) tabProp[i]).nbPieces;
            }
        }
        return nbp;
    }
}
