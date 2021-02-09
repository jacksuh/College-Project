package BancodeDados;

import java.sql.Connection;
//Importações
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  //Status da conexão, para consultas
  private String statusConexao = "Não conectado";

  public Connection getConexao() {
      //Atributo para conexão
      Connection conexao = null;

      //Começa a tentativa de conexão
      try {

          //Designa o driver de conexão padrão para essa conexão:
          String driverName = "org.postgresql.Driver";
          Class.forName(driverName);

          //Seta os parâmetros da conexão ao banco -IMPORTANTE AQUI!!!-
          String servidor = "localhost"; //Caminho de rede do BD
          String schema = "carros";   //Nome do schema que será usado

          //URL para o driver JDBC:
          String url = "jdbc:postgresql://localhost:5432/carros?autoReconnect=true";

          //Parâmetros da conexão (usuário e senha)
          //Atenção: COLOQUE AQUI O SEU USUÁRIO E A SUA SENHA!
          String user = "postgres";    //Usuário da base, criado anteriormente
          String password = "admin";   //Senha do usuário

          //seta a conexão:
          conexao = (Connection) DriverManager.getConnection(url, user, password);

          //Testando a conexão
          if (conexao != null) {   //Se aconexão for ok, ela não é nula...
              //Troca o status da conexão
              statusConexao = ("Conetado");
          } else {
              statusConexao = ("Não conectado");
          }

          //retorna a conexão para quem for utiliza-la
          return conexao;

      } catch (ClassNotFoundException e) {  //Caso não encontre o driver de conexão
          System.out.println("Driver de conexão não encontrado    ");
          return null;
      } catch (SQLException e) { //Caso não consiga conectar
          System.out.println("Falha na conexão: ");
          System.out.println(e.getMessage());
          return null;
      }
  }

  //Retorna o status da conexão
  public String getStatusConexao() {
      return statusConexao;
  }

  //Método para fechar (encerrar) a conexão
  public boolean FechaConexao() {
      try {
          getConexao().close(); //Fecha
          statusConexao = "Conexão fechada"; //Atualiza o status
          return true; //Retorna verdadeiro = conseguiu fechar!
      } catch (SQLException e) {
          //Se der algum erro, imprime
          System.out.println(e.getMessage());
          return false;
      }
  }

  //caso precise reiniciar sua conexão
  public Connection ReiniciaConexao() {
      FechaConexao(); //Fecha
      return getConexao(); //Abre e retorna
  }
}