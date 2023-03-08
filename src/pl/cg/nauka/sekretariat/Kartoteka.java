package pl.cg.nauka.sekretariat;

import pl.cg.nauka.Uczen;

import java.util.List;

public interface Kartoteka {

    void dodajUcznia(Uczen uczen);

    void zmienDane(Uczen uczen);

    void zmienUcznia(String imie, String nazwisko);

    Uczen wyszukajUcznia(String imie, String nazwisko);

    List<Uczen> getUczniowie();

}
