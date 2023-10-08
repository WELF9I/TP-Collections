public class TestPoint {
    public static void main(String[] args){
        Point p2=new Point();
        p2.afficher();
        p2.deplacer(1,-2);
        System.out.println("Afficher le point apres la deplacement :");
        p2.afficher();
        Point p1=new Point('A',3,5);
        p1.afficher();
        Point p3=new Point(p2);
        System.out.print( "P1:");
        System.out.println(p1);
        System.out.print( "P2:");
        System.out.println(p2);
        System.out.print( "P3:");
        System.out.println(p3);
        //System.out.println(p1==p2);
        //System.out.println(p1==p3);
        //System.out.println(p2==p3);
        System.out.println(p1.coïncide_V1(p2));
        System.out.println(Point.coïncide_V2(p2,p3));

        //Exercice2

        Cercle c1= new Cercle(p1, 10);
        Cercle c2= new Cercle(p2, 12.5);
        c1.afficher_cercle();
        System.out.println(Cercle.coïncide_cercle(c1,c2));
    }
}
