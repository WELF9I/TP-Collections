package time;

import java.time.format.DateTimeFormatter;

public class LocalDate {
    private int jour;
    private int mois;
    private int annee;

    public LocalDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    public static LocalDate parse(String s, DateTimeFormatter dateTimeFormatter) {
        java.time.temporal.TemporalAccessor temporalAccessor = dateTimeFormatter.parse(s);
        int jour = java.time.temporal.TemporalQueries.localDate().queryFrom(temporalAccessor).getDayOfMonth();
        int mois = java.time.temporal.TemporalQueries.localDate().queryFrom(temporalAccessor).getMonthValue();
        int annee = java.time.temporal.TemporalQueries.localDate().queryFrom(temporalAccessor).getYear();
        return new LocalDate(jour, mois, annee);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", jour, mois, annee);
    }

    public boolean isEqual(LocalDate autreDate) {
        return this.jour == autreDate.jour && this.mois == autreDate.mois && this.annee == autreDate.annee;
    }
    public boolean isAfter(LocalDate autreDate) {
        if (this.annee > autreDate.annee) return true;
        if (this.annee < autreDate.annee) return false;
        if (this.mois > autreDate.mois) return true;
        if (this.mois < autreDate.mois) return false;
        return this.jour > autreDate.jour;
    }

    public boolean isBefore(LocalDate autreDate) {
        if (this.annee < autreDate.annee) return true;
        if (this.annee > autreDate.annee) return false;
        if (this.mois < autreDate.mois) return true;
        if (this.mois > autreDate.mois) return false;
        return this.jour < autreDate.jour;
    }
}
