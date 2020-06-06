package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anderson
 */
public class ConexaoBD {

    //caminho e porta do seu servidor
    private String servidor = "localhost:3306";
    //nome da base de dados que irá se conectar
    private String baseDeDados = "hospital";
    //Correção do erro do fuso hario do brasil 
    private String timeZone = "?useTimezone=true&serverTimezone=UTC";
    //Caminho do BD
    private String url = "jdbc:mysql://" + servidor + "/" + baseDeDados+timeZone;
    //Identifica o serviço (driver) do BD
    private String driver = "com.mysql.cj.jdbc.Driver";
    //Usuário e senha de acesso ao BD
    private String usuario = "root";
    private String senha = "147533";
    //responsável pela conexão com o BD
    public Connection conexao;

    //metodo para conectar com o banco
    public void conectarBD() {
        try {
            //Verifica se o driver exisgte na máquina
            Class.forName(driver);
            //DriverManager é responsável por gerenciar a conexão
            //utiliza-se o método getConnection para estabelecer a conexão
            //passando a url, usuario e a senha do banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("Driver nao encontrado\n" + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Problemas na conexão com o banco\n" + ex);
        }
    }

    public void desconectarBD() {
        try {
            conexao.close(); //encerra a conexão com o banco
            System.out.println("Banco desconectado com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar desconectar do banco\n" + ex);
        }
    }

}
