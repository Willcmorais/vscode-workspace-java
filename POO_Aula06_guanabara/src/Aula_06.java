/*EHP - ENCAPSULAMENTO, HERANÇA E POLIMORFISMO. EXEMPLO DO CONTROLE REMOTO
A CAPA SERVE PARA PROTEGER O MEIO EXTERNO DO MEIO INTERNO E VICE VERSA 
OCULTAR A IMPLEMENTAÇÃO FICANDO VISÍVEL SOMENTE A INTERFACE, SEGUINDO UM
PADRÃO. A INTERFACE É O QUE VOCÊ VAI INTERAGIR.	 

*/
public class Aula_06 {
	
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.ligarMudo();
		c.desligarMudo();
		c.play();
		c.pause();
		c.abrirMenu();
	}
}
