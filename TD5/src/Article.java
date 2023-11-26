public abstract class Article {
    protected long reference;
    protected String libelle;
    protected float prixHT;
    protected int qteStock;
    protected static final float TVA =0.10f;

    public Article(long ref, String lib, float p, int q) {
        this.reference = ref;
        this.libelle = lib;
        this.prixHT = p;
        this.qteStock = q;
    }

    public void approvisionner(int nb) {
        if (nb > 0) {
            qteStock += nb;
        }
    }

    public void decrire() {
        System.out.println("Article " + reference + " : " + libelle);
    }

    public abstract float calculPrixTTC();

    public boolean appartientPromo() {
        return false;
    }

    public boolean estDispo(int qteAchat) {
        return qteAchat <= qteStock;
    }

    public long getReference() {
        return reference;
    }

    public String getLibelle() {
        return libelle;
    }
}
