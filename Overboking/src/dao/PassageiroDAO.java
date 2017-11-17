package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import aviao.Passageiro;

public class PassageiroDAO {

	private Connection conexao;
	private Conexao objConexao;

	public PassageiroDAO() {
		objConexao = new Conexao();
		conexao = objConexao.abrirConexao();
	}

	public void inserir(Passageiro passageiro) {
		// instrucao sql
		String sql = "Insert into Passageiro " + "values(?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conexao.prepareStatement(sql);
			// setar os paramentros
			pstmt.setString(1, passageiro.getCpf());
			pstmt.setString(2, passageiro.getNome());
			pstmt.setInt(3, passageiro.getPoltrona());
			pstmt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			objConexao.fecharConexao();
		}
	}

	public Passageiro recuperarUsandoPoltrona(int poltrona) throws SQLException {
		Statement sta = conexao.createStatement();
		ResultSet elements = sta.executeQuery("select * from passageiro " + "where poltrona = " + poltrona);
		Passageiro p = null;

		while (elements.next()) {
			p = new Passageiro(elements.getString("cpf_passageiro"), elements.getString("nome_passageiro"),
					null, elements.getInt("poltrona"));
		}
		return p;
	}

	public void alterar(Passageiro p) {
		String sql = "update passageiro " + "set nome_passageiro = ?, cpf_passageiro = ?" + " where poltrona = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conexao.prepareStatement(sql);
			// setar os paramentros
			pstmt.setLong(3, p.getPoltrona());
			pstmt.setString(2, p.getNome());
			pstmt.setString(1, p.getCpf());
			pstmt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void excluir(Passageiro p) {
		String sql = "delete from passageiro " + " where poltrona = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conexao.prepareStatement(sql);
			// setar os paramentros

			pstmt.setInt(1, p.getPoltrona());
			pstmt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public List<Passageiro> recuperarUsandoNome(String texto) throws SQLException {
		if (texto == null)
			texto = "";
		List<Passageiro> result = new ArrayList<Passageiro>();
		Statement sta = conexao.createStatement();
		// Atribui o resultado da consulta para o resultset
		ResultSet elements = sta
				.executeQuery("SELECT * FROM Passageiro " + "WHERE nome_passageiro LIKE '%" + texto + "%'");

		// enquanto existirem registros no recordset
		while (elements.next()) {

			Passageiro p = new Passageiro();
			p.setCpf(elements.getString("cpf_passageiro"));
			p.setNome(elements.getString("nome_passageiro"));
			p.setPoltrona(elements.getInt("poltrona"));

			// adiciona o objeto ao vetor
			result.add(p);
		}
		return result;
	}
}
