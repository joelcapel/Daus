package com.company;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int dau1, dau2;
        int tirades;
        int [] freq = new int[13]; //0-12

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantes vegades vols tirar els daus? ");
        tirades = scanner.nextInt();

        for (int i = 0; i < tirades; i++) {
            dau1 = (int) (Math.random()*6)+1;
            dau2 = (int) (Math.random()*6)+1;
            freq[dau1+dau2]++;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.printf("%d --> %d\n",i,freq[i]);

        }
    }
}
