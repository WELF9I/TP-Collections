package pack1;

public class Vehicule {
    private  int num;
    private int annee;
    private static int count;
    private double prix;
    private String marque;
    private String modele;
    Vehicule(String marque, String modele, int annee, double prix){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
        this.prix=prix;
        this.count++;
        this.num=count;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                " annee=" + annee +
                ", prix=" + prix +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                '}';
    }

    void decrisVehicule(){
        System.out.println(toString());
    }
    String getModele(){return modele;}
    void setModele(String mod){
        modele=mod;
    }
    String getMarque(){return marque;}
    void setMarque(String ma){
        marque=ma;
    }
    double getPrix(){return prix;}
    void setPrix(double pr){
        prix=pr;
    }
    int getCount(){return count;}
    int getAnnee(){return annee;}
}

