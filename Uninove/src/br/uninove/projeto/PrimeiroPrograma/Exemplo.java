package br.uninove.projeto.PrimeiroPrograma;

import org.omg.PortableServer.POA;

public class Exemplo {
	 
    public static void main(String args[]) {
 
        //Cria o array que pode armazenar 4 pessoas:
        Pessoa listaPessoas[] = new Pessoa[4];
 
        //Pessoa 1
        listaPessoas[0] = new Pessoa(); //É preciso inicializar
        listaPessoas[0].nome = "Josefino Silvio Santos";
        listaPessoas[0].idade = 41;
        listaPessoas[0].email = "josefino@uninove.edu.br";
 
        //Pessoa 2
        listaPessoas[1] = new Pessoa();
 
        listaPessoas[1].nome = "Josefina Rodrigues";
        listaPessoas[1].idade = 20;
        listaPessoas[1].email = "josefina@uninove.edu.br";
 
        //Pessoa 3
        listaPessoas[2] = new Pessoa();
 
        listaPessoas[2].nome = "Jaspion";
        listaPessoas[2].idade = 90;
        listaPessoas[2].email = "jaspion909@uninove.edu.br";
 
        //Pessoa 4
        listaPessoas[3] = new Pessoa();
        listaPessoas[3].nome = "Power ranger azul";
        listaPessoas[3].idade = 35;
        listaPessoas[3].email = "lospowerranges@uninove.edu.br";
 
        //Vamos mostrar na tela os dados das pessoas ,usando o while:
        int i = 0;
        while (i <= 3) {
            System.out.println("Dados da pessoa " + (i + 1) + ":"); //i + 1 para deixar mais amigáve a exibição
            System.out.println("\t" + listaPessoas[i].nome);
            System.out.println("\t" + listaPessoas[i].idade);
            System.out.println("\t" + listaPessoas[i].email);
            i++; //Intera o i
        }
    }
}