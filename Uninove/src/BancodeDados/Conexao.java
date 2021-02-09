package BancodeDados;

import java.sql.Connection;
//Importa��es
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  //Status da conex�o, para consultas
  private String statusConexao = "N�o conectado";

  public Connection getConexao() {
      //Atributo para conex�o
      Connection conexao = null;

      //Come�a a tentativa de conex�o
      try {

          //Designa o driver de conex�o padr�o para essa conex�o:
          String driverName = "org.postgresql.Driver";
          Class.forName(driverName);

          //Seta os par�metros da conex�o ao banco -IMPORTANTE AQUI!!!-
          String servidor = "localhost"; //Caminho de rede do BD
          String schema = "carros";   //Nome do schema que ser� usado

          //URL para o driver JDBC:
          String url = "jdbc:postgresql://localhost:5432/carros?autoReconnect=true";

          //Par�metros da conex�o (usu�rio e senha)
          //Aten��o: COLOQUE AQUI O SEU USU�RIO E A SUA SENHA!
          String user = "postgres";    //Usu�rio da base, criado anteriormente
          String password = "admin";   //Senha do usu�rio

          //seta a conex�o:
          conexao = (Connection) DriverManager.getConnection(url, user, password);

          //Testando a conex�o
          if (conexao != null) {   //Se aconex�o for ok, ela n�o � nula...
              //Troca o status da conex�o
              statusConexao = ("Conetado");
          } else {
              statusConexao = ("N�o conectado");
          }

          //retorna a conex�o para quem for utiliza-la
          return conexao;

      } catch (ClassNotFoundException e) {  //Caso n�o encontre o driver de conex�o
          System.out.println("Driver de conex�o n�o encontrado    ");
          return null;
      } catch (SQLException e) { //Caso n�o consiga conectar
          System.out.println("Falha na conex�o: ");
          System.out.println(e.getMessage());
          return null;
      }
  }

  //Retorna o status da conex�o
  public String getStatusConexao() {
      return statusConexao;
  }

  //M�todo para fechar (encerrar) a conex�o
  public boolean FechaConexao() {
      try {
          getConexao().close(); //Fecha
          statusConexao = "Conex�o fechada"; //Atualiza o status
          return true; //Retorna verdadeiro = conseguiu fechar!
      } catch (SQLException e) {
          //Se der algum erro, imprime
          System.out.println(e.getMessage());
          return false;
      }
  }

  //caso precise reiniciar sua conex�o
  public Connection ReiniciaConexao() {
      FechaConexao(); //Fecha
      return getConexao(); //Abre e retorna
  }
}