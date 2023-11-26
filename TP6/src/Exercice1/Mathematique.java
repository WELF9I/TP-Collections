package Exercice1;

import static java.lang.Math.sqrt;

public class Mathematique {
	
    static double f(double n,double x) throws NegatifException, ParametreNullException{
    	if(n==0) {
    		throw new ParametreNullException("Erreur n=0");
    	}
    	 if (x < 0) {
             throw new NegatifException("La valeur de x ne peut pas être négative.");
         }
    	return sqrt(x)/n;
    	
    }
    public static void main(String[] args)  {
        double n;
        double x;
        
        try {
        	x=Double.parseDouble(args[1]);
            n=Double.parseDouble(args[0]);
            System.out.println(Mathematique.f(n,x));
        }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage()+ "\n Vous devez entrez deux parametres");
        }
        catch(NumberFormatException e) {
        	System.out.println(e.getMessage()+"\n Vous devez entrez deux parametres numérique");
        }catch (ParametreNullException e) {
            System.out.println(e.getMessage()+"\n Vous devez entrez des parametres non null");
            } catch (NegatifException e) {
        System.out.println(e.getMessage()+"\n Vous devez entrez des parametres positifs" );
    }
        
        
        finally {
        	System.out.println("finallyyyyyyy");
        }
        System.out.println("Fin de programme");
        
        }

}
