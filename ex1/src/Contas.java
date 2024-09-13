/*Faça um programa em java que receba o valor dos catetos a e b de um 
 * triângulo, calcule e mostre o valor da hipotenusa. 
 */

import java.util.Scanner;

public class Contas {
	private double c1, c2, h;
	Scanner sc = new Scanner(System.in);

	private double getC1() {
		return c1;
	}

	private void setC1(int c1) {
		this.c1 = c1;
	}

	private double getC2() {
		return c2;
	}

	private void setC2(int c2) {
		this.c2 = c2;
	}

	private double getH() {
		return h = Math.sqrt(this.getC1() * this.getC1() + this.getC2() * this.getC2());
	}

	public void Mostrar() {
		System.out.println("Informe o valor do primeiro cateto: ");
		this.setC1(sc.nextInt());
		System.out.println("Informe o valor do segundo cateto: ");
		this.setC2(sc.nextInt());
		System.out.println("O valor da hipotenusa é " + this.getH());
	}
}
