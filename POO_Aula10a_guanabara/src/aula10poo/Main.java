package aula10poo;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario("Will", 19, "M", "Administrativo", true);

		p4.Status();;
	}

}
