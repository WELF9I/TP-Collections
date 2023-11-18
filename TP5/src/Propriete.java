import java.util.Objects;

abstract class Propriete {
    protected int id;
    protected Personne responsable;
    protected String adresse;
    protected double surface;

    @Override
    public String toString() {
        return "Propriete{" +
                "id=" + id +
                ", responsable=" + responsable +
                ", adresse='" + adresse + '\'' +
                ", surface=" + surface +
                +calculImpot()+
                '}';
    }

     abstract double calculImpot();
    Propriete(int id,Personne responsable,String adresse,double surface){
        this.id=id;
        this.responsable=responsable ;
        this.adresse=adresse;
        this.surface=surface;
    }
    Propriete(){}
    boolean equals(Propriete p){
        return (this.id==p.id) ;
                //&& (this.responsable.getNom().equals(p.responsable.getNom()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propriete propriete = (Propriete) o;
        return id == propriete.id;
                //&& Double.compare(propriete.surface, surface) == 0 && Objects.equals(responsable, propriete.responsable) && Objects.equals(adresse, propriete.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, responsable, adresse, surface);
    }
}
