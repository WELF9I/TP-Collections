import java.util.Scanner; 
public class prix { 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Donner le prix du produit : "); 
float Prix = sc.nextFloat();
System.out.println("Donner le pourcentage de la remise : "); 
float remise = sc.nextFloat(); 
float prix_ar=Prix-Prix*remise/100;
System.out.println("Le prix avec remise est :"+prix_ar); 
} 
}