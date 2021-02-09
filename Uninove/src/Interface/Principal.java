package Interface;

import java.util.Scanner;
 
public class Principal {
 
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        //Vari�veis auxiliares:
        String nomeAux;
        double salarioAux;
        int diasAux;
 
        //Le os dados para um funcion�rio mensalista:
        System.out.print("Qual o nome do funcion�rio mensalista? ");
        nomeAux = teclado.next();
 
        System.out.print("Qual o valor do sal�rio bruto do funcion�rio mensalista?");
        salarioAux = teclado.nextDouble();
 
        //Constr�i um funcion�rio mensalista na mem�ria (inst�ncia)
        FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux, salarioAux);
 
        //Le os dados para um funcion�rio diarista:
        System.out.print("\nQual o nome do funcion�rio diarista? ");
        nomeAux = teclado.next(); //Pode usar a mesma vari�vel pois o funcion�rio mensalista j� foi constru�do.
 
        System.out.print("Qual o valor da hora deste funcion�rio diarista?");
        salarioAux = teclado.nextDouble();
 
        System.out.print("Quantos dias ele trabalhou?");
        diasAux = teclado.nextInt();
 
        //Cria a inst�ncia de um funcion�rio diarista na mem�ria, j� com os dados:
        FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
 
        //Agora vamos imprimir os dados de cada um e o sal�rio bruto (calculado):
        System.out.println("Dados e sal�rio do Funcion�rio mensalista: ");
        System.out.println("\tNome: " + fM.nome);
        System.out.println("\tSal�rio Bruto: " + fM.calcularSalarioLiquido());
 
        System.out.println("------\nDados e sal�rio do Funcion�rio diarista: ");
        System.out.println("\tNome: " + fD.nome);
        System.out.println("\tSal�rio Bruto: " + fD.calcularSalarioLiquido());
    }
}