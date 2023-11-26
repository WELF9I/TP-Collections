package Exercice2;

import java.util.Scanner;

public class Authentification {
    Scanner sc = new Scanner(System.in);
    public final String LoginCorrect = "scott";
    public final String PwdCorrect = "tiger";
    private String login;
    private String pwd;

    public void getUserLogin() throws WrongInputLength, WrongLoginException {
        System.out.println("Entrer login : ");
        this.login = sc.nextLine();
        if (login.length() > 10) {
            throw new WrongInputLength("Length > 10");
        }
        if (!login.equals(LoginCorrect)) {
            throw new WrongLoginException("Login incorrect");
        }
    }

    public void getUserPwd() throws WrongInputLength, WrongPwdException {
        System.out.println("Entrer Password : ");
        this.pwd = sc.nextLine();
        if (pwd.length() > 10) {
            throw new WrongInputLength("Length > 10");
        }
        if (!pwd.equals(PwdCorrect)) {
            throw new WrongPwdException("Password incorrect");
        }
    }

    public Authentification() throws WrongInputLength, WrongPwdException, WrongLoginException {
        getUserLogin();
        getUserPwd();
    }
}
