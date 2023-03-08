package pl.cg.nauka;

import java.util.Arrays;

public class tablica {
    public static void main(String[] args) {
        int[] tablica = new int[5];
        long[] tablica2 = {4, 6, 8, 3};
        Long[] tablica3 = new Long[10];
        tablica3[0] = 35L;
        for (int i = 0; i < tablica3.length; i++){
            tablica3[i] = Long.valueOf(i);
        }

        int[] tablica4 = new int[50];
        int x = 0;
        for (int i = 100; i > 0; i--){
            if (i % 2 == 0){
                tablica4[x] = i;
                x = x + 1;

            }
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(tablica2));
        System.out.println(Arrays.toString(tablica3));
        System.out.println(tablica3);
        System.out.println(Arrays.toString(tablica4));
    }
}
