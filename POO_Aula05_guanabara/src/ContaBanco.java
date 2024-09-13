//INFO CONTA BANCO
public class ContaBanco {
	// ATRIBUTOS
	public int tipo, numConta;
	private String dono;
	private double saldo;
	protected boolean status;

	// METODOS
	public void status() {
		System.out.println("DADOS DO CLIENTE:");
		System.out.println("");
		System.out.println("NUMERO DA CONTA: " + this.getNumConta());
		System.out.println("STATUS: " + this.getStatus());
		System.out.println("TIPO: " + this.getTipo());
		System.out.println("DONO: " + this.getDono());
		System.out.println("SALDO: " + this.getSaldo());
	}

	public void abrirConta(int t) {
		this.setTipo(t);// 1- CC ou 2- P
		this.setStatus(true);
		if (t == 1) {
			this.setSaldo(50);
			System.out.println("Conta aberta com sucesso!");
		} else if (t == 2) {
			this.setSaldo(150);
			System.out.println("Conta aberta com sucesso!");
		} else {
			this.setStatus(false);
			System.out.println("ERRO! A opcao escolhida nao esta nos parametros!");
		}
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Ainda consta valores em sua conta, verifique antes para solicitar o fechamento.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Ainda consta debitos em sua conta, verifique antes para solicitar o fechamento");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito de " + v + " realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel de depositar, a conta esta fechada.");
		}
	}

	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque de " + v + " realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Saque de " + v + " impossivel. Saldo insuficiente para saque.");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == 1) {
			v = 12;
		} else {
			v = 20;
		}

		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Parabens! " + this.getDono() + " sua mensalidade foi paga com sucesso!");
		}
		System.out.println("Impossivel de pagar uma conta fechada");
	}

	// METODO CONSTRUTOR
	public ContaBanco() {
		this.status = false;
		this.saldo = 0;

	}

	// METODOS ACESSORES
	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
