package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection conexao;
	private final String URL = "jdbc:mysql://localhost:3306/overbooking";
	private final String USER = "root";
	private final String PASSWORD = "lectra125";
	private final String TPCONEXAO = "com.mysql.jdbc.Driver";

	public Connection abrirConexao() {
		try {
			Class.forName(TPCONEXAO);
			conexao = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException ex) {

			ex.printStackTrace();
		} catch (SQLException ex) {

			ex.printStackTrace();
		}
		return conexao;
	}

	public void fecharConexao() {
		if (conexao != null) {
			try {
				conexao.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
