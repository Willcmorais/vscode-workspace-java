package aula10poo;

//CLASSE FILHA QUE SE ESTENDE AS CARACTERÍSTICAS E COMPORTAMENTOS DA CLASSE MÃE
public class Aluno extends Pessoa {
	private int matricula;
	private String curso;

	public Aluno() {
		super();
	}

	public void cancelarMatr() {

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
