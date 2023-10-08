package Tp3;
public class Main {
    public static void main(String[] args) {
            Personne p1=new Personne("Welfei","Mohamed Amine","BBR");
            Personne p2=new Personne("Omri","Ahmed","Fous");
            Personne p3=new Personne("Lapino","Amine","M.Tmim");
            Compte c1=new Compte(p1,2000,-600,500);
            Compte c2=new Compte(p2,1000,-600,400);
            Compte c3=new Compte(p3,3000,-600,800);
            Compte tab[]=new Compte[3];
            tab[0]=c1;
            tab[1]=c2;
            tab[2]=c3;
            for(int i=0;i<3;i++){
                System.out.println(tab[i]);
            }
        c3.virement(200, c1, c2);

    }
    }
