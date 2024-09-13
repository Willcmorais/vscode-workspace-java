import java.util.Scanner;

public class Vetores {// Classe de vetores
	Scanner sc = new Scanner(System.in);// metodo scanner para ler entradas no teclado
	// ATRIBUTOS
	private int[] idade = new int[2];// variavel inteira com x espaços
	private String[] nome = new String[2];// variavel de caracter com x espaços
	private String buscaDados, elemento;
	private int i;// contador
	private boolean encontrou;

	private int[] getIdade() {
		return idade;
	}

	private String[] getNome() {
		return nome;
	}

	private String getBuscaDados() {
		return buscaDados;
	}

	private void setBuscaDados(String buscaDados) {
		this.buscaDados = buscaDados;
	}

	private String getElemento() {
		return elemento;
	}

	private void setElemento(String elemento) {
		this.elemento = elemento;
	}

	private boolean getEncontrou() {
		return encontrou;
	}

	private void setEncontrou(boolean encontrou) {
		this.encontrou = encontrou;
	}

	// METODO
	public void NomeIdade() {// metodo que vai ler e immprimir os vetores inteiros digitados
		for (i = 0; i < this.getNome().length; i++) {
			System.out.println("Informe o " + (i + 1) + "º nome: ");
			this.nome[i] = sc.next();// salva os nomes
			System.out.println("Informe a idade de " + this.nome[i] + ":");
			this.idade[i] = sc.nextInt();// salva as idades
		}
		System.out.println("Qual nome deseja coletar informação? ");
		this.setBuscaDados(sc.next());

		this.setEncontrou(false);
		for (i = 0; i < this.getNome().length; i++) {
			this.setElemento(this.nome[i]);
			if (this.getElemento().equalsIgnoreCase(this.getBuscaDados())) {// para comparar strings
				this.setEncontrou(true);
				break;
			}
		}
		if (this.getEncontrou()) {
			System.out.println(this.getNome() + ", " + this.getIdade() + " anos.");
		} else {
			System.out.println("Dados não constam no sistema.");
		}
	}
}
