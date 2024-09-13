/*Tendo uma classe podemos instanciar um objeto com essa classe
como no exemplo o objeto c1 foi criado a partir da classe caneta
que terá métodos a serem seguidos para cumprir papeis.
Depois de instanciada a classe podemos mexer nos atributos
*/

public class Aula_02 {
	
	public static void main (String[]args) {
		Caneta c1 = new Caneta();//primeiro instanciamento da class em um objeto c1
		c1.modelo = "Bic";//referencia a atributo
		c1.cor = "Azul";
		c1.ponta = 0.5;
		c1.tampar();
		c1.status();//referencia a metodo
		c1.rabiscar();
		System.out.println("");
		
		Caneta c2 = new Caneta();//segundo instanciamento com a mesma classe, objeto c2/
		c2.modelo = "Faber";
		c2.cor = "Vermelha";
		c2.ponta = 1.2;
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
}
