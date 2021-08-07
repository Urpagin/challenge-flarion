package com.urpagin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nb = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choisit un nombre entier : ");
        String input = scanner.next();
        nb = Integer.parseInt(input);

        System.out.printf("\nLe nombre en Octal : %o%n", nb);
        System.out.printf("\n\nLe nombre en hexadécimal : %x", nb);

        scanner.close();
    }
}
