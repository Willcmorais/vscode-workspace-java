import java.util.Scanner;

public class LerIdade {
	Scanner sc = new Scanner(System.in);
	private int anos, meses, dias;

	private int getAnos() {
		return anos;
	}

	private void setAnos(int anos) {
		this.anos = anos;
	}

	private int getMeses() {
		return meses;
	}

	private void setMeses(int meses) {
		this.meses = meses;
	}

	private int getDias() {
		return dias;
	}

	private void setDias(int dias) {
		this.dias = dias;
	}

	private int getId() {
		return (this.getAnos() * 365) + (this.getMeses() * 30) + this.getDias();
	}

	public void Leitor() {
		System.out.println("Quantos anos você tem: ");
		this.setAnos(sc.nextInt());
		System.out.println("Quantos meses: ");
		this.setMeses(sc.nextInt());
		System.out.println("Quantos dias: ");
		this.setDias(sc.nextInt());
		System.out.println("Sua idade em dias é de: " + this.getId());
	}
}
