package BancodeDados;

public class updateCarro {
	public static void main(String args[]) {
		 
        //Vamos inserir um carro novo no banco:
        //Cria a inst�ncia e seta os valores (voc� pode ler do teclado se quiser...)
        Carro carro = new Carro();
        carro.setIdCarro(3);
        carro.setAno(2019);
        carro.setCor("Amarelo");
        carro.setFabricante("volvo");
        carro.setAno(2019);
        carro.setModelo("Amarula");
 
        //Note que n�o setamos o ID, pois ele � auto incrementado pelo banco!
        //Insere...
        CarrosDAO cD = new CarrosDAO();
        cD.updateCarro(carro);
        System.out.println("\n\nCarro inserido!\n\n");
 
        //Vamos listar todos os carros agora, para ver o novo caro na lista...
    }

}
