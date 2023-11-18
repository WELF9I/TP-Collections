public class ProprieteProfessionnelle extends Propriete {
    protected int nbEmployes;
    protected boolean estEtatique;

    @Override
    double calculImpot() {
        if(this.estEtatique==false){
            return surface+30*nbEmployes;
        }
        return 0;
    }
    ProprieteProfessionnelle(int id,Personne responsable,String adresse,double surface,int nbEmployes,boolean estEtatique){
        super(id,responsable,adresse,surface);
        this.nbEmployes=nbEmployes;
        this.estEtatique=estEtatique;
    }

    @Override
    public String toString() {
        return "ProprieteProfessionnelle{" +
                "nbEmployes=" + nbEmployes +
                ", estEtatique=" + estEtatique +
                super.toString()+
                '}';
    }
}
