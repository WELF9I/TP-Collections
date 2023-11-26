public class ProduitElec extends Article implements Promotion {
    private String categorie;

    public ProduitElec(long ref, String lib, float p, int q, String categorie) {
        super(ref,lib,p,q);
        this.categorie = categorie;
    }
    @Override
    public float calculPrixTTC() {
        return prixHT*(1.08f+TVA);
    }
    @Override
    public boolean appartientPromo() {
        return true;
    }

    @Override
    public float prixDeVente(String dateStr) {
        return calculPrixTTC()*(1-0.20f);
    }
    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Catégorie : " +categorie);
    }
}
