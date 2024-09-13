
public class Caneta {
	private String modelo, cor;
	private double ponta;
	private boolean tampada;
	
	public Caneta(String m, String c, double p) {//este é o metodo construtor
		 this.modelo = m;
		 this.cor = c;
		 this.ponta = p;
		 this.tampada = true;
	}
	
	public String getModelo() {//String não retorna void
		return this.modelo;  
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public double getPonta() {
		return this.ponta;
	}
	public void setPonta(double n) {
		this.ponta = n;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("Informacoes da caneta:");
		System.out.println("MODELO: "+this.modelo);
		System.out.println("PONTA: "+this.ponta);
		System.out.println("COR: "+this.cor);
		System.out.println("A caneta esta tampada? "+this.tampada);
	}	
}
