package controledeestoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        Connection conn = null;
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Configurar a URL de conexão
            String url = "jdbc:mysql://localhost:3306/estoque";
            String usuario = "root";  // Alterar se necessário
            String senha = "2005";        // Alterar se necessário
            
            // Estabelecer a conexão
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return conn;
    }
}
