package Interface;

public class FuncionarioDiarista implements Operacoes {
	 
    //Atributos:
    String nome;
    double valorDaHora;
    int diasTrabalhados;
 
    //Construtor
    public FuncionarioDiarista(String nome, double valorDaHora, int diasTrabalhados) {
        this.nome = nome;
        this.valorDaHora = valorDaHora;
        this.diasTrabalhados = diasTrabalhados;
    }
 
    //Sobrescrevendo (obrigatoriamente) o método de cálculo do salário:
    @Override
    public double calcularSalarioLiquido() {
        return (8 * valorDaHora) * diasTrabalhados;
    }
}