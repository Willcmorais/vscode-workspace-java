package aula10poo;

//CLASSE FILHA QUE SE ESTENDE AS CARACTERÍSTICAS E COMPORTAMENTOS DA CLASSE MÃE
public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;

	public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {

	}

	public void mudarTrab() {
		this.setTrabalhando(false);
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
