package Tela;

public class Aluno extends Pessoa {

	private String curso;
	private float notaVestibular;
	private long registroAcademico;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNotaVestibular() {
		return notaVestibular;
	}
	public void setNotaVestibular(float notaVestibular) {
		this.notaVestibular = notaVestibular;
	}
	public long getRegistroAcademico() {
		return registroAcademico;
	}
	public void setRegistroAcademico(long registroAcademico) {
		this.registroAcademico = registroAcademico;
	}
	
	
}
