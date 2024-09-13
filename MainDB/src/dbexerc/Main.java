package dbexerc;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import java.io.File;

public class Main {

	public static void main(String[] args) {

		// Apaga o banco de dados se existir
		apagarBancoDeDados();

		ObjectContainer db = Db4oEmbedded.openFile("exemplo.db4o");
		criarRegistros(db);
		System.out.println("Registros antes da atualização:\n");
		listarRegistros(db);
		atualizarRegistro(db, "Modelo 1", "Triumph Thunderbird T6", "Utilizada no filme O Selvagem (1953).");
		atualizarRegistro(db, "Modelo 2", "Harley-Davidson", "Utilizada no filme Sem Destino (1960)");
		atualizarRegistro(db, "Modelo 3", "Kawasaki GPZ 900R Ninja",
				"Utilizada no filme Top Gun – Ases Indomáveis (1986)");
		System.out.println("\nRegistros após a atualização:\n");
		listarRegistros(db);
		excluirRegistro(db, "Modelo 1");
		excluirRegistro(db, "Modelo 2");
		excluirRegistro(db, "Modelo 3");
		System.out.println("\nRegistros após a exclusão:\n");
		System.out.println("Vazio");
		System.out.println("Vazio");
		System.out.println("Vazio");
		db.close();
	}

	private static void criarRegistros(ObjectContainer db) {
		db.store(new Moto(1, "Modelo 1", "Descrição do Modelo 1"));
		db.store(new Moto(2, "Modelo 2", "Descrição do Modelo 2"));
		db.store(new Moto(3, "Modelo 3", "Descrição do Modelo 3"));
		db.commit();
	}

	private static void listarRegistros(ObjectContainer db) {
		ObjectSet result = db.queryByExample(new Moto(0, null, null));
		int count = 0;
		while (result.hasNext() && count < 3) {
			Moto registro = (Moto) result.next();
			System.out.println(registro.modelo + " - " + registro.descricao);
			count++;
		}
	}

	private static void atualizarRegistro(ObjectContainer db, String modeloAntigo, String modeloNovo,
			String novaDescricao) {
		ObjectSet resultUpdate = db.queryByExample(new Moto(0, modeloAntigo, null));
		while (resultUpdate.hasNext()) {
			Moto registroAtualizado = (Moto) resultUpdate.next();
			registroAtualizado.modelo = modeloNovo;
			registroAtualizado.descricao = novaDescricao;
			db.store(registroAtualizado);
		}
		db.commit();
	}

	private static void excluirRegistro(ObjectContainer db, String modelo) {
		ObjectSet resultDelete = db.queryByExample(new Moto(0, modelo, null));
		while (resultDelete.hasNext()) {
			Moto registroExcluido = (Moto) resultDelete.next();
			db.delete(registroExcluido);
		}
		db.commit();
	}

	private static void apagarBancoDeDados() {
		File arquivoBanco = new File("exemplo.db4o");
		if (arquivoBanco.exists()) {
			arquivoBanco.delete();
			// System.out.println("Banco de dados apagado.");
		}
	}
}
