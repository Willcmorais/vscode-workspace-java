
//CONTAS QUE SERÃO FEITAS
import java.util.Scanner;

public class Contas {

	private String colaborador;
	private double reajuste, salAtual, aumento20, aumento15, aumento10, aumento5;

	public String getColaborador() {
		return colaborador;
	}

	public void setColaborador(String co) {
		this.colaborador = co;
	}

	public double getReajuste() {
		return reajuste;
	}

	public void setReajuste(double reaj) {
		this.reajuste = reaj;
	}

	public double getSalAtual() {
		return salAtual;
	}

	public void setSalAtual(double salAtual) {
		this.salAtual = salAtual;
	}

	public double getAumento20() {
		return aumento20 = this.getSalAtual() / 5;
	}

	public double getAumento15() {
		return aumento15 = this.getSalAtual() * 15 / 100;
	}

	public double getAumento10() {
		return aumento10 = this.getSalAtual() / 10;
	}

	public double getAumento5() {
		return aumento5 = this.getSalAtual() * 5 / 100;
	}

	public void Reajuste() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu salário: ");
		this.setSalAtual(sc.nextDouble());
		if (this.getSalAtual() <= 280) {
			this.setReajuste(this.getSalAtual() + this.getAumento20());
			System.out.println("O salário é de " + this.getSalAtual()
					+ "R$. Sendo assim o percentual aplicado é 20%, resultando em um aumento de " + this.getAumento20()
					+ "R$. O salário atual é de " + this.getReajuste() + "R$.");
		} else if (this.getSalAtual() <= 700) {
			this.setReajuste(this.getSalAtual() + this.getAumento15());
			System.out.println("O salário é de " + this.getSalAtual()
					+ "R$. Sendo assim o percentual aplicado é 15%, resultando em um aumento de " + this.getAumento15()
					+ "R$. O salário atual é de " + this.getReajuste() + "R$.");
		} else if (this.getSalAtual() < 1500) {
			this.setReajuste(this.getSalAtual() + this.getAumento10());
			System.out.println("O salário é de " + this.getSalAtual()
					+ "R$. Sendo assim o percentual aplicado é 10%, resultando em um aumento de " + this.getAumento10()
					+ "R$. O salário atual é de " + this.getReajuste() + "R$.");
		} else if (this.getSalAtual() >= 1500) {
			this.setReajuste(this.getSalAtual() + this.getAumento5());
			System.out.println("O salário é de " + this.getSalAtual()
					+ "R$. Sendo assim o percentual aplicado é 5%, resultando em um aumento de " + this.getAumento5()
					+ "R$. O salário atual é de " + this.getReajuste() + "R$.");
		}
	}
}
