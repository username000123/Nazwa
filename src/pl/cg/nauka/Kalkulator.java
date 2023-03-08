package pl.cg.nauka;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        System.out.println("Program Kalkulator, wybierz opcje:");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnozenie");
        System.out.println("4 - dzielenie");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();

        if(wybor < 1 || wybor > 4) {
            throw new IllegalArgumentException("Prosze wybrac opcje od 1-4");
        }

        if (wybor == 1) {
            System.out.println("Prosze wybrac pierwsza liczbe");
            int liczba1 = scanner.nextInt();

            System.out.println("Prosze wybrac druga liczbe");
            int liczba2 = scanner.nextInt();

            double wynik = liczba1 + liczba2;
            System.out.println("Wynik = " + wynik);



        }

        if (wybor == 2) {
            System.out.println("Prosze wybrac pierwsza liczbe");
            int liczba1 = scanner.nextInt();

            System.out.println("Prosze wybrac druga liczbe");
            int liczba2 = scanner.nextInt();

            double wynik = liczba1 - liczba2;
            System.out.println("Wynik = " + wynik);



        }



        if (wybor == 3) {
            System.out.println("Prosze wybrac pierwsza liczbe");
            int liczba1 = scanner.nextInt();

            System.out.println("Prosze wybrac druga liczbe");
            int liczba2 = scanner.nextInt();

            double wynik = liczba1 * liczba2;
            System.out.println("Wynik = " + wynik);



        }

        if (wybor == 4) {
            System.out.println("Prosze wybrac pierwsza liczbe");
            double liczba1 = scanner.nextDouble();

            System.out.println("Prosze wybrac druga liczbe");
            double liczba2 = scanner.nextDouble();

            double wynik = liczba1 / liczba2;
            System.out.println("Wynik = " + wynik);



        }








    }
}