public class Fiscalite {
    public static void main(String[] args) {
        Personne p1 = new Personne(1345678, "ahmed", "omri");
        Personne p2 = new Personne(1234567, "Dali", "Hmem");
        Personne p3 = new Personne(123456, "amine", "Welfeki");

        Lotissement l = new Lotissement(10);
        l.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        l.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        l.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        l.ajouter(new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true));
        l.ajouter(new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));

        l.afficherProprietes();

        System.out.println("Le nombre total des pièces : " + l.getnbPièces());

        ProprietePrivee ProprieteMoinImp = null;
        double montantMinImpots = 1000000; //Exemple

        for (int i = 0; i < l.tabProp.length; i++) {
            if (l.tabProp[i] instanceof ProprietePrivee) {
                double impots = ((ProprietePrivee) l.tabProp[i]).calculImpot();
                if (impots < montantMinImpots) {
                    montantMinImpots = impots;
                    ProprieteMoinImp = (ProprietePrivee) l.tabProp[i];
                }
            }
        }
        

        if (ProprieteMoinImp != null) {
            System.out.println("Le propriétaire de la propriété privée qui paye le moins d’impôts : " +
                    ProprieteMoinImp.responsable.getNom() +
                    ", montant des impôts : " + montantMinImpots);
        }

        Appartement appartementHammamet = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        l.supprimer(appartementHammamet);

        l.afficherProprietes();
    }
}
