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
        
        System.out.println("Digite a quantidade de numeros a ser mostrada");
        int numerosMostrados = scan.nextInt();
        System.out.println("Digite um multiplo qualquer");
        int m = scan.nextInt();
        int multiplos = m;
        for (int i = 0; i < numerosMostrados; i +=1) {
            System.out.println(multiplos);
            multiplos += m;
        }
    }
}


  
