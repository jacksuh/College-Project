package br.uninove.projeto.PrimeiroPrograma;

import java.util.Scanner;

public class ComparaString {
	 
    public static void main(String args[]) {
        //Declaracoes
        String nome1, nome2;
        Scanner tec = new Scanner(System.in);
 
        //Leitura
        System.out.print("Informe o 1� nome: ");
        nome1 = tec.next();
 
        System.out.print("Informe o 2� nome: ");
        nome2 = tec.next();
 
        //compara deconsiderando a caixa:
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("\nOs nomes digitados s�o iguais!");
        } else {
            System.out.println("\nOs nomes digitados s�o diferentes!");
        }
    }
}