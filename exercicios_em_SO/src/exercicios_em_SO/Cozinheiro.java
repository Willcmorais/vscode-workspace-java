package exercicios_em_SO;

import java.util.concurrent.TimeUnit;

public class Cozinheiro {
	// Precisa de 2 segundos para separar os ingredientes
	public void separarIngredientes() throws InterruptedException {
		System.out.println("1 - Separando os ingredientes");
		TimeUnit.SECONDS.sleep(2);
	}

	public void cortarIngredientes() throws InterruptedException {
		System.out.println("2 - Cortando os ingredientes...");
		TimeUnit.SECONDS.sleep(3);
	}

	public void prepararIngredientes() throws InterruptedException {
		System.out.println("3 - Preparando os ingredientes...");
		TimeUnit.SECONDS.sleep(4); // Simula o tempo necessário para preparar os ingredie
	}

	public void acenderFogao() throws InterruptedException {
		System.out.println("4 - Acendendo o fogão...");
		TimeUnit.SECONDS.sleep(2);
	}

	public void fervendoAgua() throws InterruptedException {
		System.out.println("5 - Fervendo água...");
		TimeUnit.SECONDS.sleep(5);
	}

	public void cozinharPrato() throws InterruptedException {
		System.out.println("6 - Cozinhando o prato...");
		TimeUnit.SECONDS.sleep(6);
	}

	public void montarPrato() throws InterruptedException {
		System.out.println("7 - Montando o prato...");
		TimeUnit.SECONDS.sleep(3);
	}

	public void lavandoLouca() throws InterruptedException {
		System.out.println("8 - Lavando louça...");
		TimeUnit.SECONDS.sleep(4);
	}
}
