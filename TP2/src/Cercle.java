public class Cercle {
    double rayon;
    Point p;

    Cercle(Point p, double r) {
        this.p = p;
        rayon = r;
    }
    void afficher_cercle() {
        System.out.println("Le centre du cercle " + p.nom +" avec les cordonnees ("+p.abs+","+p.ord+") et de rayon "+rayon);
    }
    void deplacer_cercle(int a, int b) {
        p.deplacer(a,b);
    }
    static boolean coïncide_cercle(Cercle c1, Cercle c2) {
		if ((c1.p.abs==c2.p.abs) && (c1.p.ord==c2.p.ord) && (c1.rayon==c2.rayon))
			{return true;}
		else
            {return false;}

    }
}
