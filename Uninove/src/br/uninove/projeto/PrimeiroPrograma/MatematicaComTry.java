package br.uninove.projeto.PrimeiroPrograma;
import java.util.InputMismatchException; //Algumas exce��es precisam ter a classe de tratamento importada
import java.util.Scanner;
 
public class MatematicaComTry {
 
    public static void main(String args[]) {
 
        //Declara��o das vari�veis locais
        int a, b, resultado;
        Scanner teclado = new Scanner(System.in);
 
        try { //Bloco que ser� tratado
 
            //Leitura das vari�veis
            System.out.print("Informe o 1� valor: ");
            a = teclado.nextInt();
 
            System.out.print("Informe o 2� valor: ");
            b = teclado.nextInt();
 
            //Calcula a divis�o e imprime:
            resultado = a / b;
            System.out.println("O resultado da divis�o �: " + resultado);
 
        } catch (ArithmeticException AE){  //Exe��o de divis�o por 0
            System.out.println("Divis�o por zero n�o existe!");
        } catch (InputMismatchException IME){  //Exe��o de tipo informado � diferente de inteiro
            System.out.println("O valor informado n�o � inteiro!");
        }
 
        System.out.println("\n\n\tO programa n�o pode continuar...!");
    }
    
}