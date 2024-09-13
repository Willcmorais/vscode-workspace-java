package aula10poo;

//CLASSE FILHA QUE SE ESTENDE AS CARACTERÍSTICAS E COMPORTAMENTOS DA CLASSE MÃE
public class Professor extends Pessoa {
	private String especialidade, curso;

	public Professor() {
		super();
	}

	public void receberAum() {

	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
