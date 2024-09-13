import java.util.Scanner;

public class Contas {
	Scanner sc = new Scanner(System.in);
	private int l1, l2, l3, eq, is, es;

	private int getL1() {
		return l1;
	}

	private void setL1(int l1) {
		this.l1 = l1;
	}

	private int getL2() {
		return l2;
	}

	private void setL2(int l2) {
		this.l2 = l2;
	}

	private int getL3() {
		return l3;
	}

	private void setL3(int l3) {
		this.l3 = l3;
	}

	private int getEq() {
		return eq;
	}

	private int getIs() {
		return is;
	}

	private int getEs() {
		return es;
	}

	public void EscolherLado() {
		System.out.println("Informe o valor do 1º lado: ");
		this.setL1(sc.nextInt());
		System.out.println("Informe o valor do 2º lado: ");
		this.setL2(sc.nextInt());
		System.out.println("Informe o valor do 3º lado: ");
		this.setL3(sc.nextInt());

		if (this.getL1() + this.getL2() > this.getL3() || this.getL1() + this.getL3() > this.getL2()
				|| this.getL3() + this.getL2() > this.getL1()) {
			if (this.getL1() == this.getL2() && this.getL1() == this.getL3()) {
				System.out.println("O triangulo é Equilátero");
			} else if (this.getL1() == this.getL2() || this.getL1() == this.getL3() || this.getL2() == this.getL3()) {
				System.out.println("O triangulo é Isósceles");
			} else if (this.getL1() != this.getL2() && this.getL1() != this.getL3() && this.getL2() != this.getL3()) {
				System.out.println("O triangulo é Escaleno");
			}
		} else {
			System.out.println("Os valores são incompatíveis");
		}
	}

}
