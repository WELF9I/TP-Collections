import java.time.format.DateTimeFormatter;

public class Achat {
    private static Article[] supermarche=new Article[4];
    private static float montantTotal = 0;

    public static void main(String[] args) {
        initialiserSupermarche();
        acheter("21/03/2023", 123, 0);
        acheter("21/03/2023", 145, 1);
        acheter("21/03/2023", 178, 1);
        acheter("21/03/2023", 191, 3);
        System.out.println("Montant total à payer : " + montantTotal + " DT");
    }
    private static void initialiserSupermarche() {
        supermarche[0]=new Vetement(123, "Jupe bleue taille S", 39.000f, 2, "Bleu", "S");
        supermarche[1]=new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2]=new Vetement(178, "Pantalon noir taille M", 42.000f, 5, "Noir", "M");
        supermarche[3]=new ProduitGC(191, "Pâtes 0.410", 18.000f, 18);}
    private static void acheter(String dateStr,long ref,int qteAchat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        time.LocalDate dateAchat = time.LocalDate.parse(dateStr, formatter);

        for (Article article:supermarche) {
            if (article != null && article.getReference()==ref && article.estDispo(qteAchat)){
                float prixTTC = article.calculPrixTTC();
                if (article instanceof Promotion&&((Promotion)article).estPeriodePromo(dateStr)){
                    prixTTC *= (1-0.30f);}
                System.out.println("Article acheté: "+article.getLibelle()+",prix TTC à payer :"+prixTTC+" DT");
                montantTotal+= prixTTC;
                article.approvisionner(qteAchat);
                break;
            } else if (article != null && article.getReference()==ref&&!article.estDispo(qteAchat)) {
                System.out.println("Article indisponible");
                article.approvisionner(qteAchat);
                break;
            }}}
}
