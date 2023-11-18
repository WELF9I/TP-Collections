public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }

    @Override
    double calculImpot() {
        return avecPiscine ? super.calculImpot() + 200 : super.calculImpot();
    }

    @Override
    public String toString() {
        return "Villa{" +
                "avecPiscine=" + avecPiscine +
                super.toString() +
                '}';
    }
}
