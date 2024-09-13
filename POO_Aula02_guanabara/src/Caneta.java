//Na classe Caneta temos 5 Atributos e 3 métodos

public class Caneta {
	
	String modelo, cor;
	double ponta;
	int carga;
	boolean tampada;
	//void é sem retorno
	void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga: "+ this.carga); 
		System.out.println("A caneta esta tampada? "+ this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar.");
		} else {
				 System.out.println("Posso rabiscar");
			 }
		}
	
	void tampar() {
		this.tampada = true;/*this é o nome do objeto que chamou, ou seja, this vai virar
		o objeto quando for chamado*/
	}
	
	void destampar() {
		this.tampada = false;
	}
}
