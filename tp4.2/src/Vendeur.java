public class Vendeur extends Salarie{
    private double Vente;
    private double Pourcentage;
    Vendeur(int Matricule,String Nom,double Recrutement,double Vente,double Pourcentage){
        super(Matricule,Nom,Recrutement);
        this.Vente=Vente;
        this.Pourcentage=Pourcentage;
    }
    double getVente(){
        return Vente;
    }
    double getPPourcentage(){
        return Pourcentage;
    }

    void setHsupp(double v){
        this.Vente=v;
    }
    void setPHsupp(double p){
        this.Pourcentage=p;
    }

    @Override
    void Affiche() {
        super.Affiche();
        System.out.println("Taux de vente en dinars effectuée par mois est :"+Vente);
        System.out.println("Pourcentage sur ce taux de vente est :"+Pourcentage);

    }
    @Override
    double salaire() {
        return (super.salaire()+(Vente*Pourcentage));
    }
}
