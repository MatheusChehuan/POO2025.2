package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;
import entity.Funcionario;

public class FuncionarioDAO {
	
	private Connection connection;
	
	public FuncionarioDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	public void inserir(Funcionario funcionario) {
		String sql = "insert into funcionario(nome,cpf,dataNascimento,salarioBruto) values (?,?,?,?)";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, funcionario.getNome());
		stmt.setString(2, funcionario.getCpf());
		stmt.setDate(3, java.sql.Date.valueOf(funcionario.getDataNascimento())); //chatgpt que me deu a dica
		stmt.setDouble(4, funcionario.getSalarioBruto());
		
		stmt.execute();
		stmt.close(); //talvez esteja errado
		connection.close();
		
	} catch (SQLException e) {
		System.out.println("Problemas ao gravar registro");
	}
	}
	
	
	public void atualizar(Funcionario funcionario) {
		String sql = "update funcionario set nome=?, cpf=?, dataNascimento=?, salarioBruto=? where id =?";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, funcionario.getNome());
		stmt.setString(2, funcionario.getCpf());
		stmt.setDate(3, java.sql.Date.valueOf(funcionario.getDataNascimento()));
		stmt.setDouble(4, funcionario.getSalarioBruto());
		
		stmt.execute();
		stmt.close();//talvez esteja errado
		connection.close();
		
	} catch (SQLException e) {
		System.out.println("Problemas ao gravar registro");
	}
	}
	public void apagar(int id) {
		String sql = "delete from funcionario where id =?";
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
	public List<Funcionario> listar(){
		String sql = "select * from funcionario";
		List<Funcionario> funcionarios = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery(); //
				
				while(rs.next()) {
					funcionarios.add(new Funcionario
							(rs.getString("nome"),
							rs.getString("cpf"),
							rs.getDate("dataNascimento").toLocalDate(),
							rs.getDouble("salarioBruto")));
				}
				stmt.close(); //talvez esteja errado
				connection.close(); //talvez esteja no lugar errado
				
		} catch (SQLException e) {
			System.out.println("Problemas ao listar registros!");
		}
		return funcionarios;
	}
}
