package com.company;
import java.util.Scanner;
// Pratica integradora grupo 11

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite aqui seu numero: ");
        Scanner scan;
        scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numeroPar = 0;
        for (int i = 0; i < n; i += 1) {
            System.out.println(numeroPar);
            numeroPar += 2;
        }
    }
}
