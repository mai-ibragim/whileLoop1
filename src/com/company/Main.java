package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib bitte zwei Zahlen ein. Erste Zahl: ");
        int eins = scan.nextInt();
        System.out.println("Zweite Zahl: ");
        int zwei = scan.nextInt();

        while(eins <= zwei) {
            System.out.println(eins + " * " + eins + " = " + eins * eins);
            eins++;
        }
    }
}
