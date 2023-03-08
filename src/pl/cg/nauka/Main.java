package pl.cg.nauka;

/*
dłuuugi komentarz uuuuuuuuuuuuuuu skeri
halołin */
public class Main {
    public static void main(String[] args) {

        double bokA = 5;
        int bokB = 10;
        double wynik = bokA / bokB;
        int liczba = 100;
        liczba = liczba - 10;
        liczba -= 23;
        liczba += 2;
        liczba++;
        liczba--;


        System.out.println("pom pom dzie dzie " + liczba);
        System.out.println(Math.pow(2, 4));
        System.out.println(poleKwadratu(6,  9));
        System.out.println(dzielenieKwadratu(25, -5));
    }

    static int poleKwadratu(int a, int b) {
        return a * b;
    }
    static double dzielenieKwadratu(double a, double b){
        if(b==0){
            throw new IllegalArgumentException("kreatywny komunikat dotyczący nie dzielenia przez 0");
        }
        if(a<0){
            throw new IllegalArgumentException("bababoey a");
        }
        if (b < 0) {
            throw new IllegalArgumentException("bababoey b");

        }
        return a / b;

    }
    



}