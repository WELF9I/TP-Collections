package Tp3;

public class Compte {
    private static int count;
    private Personne titulaire;
    private int num;
    double solde;
    boolean estadecouvert;
    int decouvertmax,debitmax;
    Compte(Personne p){
        count++;
        num=count;
        titulaire=p;
        solde=0;
        decouvertmax=800;
        debitmax=1000;
    }
    Compte(Personne titulaire,double solde,int debitmax,int decouvertmax){
        count++;
        num=count;
        this.titulaire=titulaire;
        this.solde=solde;
        this.debitmax=debitmax;
        this.decouvertmax=decouvertmax;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "titulaire=" + titulaire +
                ", num=" + num +
                ", solde=" + solde +
                ", decouvertmax=" + decouvertmax +
                ", debitmax=" + debitmax +
                '}';
    }

    void debiter(double debit){
        if(this.debitmax>this.solde-debit){
            System.out.println("Can't");
        }
        else{
            System.out.println("Le montant est debite evec succes");
            this.solde=this.solde-debit;

        }
    }
    boolean retrait(double ret){
        if(this.decouvertmax<ret){
            System.out.println("Le debit est superieure a "+this.decouvertmax);
            return false;
        }
        else{
            this.debiter(ret);
            return true;
        }
    }
    public void crediter(double credit){
        this.solde=this.solde+credit;
    }
    void virement(double montant, Compte c1, Compte c2) {
    boolean retraitReussi = c1.retrait(montant);
    if (retraitReussi) {
        c2.crediter(montant);
        System.out.println("Virement réussi. Le montant "+montant+" transféré de " + c1.titulaire.getnom() + " à " + c2.titulaire.getnom());
    } else {
        System.out.println("Le virement n'a pas pu être effectué.");
    }
}
}


