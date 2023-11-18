public class ProprietePrivee extends Propriete{
    protected int nbPieces;

    @Override
    double calculImpot() {
        return 0.5*surface+10*nbPieces;
    }
    ProprietePrivee(int id,Personne responsable,String adresse,double surface,int nbPieces){
        super(id,responsable,adresse,surface);
        this.nbPieces=nbPieces;
    }

    @Override
    public String toString() {
        return "ProprietePrivee{" +
                "nbPieces=" + nbPieces +
                super.toString()+ '}';
    }
}
