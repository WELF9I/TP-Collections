package pack1;

public class AgenceMobiliere {
    int max;
    int nb=0;
    private Vehicule tab[];
    AgenceMobiliere(int max){
        this.tab=new Vehicule[max];
        this.max=max;
    }
    void ajoutVehicule(Vehicule v){
        if(this.nb<this.max){
            this.tab[this.nb]=v;
            this.nb++;
        }
        else{
            System.out.println("Tableau plein !");
        }
    }
    void selection(int n){
        if(n>this.max || n<0){
            System.out.println("Case n'existe pas");
        }
        else if(n>=this.nb){
            System.out.println("Case vide ");
        }
        else{
            System.out.println(toString());
        }
    }

    void selection(String mq){
        boolean existe=false;
        for(int i=0;i<this.nb;i++) {
            if (this.tab[i].getMarque() == mq) {
                this.tab[i].decrisVehicule();
                existe = true;
            }
        }
            if(existe==false){
                System.out.println(" il n’y a pas de vehicules de cette marque !");}}

    void selection(double px){
        boolean existe=false;
        for(int i=0;i<this.nb;i++){
            if(tab[i].getPrix()<px){
                tab[i].decrisVehicule();
                existe=true;
            }
        }
        if(!existe){
            System.out.println("il n’y a pas de véhicules dans cette marge \n" +
                    "de prix");
        }
    }
    public static void main(String[] args) {
        Vehicule v=new Vehicule("Clio","Classique",2010,20.000);
        Vehicule w=new Vehicule("Mercedes","Fantome",2008,60.000);
        Vehicule x=new Vehicule("KIA","Picanto",2012,35.000);
        AgenceMobiliere t=new AgenceMobiliere(5);
        t.ajoutVehicule(v);
        t.ajoutVehicule(w);
        t.ajoutVehicule(x);
        for(int i=0;i< t.nb;i++){
                t.tab[i].decrisVehicule();}
        t.selection("Mercedes");
        t.selection(40.000);

        Vehicule z=t.tab[0];
        int index=0;
        for(int i=1;i< t.nb;i++){
            if(t.tab[i].getAnnee()<t.tab[index].getAnnee()){
                index=i;
                 z=t.tab[index];
            }
        }
        System.out.println("La voiture la plus ancienne dans le parking est : ");
        z.decrisVehicule();

}}
