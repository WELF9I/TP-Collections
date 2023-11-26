import time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface Promotion {
    DateTimeFormatter debutPromo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter finPromo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    float prixDeVente(String dateStr);
    default boolean estPeriodePromo(String dateStr) {
        LocalDate dateAchat = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate debutPromo = LocalDate.parse("19/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate finPromo = LocalDate.parse("31/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        return (dateAchat.isEqual(debutPromo)|| dateAchat.isAfter(debutPromo)) &&(dateAchat.isEqual(finPromo) ||dateAchat.isBefore(finPromo) );
    }
    static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
        double remise = ((prixAvantRemise-prixApresRemise)/prixAvantRemise) *100;
        return remise;
    }

}
