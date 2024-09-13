//TIPO ABSTRATO DE DADOS

import java.util.Random;

public class Luta {
	// ATRIBUTOS
	// O DESAFIADO/DESAFIANTE É UM LUTADOR, É UMA INSTANCIA DA CLASSE
	// LUTADOR(OBJETO)
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;

	// METODOS
	public void marcarLuta(Lutador l1, Lutador l2) {
		// O .equals é usado por comparar duas strings
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
			System.out.println("Luta marcada com sucesso!");
		} else { 
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("Os lutadores nao pertencem a mesma categoria");
		}
	}

	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("");
			System.out.println("IIIIIIIIIIIIIIIITS TIMEEEEEEEEE!");
			System.out.println("");
			this.getDesafiado().Apresentar();
			System.out.println("");
			System.out.println("Do outro lado...");
			System.out.println("");
			this.getDesafiante().Apresentar();
			
			Random aleatorio = new Random();
			
			int vencedor =  aleatorio.nextInt(3);// vai gerar 3 resultados. 0, 1 ou 2
			System.out.println("");
			switch (vencedor) {
			case 0:// empate
				this.desafiado.empatar();
				this.desafiante.empatar();
				System.out.println("Empatou!");
				break;
			case 1:// vitoria do desafiante
				this.desafiante.ganhar();
				this.desafiado.perder();
				System.out.println("O desafiante " + this.desafiante.getNome() + " venceu!");
				break;
			case 2:// vitoria do desafiado
				this.desafiante.perder();
				this.desafiado.ganhar();
				System.out.println("O desafiado " + this.desafiado.getNome() + " venceu!");
				break;
			}
		} else {
			System.out.println("A luta nao pode acontecer!");
		}
	}

	// METODOS ACESSORES
	private Lutador getDesafiado() {
		return desafiado;
	}

	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante() {
		return desafiante;
	}

	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	private int getRounds() {
		return rounds;
	}

	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	private boolean getAprovada() {
		return aprovada;
	}

	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
