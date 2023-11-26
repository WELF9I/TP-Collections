package Exercice2;

public class TestAuthentification {
    public static void main(String[] args) {
        boolean test = false;
        do {
            try {
                new Authentification();
                test = true;
                System.out.println("Authentification réussie");
            } catch (WrongInputLength e) {
                test = false;
                System.out.println(e.getMessage());
            } catch (WrongLoginException e) {
                test = false;
                System.out.println(e.getMessage());
            } catch (WrongPwdException e) {
                test = false;
                System.out.println(e.getMessage());
            } catch (Exception e) {
                test = false;
                System.out.println("Une erreur inattendue s'est produite.");
                e.printStackTrace();
                System.exit(0);
            }

        } while (!test);
    }
}
