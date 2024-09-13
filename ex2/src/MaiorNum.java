
//ESCOLHER O MAIOR NUMERO
import java.util.Scanner;

public class MaiorNum {
	Scanner sc = new Scanner(System.in);
	private int num, maiorNum;

	private int getNum() {
		return num;
	}

	private void setNum(int num) {
		this.num = num;
	}

	private int getMaiorNum() {
		return maiorNum;
	}

	private void setMaiorNum(int maiorNum) {
		this.maiorNum = maiorNum;
	}

	public void Main() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Informe o " + (i + 1) + "º número: ");
			this.setNum(sc.nextInt());
			if (this.getNum() > this.getMaiorNum()) {
				this.setMaiorNum(this.getNum());
			}
		}
		System.out.println("O maior número digitado foi " + this.getMaiorNum());
	}
}
