package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;
import entity.Cliente;

public class ClienteDAO {
	private Connection connection;
	
	public ClienteDAO() {
		connection = new ConnectionFactory().getConnection();
		}
	public void inserir(Cliente cliente) {
		String sql = "insert into cliente(nome,telefone,email) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			stmt.setInt(4, cliente.getId());
			
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Problemas ao gravar registro");
		}
	}
	
	public void atualizar(Cliente cliente) {
		String sql = "update cliente set nome=?, email=?, telefone=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getTelefone());
			stmt.setInt(4, cliente.getId());
			
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Problemas ao gravar registro");
		}
	}
	
	public void apagar(int id) {
	String sql = "delete from cliente where id=?";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
		connection.close();
	} catch (SQLException e) {
		System.out.println("Problemas ao gravar registro");
	}
	}
	
	public List<Cliente> listar(){
		String sql = "select * from cliente";
		List<Cliente> clientes = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery(); //
				
				while(rs.next()) {
					clientes.add(new Cliente(rs.getInt("id"),rs.getString("nome"),rs.getString("email"),rs.getString("telefone")));
				}
				stmt.close();
				connection.close();
				
		} catch (SQLException e) {
			System.out.println("Problemas ao listar registros!");
		}
		return clientes;
	}
}

