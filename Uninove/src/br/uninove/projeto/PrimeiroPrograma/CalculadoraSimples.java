package br.uninove.projeto.PrimeiroPrograma;

//importa a classe Scanner para ser utilizada aqui:
import java.util.Scanner;

public class CalculadoraSimples {

  public static void main(String[] args) {

      //Declaracao do scanner:
      Scanner leitor = new Scanner(System.in);

      //Declaracao das variavies que serao utilizadas:
      float peso, altura, imc;

      //Leitura do teclado:
      //Informacao de instrucoes para o usuário:
      System.out.print("Informe o PESO: ");

      //le e armazena o valor do peso:
      peso = leitor.nextFloat(); //Le um valor de ponto flutuante

      //le e armazena o valor da altura:
      System.out.print("Informe a ALTURA: ");
      altura = leitor.nextFloat(); //Le um valor de ponto flutuante

      //calcula:
      imc = peso / (altura * altura);

      //Imprime o resultado
      //Note que pode-se concatenar o resultado com a impressao de texto
      System.out.println("\n\tO IMC desta pessoa é " + imc + "\n\n");

  }
}