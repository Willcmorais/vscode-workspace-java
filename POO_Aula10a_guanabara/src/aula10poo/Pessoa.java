package aula10poo;//AULA DE HERANÇA

//CLASSE MÃE/ PROGENITORA OU SUPERCLASSE
public class Pessoa {
	private String sexo, nome;
	private int idade;
	
	public void Status() {
		System.out.println("Nome " + this.getNome() + "idade " + this.getIdade() + "Sexo " + this.getSexo() + "Setor "
				+ this.setor + "trabalhando " + this.getTrabalhando());
	}
	
	public void fazerAniv() {
		this.idade++;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [sexo=" + sexo + ", nome=" + nome + ", idade=" + idade + "]";
	}

}
