package aula9b;

public class Pessoa {
	// ATRIBUTOS
	private String nome, sexo;
	private int idade;

	// MÉTODO CONSTRUTOR
	public Pessoa(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	// METODOS
	public void fazerAniver() {
		this.idade++;
	}

	// METODOS ACESSORES
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
