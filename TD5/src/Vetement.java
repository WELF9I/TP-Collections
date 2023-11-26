public class Vetement extends Article implements Promotion {
    private String couleur;
    private String taille;
    public Vetement(long ref, String lib, float p, int q, String couleur, String taille) {
        super(ref,lib,p,q);
        this.couleur = couleur;
        this.taille = taille;
    }

    @Override
    public float calculPrixTTC() {
        return prixHT*(1+TVA);
    }
    @Override
    public boolean appartientPromo() {
        return true;
    }
    @Override
    public float prixDeVente(String dateStr) {
        return calculPrixTTC()*(1-0.30f);
    }
    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Classe : Vetement");
        System.out.println("Couleur : "+couleur);
        System.out.println("Taille : "+taille);
    }
}
