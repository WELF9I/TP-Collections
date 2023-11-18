public class Salarie {
    protected int Matricule;
    protected String Nom;
    protected double Recrutement;
    Salarie(){

    }
    Salarie(int Matricule,String Nom,double Recrutement){
        this.Matricule=Matricule;
        this.Nom=Nom;
        this.Recrutement=Recrutement;
    }
    int getMatricule(){
        return Matricule;
    }
    String getNom(){
        return Nom;
    }
    double getRecrutement(){
        return Recrutement;
    }

    void setMatricule(int m){
        this.Matricule=m;
    }
    void setNom(String n){
        this.Nom=n;
    }
    void setRecrutement(double r){
        this.Recrutement=r;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "Matricule=" + Matricule +
                ", Nom='" + Nom + '\'' +
                ", Recrutement=" + Recrutement +
                '}';
    }
    void Affiche(){
        System.out.println("C'est un "+this.getClass().getSimpleName());
        System.out.println(toString());
    }
    double salaire(){
        if(Recrutement<2005){
            return 400.0;
        }
        return 280.0;
    }
}

