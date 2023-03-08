package pl.cg.nauka;

import java.util.Random;

public class dowhile {

    public static void main(String[] args) {
        Random generator = new Random();
        int liczba = 5, los = 0;
        int iteracje = 0;
        int najmniejsza = 100;
        int najwieksza = 0;
        double suma = 0;

        do{
            los = generator.nextInt(100);
            System.out.println("wylosowałem: " + los);
            iteracje ++;
            suma=suma+los;

        if(los > najwieksza){
            najwieksza = los;


            }

            if(los < najmniejsza){
                najmniejsza = los;

            }




        } while (iteracje < 5);

        System.out.println("Najwieksza wylosowana:  " + najwieksza);
        System.out.println("Najmniejsza wylosowana:  " + najmniejsza);
        System.out.println("suma" + suma/5);
        double srednia = suma/5;
        System.out.println("srednia" + srednia);
    }
}


