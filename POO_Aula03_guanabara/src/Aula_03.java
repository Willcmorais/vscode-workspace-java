//public, private e protected 
//o padrão do java se não tiver uma visibilidade será pública para package
public class Aula_03 {
	
	public static void main (String[]args) {
		
		Caneta c1 = new Caneta();
		c1.modelo = "Bic Cristal";
		c1.cor = "Preta";
		//c1.ponta = 0.9; é private
		c1.carga = 20;
		//c1.tampada = false; é um atributo private
		c1.tampar();
		c1.status();
		c1.rabiscar();/*porém o método rabiscar utiliza o atributo tampada, que
		por serem da mesma classe, mesmo o atributo sendo privado o método
		pode trabalhar com ele e o método sendo publico funcionará normalmente*/ 
	}
}
