package pl.cg.nauka;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Dataczas {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Instant.now());

        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant koniec = Instant.now();
        Duration roznica = Duration.between(start, koniec);
        long sekundy = roznica.toSeconds();
        long dni = roznica.toDays();
        System.out.println(sekundy);

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
        LocalDate teraz = LocalDate.of(2007, Month.OCTOBER, 26);
        System.out.println(teraz);

        System.out.println(teraz.getDayOfYear());
        System.out.println(teraz.getDayOfWeek());

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant instant = zdt.toInstant();
        ZonedDateTime terazUSA = instant.atZone(ZoneId.of("America/New_York"));
        System.out.println("Nasz: " + zdt);
        System.out.println("Usa: " + terazUSA);

        var dataurodzin = LocalDate.of(2007, Month.OCTOBER, 26);
        var dzisiaj = LocalDate.now();

        System.out.println((dataurodzin.until(dzisiaj, ChronoUnit.DAYS)));


    }
}
