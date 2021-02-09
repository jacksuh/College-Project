package br.uninove.projeto.PrimeiroPrograma;

import java.util.Scanner;

public class PrincipalCalculadora {
	 
    public static void main(String args[]) {
        float numero1, numero2;
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
 
        System.out.print("Informe o 1º valor: ");
        numero1 = sc.nextFloat();
 
        System.out.print("Informe o 2º valor: ");
        numero2 = sc.nextFloat();
 
        //Seta na instância de Calculadora (calc) os valores a e b
        calc.setA(numero1);
        calc.setB(numero2);
 
        System.out.println("As quatro operações aplicadas ao valores " + calc.getA() + " e " + calc.getB() + " são");
        System.out.println("\tSoma: " + calc.soma());
        System.out.println("\tSubtrai: " + calc.subtrai());
        System.out.println("\tMultiplica: " + calc.multiplica());
        System.out.println("\tDivide: " + calc.divide());
    }
}