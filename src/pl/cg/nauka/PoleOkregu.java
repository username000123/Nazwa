package pl.cg.nauka;

import java.util.Scanner;

public class PoleOkregu{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj cos ");
        int r = scanner.nextInt();

        double wynik=Math.PI*r*r;
        System.out.print(wynik);


    }

}
