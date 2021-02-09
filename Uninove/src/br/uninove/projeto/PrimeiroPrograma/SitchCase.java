package br.uninove.projeto.PrimeiroPrograma;

import java.util.Scanner;

public class SitchCase {
 
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
 
        System.out.print("Informe um valor inteiro: ");
        int a = tec.nextInt();
 
        switch (a) {
            case 0:
                System.out.println("A variável recebeu o valor 0");
                break;
            case 1:
                System.out.println("A variável recebeu o valor 1");
                break;
            case 2:
                System.out.println("A variável recebeu o valor 2");
                break;
            default:
                System.out.println("A variável recebeu qualquer outro valor não testado acima\n");
        }
    }
}