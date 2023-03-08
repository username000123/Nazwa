package pl.cg.nauka;

import java.util.Random;

public class totolot {


    public static void main(String[] args) {
        Random generator = new Random();
        int los2 = 0;
        int losowanie = 0;
        int los1 = 0;
        while (los1 != 7 || los2 != 2) {

            los1 = generator.nextInt(10);
            losowanie++;

            los2 = generator.nextInt(10);


        }
        System.out.println("Wylosowano 7 i 2 w " + losowanie);
        System.out.println(los1);
        System.out.println(los2);

    }


}