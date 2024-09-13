
public class Aula_05 {
	// 1 - CC , 2 - P
	public static void main(String[] args) {

		ContaBanco p1 = new ContaBanco();
		System.out.println("Escolha 1 para abrir uma conta corrente ou 2 para abrir uma poupanca:");
		System.out.println("");
		System.out.println("Ao abrir uma Conta Corrente recebera um deposito de 50.00 reais");
		System.out.println("Ao abrir uma Conta Poupanca recebera um deposito de 150.00 reais");
		System.out.println("");
		p1.setNumConta(1111);
		p1.setDono("William");
		p1.abrirConta(2);
		p1.depositar(150.0);
		p1.sacar(7000);
		System.out.println("");
		p1.status();
		System.out.println("");
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Victoria");
		p2.abrirConta(1);
		p2.depositar(500.5);
		p2.sacar(550.5);
		p2.fecharConta();
		System.out.println("");
		p2.status();
		System.out.println("");
		ContaBanco p3 = new ContaBanco();
		p3.setNumConta(3333);
		p3.setDono("Jubileu");
		p3.abrirConta(3);
		p3.depositar(150.0);
		p3.sacar(30);
		System.out.println("");
		p3.status();
	}
}
