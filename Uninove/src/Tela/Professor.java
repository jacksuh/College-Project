package Tela;

public class Professor extends Pessoa{

	private double salario;
	private String dtContratacao;
	private long matricula;
	
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	public long getMatricula() {
		return matricula;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	
}
