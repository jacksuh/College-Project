package BancodeDados;

import java.util.List;
import java.util.ArrayList;


public class PrincipalInsere {
	public static void main(String args[]) {
 
        //Vamos inserir um carro novo no banco:
        //Cria a inst�ncia e seta os valores (voc� pode ler do teclado se quiser...)
        Carro carro = new Carro();
        carro.setAno(2019);
        carro.setCor("vermelho");
        carro.setFabricante("Fiat");
        carro.setAno(2020);
        carro.setModelo("Uno");
 
        //Note que n�o setamos o ID, pois ele � auto incrementado pelo banco!
        //Insere...
        CarrosDAO cD = new CarrosDAO();
        cD.insereCarro(carro);
        System.out.println("\n\nCarro inserido!\n\n");
 
        //Vamos listar todos os carros agora, para ver o novo caro na lista...
    }

}

