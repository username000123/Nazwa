package pl.cg.nauka;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        var uczen1=new Uczen("Mario", "Kebab", LocalDate.of(2001, 6, 27));
        var uczen2=new Uczen("Rahul", "Ligma", LocalDate.of(1999, 3, 10));
        var uczen3=new Uczen("Rahul", "Ligma", Plec.Helikopter_bojowy);
        System.out.println(uczen1);
        System.out.println(uczen2);
        System.out.println(uczen3);
    }
}
