package dbexerc;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;

public class Training {
	public static void main(String[] args) {
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		ObjectContainer db = Db4oEmbedded.openFile(config, "exemplo2.db4o");
		Cliente cliente = new Cliente("João", "joao@example.com");
		db.store(cliente);
	}
}
