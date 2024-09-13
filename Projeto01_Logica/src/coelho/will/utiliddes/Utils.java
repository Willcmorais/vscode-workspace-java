
package coelho.will.utiliddes;

public class Utils { //CLASSE
	
	/*
	int,double,char,String,float
	*/
	//VARIAVEIS
	private int idade = 26;
	public double peso = 94.5;
	public float peso2 = 94.5f;
	public String nome = "Will";
	
	//SÓ É ACESSÍVEL DENTRO DA PRÓPRIA CLASSE OU A QUE ESTÁ HERDANDO
	protected String nome2 = "Joao"; 
	
	//MÉTODO CONSTRUTOR
	public Utils(String nome, double peso) {
	this.nome = nome;
	this.peso = peso;
	System.out.println(this.nome);
	System.out.println(peso);
	}
	
	//MÉTODO GETTER
	public void printHelloWorld() {
	printOutracoisa();
	}
	//METODO SETTER
	private void printOutracoisa() {
	System.out.println("Outra coisa");
	}
	//METODO
}
