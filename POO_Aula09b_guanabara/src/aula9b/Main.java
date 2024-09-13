package aula9b;

public class Main {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[4];

		p[0] = new Pessoa("Pedro", "M", 22);
		p[1] = new Pessoa("Will", "M", 27);
		p[2] = new Pessoa("Victoria", "F", 24);
		l[0] = new Livro(p[0], "Como ser um milionário", "Jackie Chan", 255, 0, false);
		l[1] = new Livro(p[1], "Anjos e demonios", "Monange", 360, 0, false);
		l[2] = new Livro(p[2], "Código da vinci", "Clarisse lispector", 587, 0, false);
		l[3] = new Livro(p[2], "Código limpo", "Martin", 307, 0, false);
		
		l[0].abrir();
		l[0].folhear(800);
		l[0].detalhes();
		System.out.println();
		l[1].folhear(15);
		l[1].detalhes();
		System.out.println();
		l[2].detalhes();
		System.out.println();
		l[3].detalhes();

	}

}
