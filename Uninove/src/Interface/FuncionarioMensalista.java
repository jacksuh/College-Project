package Interface;

public class FuncionarioMensalista implements Operacoes {
	 
    //Atributos:
    String nome;
    double salario;
 
    //Construtor que recebe par�metros de entrada e seta localmente
    public FuncionarioMensalista(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
 
    //Sobrescrevendo (obrigatoriamente) o m�todo de c�lculo do sal�rio:
    @Override
    public double calcularSalarioLiquido() {
        return this.salario - this.salario * 27.5 / 100;
    }
}