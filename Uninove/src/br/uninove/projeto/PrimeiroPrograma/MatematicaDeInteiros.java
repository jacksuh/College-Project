package br.uninove.projeto.PrimeiroPrograma;

import java.util.Scanner;

public class MatematicaDeInteiros {
 
    public static void main(String args[]) {
 
        float x, y, resultado;
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Calculadora de valores positivos");
 
        System.out.print("\t Valor 1: ");
        x = teclado.nextFloat();
 
        System.out.print("\t Valor 2: ");
        y = teclado.nextFloat();
 
        try {
            if (y > x) {  //Se o valor a ser subtra�do for menor, sobre a exce��o
                throw new IllegalArgumentException("Y n�o pode ser subtra�do de X, pois � maior que X");
            } else {
                resultado = x - y;
                System.out.println("Resultado: " + resultado);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); //Imprime o erro
        }
    }
}