import java.util.Scanner; 
public class Bienvenu { 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Quel est votre prenom ? "); 
String prenom = sc.nextLine(); 
System.out.println("Quel est votre age ? "); 
int age= sc.nextInt(); 
System.out.println("\nBienvenu " + prenom + " !"); 
System.out.println("\nVous avez " + age+ " ans."); 

} 
}