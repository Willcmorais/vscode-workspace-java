package exercicios_em_SO;

public class Cozinha {

	public static void main(String[] args) {
		Cozinheiro chef = new Cozinheiro();
		try {
			chef.separarIngredientes();
			chef.cortarIngredientes();
			chef.prepararIngredientes();
			chef.acenderFogao();
			chef.fervendoAgua();
			chef.cozinharPrato();
			chef.montarPrato();
			chef.lavandoLouca();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
