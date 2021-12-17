package com.company;
import java.util.Scanner;
// Pratica integradora grupo 11

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite aqui seu numero: ");
        Scanner scan;
        scan = new Scanner(System.in);
        int numeroInteiro = scan.nextInt();
        int numeroPar = 0;
        for (int i = 0; i < numeroInteiro; i += 1) {
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
        System.out.println("digite um numero primo");
        int numeroPrimo = scan.nextInt();
        boolean ehPrimo = true;

        for (int i = 2; i < numeroPrimo; i+=1){
            if(numeroPrimo % i == 0){
                System.out.println(numeroPrimo + "não é primo");
                ehPrimo = false;
                break;
            }
        }
        if(ehPrimo){
            System.out.println(numeroPrimo + "é primo");
        }
    }
}


  
