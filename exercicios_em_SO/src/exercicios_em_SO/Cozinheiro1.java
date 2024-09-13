package exercicios_em_SO;

import java.util.concurrent.TimeUnit;

public class Cozinheiro1 {
	public static class SeparadorIngredientes implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("1 - Separando os ingredientes");
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class CortadorIngredientes implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("2 - Cortando os ingredientes...");
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class PreparadorIngredientes implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("3 - Preparando os ingredientes...");
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class AcendedorFogao implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("4 - Acendendo o fogão...");
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class FervedorAgua implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("5 - Fervendo água...");
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class CozinharPrato implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("6 - Cozinhando o prato...");
				TimeUnit.SECONDS.sleep(6);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class MontarPrato implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("7 - Montando o prato...");
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class LavarLouca implements Runnable {
		@Override
		public void run() {
			try {
				System.out.println("8 - Lavando louça...");
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
