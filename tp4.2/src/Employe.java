public class Employe extends Salarie{
    private double Hsupp;
    private double PHsupp;

    Employe(int Matricule,String Nom,double Recrutement,double Hsupp,double PHsupp){
        super(Matricule,Nom,Recrutement);
        this.Hsupp=Hsupp;
        this.PHsupp=PHsupp;
    }
    double getHsupp(){
        return Hsupp;
    }
    double getPHsupp(){
        return PHsupp;
    }

    void setHsupp(double h){
        this.Hsupp=h;
    }
    void setPHsupp(double ph){
        this.PHsupp=ph;
    }

    @Override
    void Affiche() {
        super.Affiche();
        System.out.println("Le nombre d'heure supplémentaires est :"+Hsupp);
        System.out.println("Le prix d'heure supplémentaires est :"+PHsupp);
    }

    @Override
    double salaire() {
        return (super.salaire()+(Hsupp*PHsupp));
    }

}
