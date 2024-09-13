/*MÉTODOS ESPECIAIS (NOMES E PADRÕES ESPECÍFICOS DA POO)
METODOS ACESSORES SÃO METODOS QUE DAO ACESSO A UMA DETERMINADA COISA
CHAMADO DE METODO GETTERS É UM METODO QUE PEGA ALGUMA INFORMAÇÃO

METODOS MODIFICADORES OU SETTERS MODIFICAM COISAS QUE ESTÃO DENTRO DO
OBJETO.  */
public class Aula_04 {
	
	public static void main (String[]args) {
		
		Caneta c1 = new Caneta("Bic", "Azul", 0.5);//parametros criados a partir do método construtor
		c1.status();
		System.out.println("");
		Caneta c2 = new Caneta("Moblanc", "Preto", 1.1);
		c2.status();
	}
}
