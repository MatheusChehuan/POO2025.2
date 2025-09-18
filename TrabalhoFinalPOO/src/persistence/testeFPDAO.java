	package persistence;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import calcularsalario.FolhaPagamento;
	import conexao.ConnectionFactory;
	import entity.Funcionario;


	public class FolhaPagamentoDAO {
		private Connection connection;
		
		public FolhaPagamentoDAO(){
			connection = new ConnectionFactory().getConnection();
		}
		public void inserir(FolhaPagamento fp) {
			String sql = "insert into FolhaPagamento(codigo,Funcionario,DataPagamento,DescontoINSS,DescontoIR,SalarioLiquido) values (?,?,?,?,?,?)";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, fp.getCodigo());
				stmt.setInt(2, fp.getFuncionario().getId());
				stmt.setDate(3, java.sql.Date.valueOf(fp.getDataPagamento()));
				stmt.setDouble(4, fp.getDescontoINSS());
				stmt.setDouble(5, fp.getDescontoIR());
				stmt.setDouble(6, fp.getSalarioLiquido());
				
				stmt.execute();
				stmt.close();//talvez esteja no lugar errado
				connection.close();
				
			} catch (SQLException e) {
				System.out.println("Problemas ao gravar registro");
			}
		}
		
		public void atualizar(FolhaPagamento fp) {
			String sql = "update FolhaPagamento set codigo=?, Funcionario=?, DataPagamento=?, DescontoINSS=?,DescontoIR=?,SalarioLiquido=?, where id =?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, fp.getCodigo());
			//stmt.setString(2, fp.getFuncionario());
			stmt.setDate(3, java.sql.Date.valueOf(fp.getDataPagamento()));
			stmt.setDouble(4, fp.getDescontoINSS());
			stmt.setDouble(5, fp.getDescontoIR());
			stmt.setDouble(6, fp.getSalarioLiquido());
			
			stmt.execute();
			stmt.close();//talvez esteja errado
			connection.close();
			
		} catch (SQLException e) {
			System.out.println("Problemas ao gravar registro");
		}
	}
		public void apagar(int id) {
			String sql = "delete from FolhaPagamento where id =?";
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
		public List<FolhaPagamento> listar(){
			String sql = "select * from FolhaPagamento";
			List<FolhaPagamento> fp = new ArrayList<>();
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery(); //
					
					while(rs.next()) { 
							fp.add(new FolhaPagamento
									 (rs.getInt("codigo"),
									//Funcionario(rs.getString("Funcionario")), //chave estrangeira faz como?
									rs.getDate("DataPagamento").toLocalDate(),
									rs.getDouble("DescontoINSS"),
									rs.getDouble("DescontoIR"),
									rs.getDouble("SalarioLiquido")));
					}
					stmt.close(); //talvez esteja errado
					connection.close(); //talvez esteja no lugar errado
					
			} catch (SQLException e) {
				System.out.println("Problemas ao listar registros!");
			}
			return fp;
		}

	}

