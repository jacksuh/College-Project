package br.uninove.projeto.PrimeiroPrograma;
import java.util.InputMismatchException; //Algumas exceções precisam ter a classe de tratamento importada
import java.util.Scanner;
 
public class MatematicaComTry {
 
    public static void main(String args[]) {
 
        //Declaração das variáveis locais
        int a, b, resultado;
        Scanner teclado = new Scanner(System.in);
 
        try { //Bloco que será tratado
 
            //Leitura das variáveis
            System.out.print("Informe o 1º valor: ");
            a = teclado.nextInt();
 
            System.out.print("Informe o 2º valor: ");
            b = teclado.nextInt();
 
            //Calcula a divisão e imprime:
            resultado = a / b;
            System.out.println("O resultado da divisão é: " + resultado);
 
        } catch (ArithmeticException AE){  //Exeção de divisão por 0
            System.out.println("Divisão por zero não existe!");
        } catch (InputMismatchException IME){  //Exeção de tipo informado é diferente de inteiro
            System.out.println("O valor informado não é inteiro!");
        }
 
        System.out.println("\n\n\tO programa não pode continuar...!");
    }
    
}