package com.company;
import java.util.Scanner;
// Pratica integradora grupo 11

public class Main {

    public static void main(String[] args) {
        Scanner scan;

        System.out.println("Digite aqui seu numero: ");


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


        System.out.println("Digite um número primo:");
        int numeroPrimo = scan.nextInt();

        if(ehPrimo(numeroPrimo)){
            System.out.println(numeroPrimo + "é primo.");
        }else{
            System.out.println(numeroPrimo + " não é primo");
        }

        System.out.println("Digite um número:");
        m = scan.nextInt();

        for(int i = 2;i <= m; i+=1){
            if(ehPrimo(i)){
                System.out.println(i + " é primo");
            }
        }

        System.out.println("Digite n:");
        int n = scan.nextInt();

        System.out.println("Digite m:");
        m = scan.nextInt();

        System.out.println("Digite d:");
        int d = scan.nextInt();

        int countN = 0;
        int testando = 0;

        while (countN < n){

            if(ocorrencias(testando, d) >= m){
                System.out.println(testando);
                countN += 1;
            }
            testando+= 1;
        }
        System.out.println("fim");


    }

    public static int ocorrencias ( Integer num, int algar){

        char[] charArr = num.toString().toCharArray();

        int contador = 0;
        for (char c: charArr){
            int n = Integer.parseInt(String.valueOf(c));
            if (n == algar) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean ehPrimo ( int numeroPrimo){

        for (int i = 2; i < numeroPrimo; i+=1){
            if(numeroPrimo % i == 0){
                return false;
            }
        }
        return true;
    }
}
