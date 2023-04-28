package loja_virtual;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConcexao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao(); 
		
		
		
		connection.close();
		System.out.println("Conexão Fechada!");
	}

}
