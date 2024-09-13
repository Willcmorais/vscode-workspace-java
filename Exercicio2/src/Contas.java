import java.util.Scanner;

public class Contas {

	private double valHr, inss, hrsMes, fgts, ttlDesc, salBruto, disc5, disc10, disc20, salLiq, impRend;

	private double getTtlDesc() {
		return ttlDesc = this.getInss() + this.getImpRend();
	}

	private double getFgts() {
		return fgts = this.getSalBruto() * 11 / 100;
	}

	private double getInss() {
		return inss = this.getSalBruto() * 1 / 10;
	}

	private double getDisc5() {
		return disc5 = this.getSalBruto() * 5 / 100;
	}

	private double getDisc10() {
		return disc10 = this.getSalBruto() / 10;
	}

	private double getDisc20() {
		return disc20 = this.getSalBruto() / 5;
	}

	private double getImpRend() {
		if (this.getSalBruto() <= 900) {
			return impRend = 0;
		} else if (this.getSalBruto() <= 1500) {
			return impRend = this.getDisc5();
		} else if (this.getSalBruto() <= 2500) {
			return impRend = this.getDisc10();
		} else {
			return impRend = this.getDisc20();
		}
	}

	private double getSalBruto() {
		return salBruto = this.getHrsMes() * this.getValHr();
	}

	private double getSalLiq() {
		return salLiq = this.getSalBruto() - this.getInss() - this.getImpRend();
	}

	private double getValHr() {
		return valHr;
	}

	private void setValHr(double valHr) {
		this.valHr = valHr;
	}

	private double getHrsMes() {
		return hrsMes;
	}

	private void setHrsMes(double hrsMes) {
		this.hrsMes = hrsMes;
	}

	public void folhaPgmnt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da sua hora: ");
		this.setValHr(sc.nextDouble());
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		this.setHrsMes(sc.nextDouble());
		System.out.println("");
		System.out.println("Informações do Cliente");
		System.out.println("Salário Bruto: " + this.getSalBruto() + "R$.");
		System.out.println("imposto de Renda Descontado: " + this.getImpRend() + "R$.");
		System.out.println("INSS Descontado: " + this.getInss() + "R$.");
		System.out.println("Valor de FGTS: " + this.getFgts());
		System.out.println("Valor total de descontos: " + this.getTtlDesc());
		System.out.println("Salário Líquido: " + this.getSalLiq());
	}
}
