package com.company;

import java.util.Scanner;

public class JuegoDados {

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int dau1, dau2, dau3;
        int tiradas;
        int[] freq = new int[13]; //0-12

        System.out.println();
        System.out.println("\n\033[1;32mCuantas veces quieres tirar los dados? ");
        tiradas = scanner.nextInt();

        for (int i = 0; i < tiradas; i++) {
            dau1 = (int) (Math.random() * 6) + 1;
            dau2 = (int) (Math.random() * 6) + 1;
            dau3 = (int) (Math.random() * 6) + 1;
            freq[dau1 + dau2 + dau3]++;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.printf("%d --> %d\n", i, freq[i]);

        }
        System.out.println("\n\033[1;31m... Juego terminado");
    }
}

