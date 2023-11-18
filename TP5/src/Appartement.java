public class Appartement extends ProprietePrivee{
    private int numEtage;
    Appartement(int id,Personne responsable,String adresse,double surface,int nbPieces,int numEtage){
        super(id,responsable,adresse,surface,nbPieces);
        this.numEtage=numEtage;
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "numEtage=" + numEtage +
                super.toString()+
                '}';
    }
}
