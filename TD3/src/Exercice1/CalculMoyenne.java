package Exercice1;

import java.util.Scanner;
public class CalculMoyenne {
    public static void main(String[] args) {
        int nb;
        do {
            System.out.println("Saisir le nombre d'étudiants : ");
            Scanner scanner = new Scanner(System.in);
            nb=scanner.nextInt();
        } while (nb <= 0 || nb > Tab.NMAX);
        float[] noteCtrl = new float[nb];
        float[] noteExam = new float[nb];
        float[] moy = new float[nb];

        System.out.println("Saisie les notes du contrôle :");
        Tab.remplir(noteCtrl);
        Tab.lister(noteCtrl);

        System.out.println("Saisir les notes de l'examen :");
        Tab.remplir(noteExam);
        Tab.lister(noteExam);

        for (int i = 0; i < nb; i++) {
            moy[i] = (noteCtrl[i] + (2 * noteExam[i])) / 3;
        }

        System.out.println("Moyennes des étudiants :");
        Tab.lister(moy);
        float MoyClasse = Tab.somme_element(moy) / nb;
        System.out.println("Moyenne de la classe : " + MoyClasse);

        float[] Moybonus = Tab.additionner(1.5f, moy);

        System.out.println("Moyennes avec bonus de 1.5 :");
        Tab.lister(Moybonus);
    }
}
