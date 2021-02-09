package BancodeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
 
public class CarrosDAO {
 
    //Método que retorna a lsta de carros, com todos os carros do sistema
    public List<Carro> getListaDeCarros() {
 
        try {
            //Conecta ao banco através da classe de conexão:
            Conexao con = new Conexao();
            con.getConexao();
 
            //Select na tablea de carros:
            String sql = "select * from tb_carros;";
 
            //Executa a query
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
 
            //Prepara a lista de carros para retornar
            List<Carro> listaDeCarros = new ArrayList<Carro>();
 
            //para cada item retonrado no select, faça...
            while (resultado.next()) {
                Carro c = new Carro(); //Cria um carro novo na memória
                c.setIdCarro(resultado.getInt("idCarro")); //Seta o ID dele
                c.setFabricante(resultado.getString("fabricante")); //Seta o fabricante
                c.setModelo(resultado.getString("modelo")); //Seta o modelo
                c.setCor(resultado.getString("cor")); //Seta a cor
                c.setAno(resultado.getInt("anoFabricacao")); //Seta o ano de fabricação
 
                //insere o carro na lista local
                listaDeCarros.add(c);
            }
 
            //Ao terminar o laço, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();
 
            //Retorna a lista de carros
            return listaDeCarros;
 
        } catch (Exception e) { //Se der algum exessão...
            System.out.println(e.getMessage());
            return null;
        }
        
    }
        
        public boolean insereCarro(Carro c) {
            try {
                //Seta e abre a conexão
                Conexao conexao = new Conexao();
                conexao.getConexao();
     
                //Query de inserção (as aspas são muit importantes):
                String sql = "insert into tb_Carros ( fabricante, modelo, "
                        + "anofabricacao, cor)VALUES (?,?,?,?)";
                //Executa
                PreparedStatement comando = conexao.getConexao().prepareStatement(sql);
                comando.setString(1, c.getFabricante());
                comando.setString(2, c.getModelo());
                comando.setInt(3, c.getAno());
                comando.setString(4, c.getCor());
                
                //comando.execute();
                comando.execute();
                return true; //se inseriu, retorna verdadeiro.
     
            } catch (Exception e) { //Se deu algum erro...
                System.out.println(e.getMessage());
                return false;
            }
        }
        
        
        public boolean updateCarro(Carro c) {
        	try {
        		Conexao conexao = new Conexao();
        		conexao.getConexao();
        		
        		String sql ="UPDATE tb_Carros SET idCarro =?, fabricante = ?, modelo = ?, anofabricacao = ?, cor = ? WHERE idCarro = " + c.getIdCarro();
        		
        		PreparedStatement comando = conexao.getConexao().prepareStatement(sql);
        		comando.setDouble(1, c.getIdCarro());
        		comando.setString(2, c.getFabricante());
        		comando.setString(3, c.getModelo());
        		comando.setInt(4, c.getAno());
        		comando.setString(5, c.getCor());
        	
        		comando.executeUpdate();
                return true; //se inseriu, retorna verdadeiro.
                
        	}catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
			}
}
    