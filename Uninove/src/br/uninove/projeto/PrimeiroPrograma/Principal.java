package br.uninove.projeto.PrimeiroPrograma;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Informe o 1 valor:");
		x = leitor.nextInt();
		

		System.out.println("Informe o 2 valor:");
		y = leitor.nextInt();
		
		matematica mat = new matematica(x,y);
		
		
		System.out.println("-------------------------------------");
		System.out.println("O valor da Soma é: " + mat.soma());
		System.out.println("O valor que subtrai é: " + mat.subtrai());
		System.out.println("O valor de Multiplicacao é: " + mat.multiplica());
		System.out.println("O valor de Divisao é: " + mat.divide());
		System.out.println("-------------------------------------");
	}
	
	
}
