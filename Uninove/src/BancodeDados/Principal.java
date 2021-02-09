package BancodeDados;


import java.util.ArrayList;
import java.util.List;
 
public class Principal {
 
    public static void main(String args[]) {
        listaTodosCarros();
    }
 
    //M�todo de listagem de todos os carros
    public static void listaTodosCarros() {
 
        //Cria uma inst�ncia de CarrosDAO na mem�ria
        CarrosDAO carro = new CarrosDAO();
 
        //Cria a lista de carros local, que ser� preenchida
        List<Carro> listaDeCarros = new ArrayList<Carro>();
 
        //Obt�m a lista de carros atrav�s do objeto
        listaDeCarros = carro.getListaDeCarros();
 
        //Come�a a imprimir os dados
        System.out.println("ID\t|\tMarca\t|\tModelo\t|\tAno\t|\tCor\t|\tKm\t|\tPre�o");
        System.out.println("----\t|\t-----\t|\t------\t|\t---\t|\t---\t|\t------\t|\t----");
        for (Carro carroLocal : listaDeCarros) { //Iterator: Para cada carro na list de carros...
            System.out.print(carroLocal.getIdCarro() + "\t|\t");
            System.out.print(carroLocal.getFabricante() + "\t|\t");
            System.out.print(carroLocal.getModelo() + "\t|\t");
            System.out.print(carroLocal.getAno() + "\t|\t");
            System.out.print(carroLocal.getCor() + "\t|\t");
            System.out.println();
        }
    }
}