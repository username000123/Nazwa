package pl.cg.nauka;

import java.time.LocalDate;

public class Uczen {

private String imie;
private String nazwisko;
private LocalDate dataUrodzenia;

private Plec plec;

    public Uczen(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;


    }

    public Uczen(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", plec=" + plec +
                '}';
    }
}


