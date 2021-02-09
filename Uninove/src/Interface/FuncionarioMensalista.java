package Interface;

public class FuncionarioMensalista implements Operacoes {
	 
    //Atributos:
    String nome;
    double salario;
 
    //Construtor que recebe parâmetros de entrada e seta localmente
    public FuncionarioMensalista(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
 
    //Sobrescrevendo (obrigatoriamente) o método de cálculo do salário:
    @Override
    public double calcularSalarioLiquido() {
        return this.salario - this.salario * 27.5 / 100;
    }
}