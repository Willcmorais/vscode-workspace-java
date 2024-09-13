   
//em orientação a objeto é definido se o MÉTODO é PÚBLICO ou PRIVADO
//depois diz se ele é ESTATICO ou MÉTODO NORMAL 
//se for ESTATICO quer dizer que podemos chamar ele de qualquer lugar independente se estamos INSTANCIANDO UMA CLASSE OU NÃO
//como chamar o método em outra classe sem ser estatico. Instanciando classes, criando objetos ou classes
//chama o método atravez de um objeto
//extends são heranças, uma classe se extende a outra

import coelho.will.utiliddes.Utils;
	
	public class Main extends Utils {
		public Main (String nome, double peso) {
			super(nome, peso);
		}
		
		public static void main(String[]args) {
		Main dados = new Main("Will", 94.5);
		dados.printHelloWorld();
		System.out.println(dados.nome2);
		new Main2();//INSTANCEAMENTO DA MENSAGEM OKAY
		}

}
	//CLASSE FORA DA MAIN QUE FOI LINKADA A MAIN2
	class Teste {
	 	public void print() {
	 		System.out.println("OKAY!");
	 	}
}