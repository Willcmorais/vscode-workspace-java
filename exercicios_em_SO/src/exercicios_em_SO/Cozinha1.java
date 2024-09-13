package exercicios_em_SO;

public class Cozinha1 {
	public static void main(String[] args) {
		// Criando as threads para cada etapa do processo
		 Thread si = new Thread(new SeparadorIngredientes());
		 Thread ci = new Thread(new CortadorIngredientes());
		 Thread pi = new Thread(new PreparadorIngredientes());
		 Thread af = new Thread(new AcendedorFogo());
		 Thread fa = new Thread(new FervedorAgua());
		 Thread cp = new Thread(new CozinharPrato());
		 Thread mp = new Thread(new MontarPrato());
		 Thread ll = new Thread(new LavarLouca());
		 // Iniciando todas as threads
		 si.start();
		 ci.start();
		 pi.start();
		 af.start();
		 fa.start();
		 cp.start();
		 mp.start();
		 ll.start();
		 }
		}

	}
}