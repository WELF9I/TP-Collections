public class Personne {
    private int cin;
    private String nom;
    private String prenom;
    Personne(int cin,String nom,String prenom){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
    }
    int getCin(){return this.cin;}
    String getNom(){return this.nom;}
    String getPrenom(){return this.prenom;}
    public void setCin(int cin){this.cin=cin;}
    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}

    @Override
    public String toString() {
        return "Personne{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
