//RELACIONAMENTO ENTRE CLASSES E OBJETOS COMPOSTOS; CONTINUIDADE DA AULA 7
public class Aula_07 {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Will", "Brasil", 26, 15, 5, 3, 1.84, 94.5);
		l[1] = new Lutador("Humb", "Jamaica", 26, 10, 6, 1, 1.78, 90.1);
		l[2] = new Lutador("Decko", "Londres", 21, 10, 3, 0, 1.62, 75.5);
		l[3] = new Lutador("Calleb", "Transilvania", 29, 9, 4, 3, 1.97, 72.5);
		l[4] = new Lutador("Kado", "Paris", 30, 5, 0, 1, 1.96, 64.5);
		l[5] = new Lutador("Leo", "India", 20, 14, 4, 1, 1.70, 60.5);
		Luta UEC1 = new Luta();
		UEC1.marcarLuta(l[5], l[4]);
		UEC1.lutar();
	}
}
