package Exercice1;

import java.util.Scanner;
 public class Tab {
     public static int NMAX=40;
    static void remplir(float t[]){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            System.out.print("Entrez la valeur à la position " + i + ": ");
            t[i] = scanner.nextFloat();
        }
    }
     static float somme_element(float t[]){
         float s = 0;
         for (float valeur : t) {
             s += valeur;
         }
         return s;
     }
     static float[] additionner(float t1[],float t2[]){
         if (t1.length != t2.length) {
             System.out.println("Les tableaux doivent etre de même longueur");
             return t1;
         }
         else{
             float[] add = new float[t1.length];
             for (int i = 0; i < t1.length; i++) {
                 add[i] = t1[i] + t2[i];
             }
             return add;
         }
     }
     static float[] additionner(float x,float t[]){
         float[] add = new float[t.length];
         for (int i = 0; i < t.length; i++) {
             add[i] = x + t[i];
         }
         return add;
     }
     static float[] produit(float x,float t[]){
         float[] prod = new float[t.length];
         for (int i = 0; i < t.length; i++) {
             prod[i] = x * t[i];
         }
         return prod;
     }
     static void lister(float t[]){
         for (int i = 0; i < t.length; i++) {
             System.out.println("t[" + i + "] = " + t[i]);
         }
     }

}
