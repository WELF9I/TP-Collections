public class Point {
    int abs,ord;
    char nom;
    Point(char nom,int abs,int ord){
        this.nom=nom;
        this.abs=abs;
        this.ord=ord;
    }
    Point(){
        nom='o';
        abs=2;
        ord=1;
    }
    Point(Point p){
        nom=p.nom;
        abs=p.abs;
        ord=p.ord;
    }
    void afficher(){
        System.out.println(nom+"("+abs+","+ord+")");
    }
    void deplacer(int a,int b){
        abs+=a;
        ord+=b;
    }
    void reset(){
        abs=0;
        ord=0;
    }
    @Override
    public String toString(){
        return nom+"("+abs+","+ord+")";
    }
    boolean  coïncide_V1 (Point p){
        return this.abs==p.abs && this.ord==p.ord;
    }
    static boolean  coïncide_V2 (Point px,Point py){
        return px.abs==py.abs && px.ord==py.ord;
    }



}
