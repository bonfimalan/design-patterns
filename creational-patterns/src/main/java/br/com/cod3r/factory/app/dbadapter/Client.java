package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {
		DB oracle = new OracleDBFactory().getDatabase();
		DB postgres = new PostgresDBFactory().getDatabase();

		oracle.query("SELECT * FROM table");
		postgres.query("SELECT * FROM table");
	}
}
