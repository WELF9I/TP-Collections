package Tp3;

 class Personne {
    String nom,prenom,adresse;
    Personne(String nom,String prenom,String adresse){
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
    }
    void setprenom(String pr){
        prenom=pr;
    }
    String getprenom(){
        return prenom;
    }
    void setnom(String no){
        nom=no;
    }
    String getnom(){
        return nom;
    }
    void setadresse(String ad){
        adresse=ad;
    }
    String getadresse(){
        return adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
