//A CLASSE CONTROLE REMOTO IMPLEMENTA O CONTROLADOR
public class ControleRemoto implements Controlador {
	// ATRIBUTOS
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// METODO CONSTRUTOR
	public void ControleRemoto() {
		this.volume = 20;
		this.ligado = false;
	}

	// METODOS DA INTERFACE
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("");
		System.out.println("A TV esta ligada? " + this.getLigado());
		System.out.println("Esta tocando algo? " + this.getTocando());
		System.out.print("O Volume esta em " + this.getVolume());
		for (int i = 0; i < this.getVolume(); i += 5) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			if (this.getVolume() <= 100 && this.getVolume() >= 0) {
				this.setVolume(this.getVolume() + 5);
			} else {
				System.out.println("O volume ja esta no maximo");
			}
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			if (this.getVolume() >= 0 && this.getVolume() <= 100) {
				this.setVolume(this.getVolume() - 5);
			} else {
				System.out.println("O volume ja esta no minimo");
			}
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(0);
				System.out.println("O mute esta ativo");
			} else {
				System.out.println("O volume ja esta no minimo");
			}
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() == 0) {
				this.setVolume(20);
				System.out.println("Mute desativado");
			}
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
			System.out.println("Tocando...");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
			System.out.println("Pausando reproducao...");
		}
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
}
