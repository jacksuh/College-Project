package br.uninove.projeto.PrimeiroPrograma;

import java.util.ArrayList;

public class ExemploArrayList {
 
    public static void main(String args[]) {
 
        //Criando a lista do tipo pessoa
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
 
        //Cria um objeto de "Pessoa" para podemos adiciona-lo a lista
        Pessoa pessoaLocal = new Pessoa();
        pessoaLocal.nome = "Sonic";
        pessoaLocal.idade = 200;
        pessoaLocal.email = "sonic@uninove.edu.br";
 
        //Adiciona a pessoa a lista:
        listaPessoas.add(pessoaLocal);
 
        //J� que a pessoa criada j� foi acrescentada � lista,
        //podemos reaproveitar a vari�vel local para acrescentar outra pessoa:
        pessoaLocal = new Pessoa(); //"reseta" a vari�vel para poder ser reutilizada
        pessoaLocal.nome = "Lara Croft";
        pessoaLocal.idade = 21;
        pessoaLocal.email = "laracroftJava@uninove.edu.br";
 
        //Acrescenta:
        listaPessoas.add(pessoaLocal);
 
        //Mais uma pessoa
        pessoaLocal = new Pessoa(); //"reseta" a vari�vel para poder ser reutilizada
        pessoaLocal.nome = "Mario Bross";
        pessoaLocal.idade = 180;
        pessoaLocal.email = "donkeykongnaomepega@uninove.edu.br";
 
        //acrescenta:
        listaPessoas.add(pessoaLocal);
 
        //S� mais uma pessoa
        pessoaLocal = new Pessoa(); //"reseta" a vari�vel para poder ser reutilizada
        pessoaLocal.nome = "Jaspion";
        pessoaLocal.idade = 89;
        pessoaLocal.email = "jaspionJava@uninove.edu.br";
        listaPessoas.add(pessoaLocal);
 
        //Percorrendo a lista com um la�o e acessando seus �tens
        for (int i = 0; i <= listaPessoas.size() - 1; i++) {
            System.out.println("Imprimindo dados da posi��o: " + i);
            System.out.println("\t- Nome: " + listaPessoas.get(i).nome);
            System.out.println("\t- Idade: " + listaPessoas.get(i).idade);
            System.out.println("\t- E-Mail: " + listaPessoas.get(i).email);
            System.out.println("------------------");
        }
 
        //Vamos procurar a pessoa que chama-se "Jaspion" e remove-la da lista
        //Para isso, � preciso percorrer a lista, procurando o nome e,
        //quando for encontrado, guardar o �ndice que a pessoa est�.
        int posicaoRemovida = -999; //Vari�vel auxiliar para remo��o; um n�mero qualquer
        for (int j = 0; j < listaPessoas.size(); j++) {
            if (listaPessoas.get(j).nome.equals("Jaspion")) { //Se encontrar...
                posicaoRemovida = j; // Atribui a vari�vel o valor do �NDICE
                break; //se j� encontrou, o loop pode parar
            }
        }
        //Verifica se a vari�vel auxiliar foi alterara. Se sim, remove
        if (posicaoRemovida != -999) {
            listaPessoas.remove(posicaoRemovida); //Remove na posi��o encontrada
            System.out.println(" >> O Jaspion estava na posi��o " + posicaoRemovida);
        }
 
        //Para ter certeza da remo��o, vamos percorrer e imprimir a lista novamente,
        //mas s� os nomes agora:
        System.out.println("Imprimindo os nomes da lista, ap�s a remo�ao do Jaspion: ");
        for (int k = 0; k < listaPessoas.size(); k++) {
            System.out.println("\t" + k + " - " + listaPessoas.get(k).nome);
        }
    }
}