package Interface;

//É preciso importar o API do Swing:
import javax.swing.JFrame;

public class Janela {

  JFrame janela = new JFrame(); //criar um objeto JFrame chamado 'janela1'

  //Construtor da classe, que gera um objeto de tela (jFrame)
  public Janela() {
      janela.setTitle("Minha primeira tela em Java!!");  //Titulo da janela
      janela.setSize(800, 600); //largura e a altura da janela, em pixels
      janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
      //janela.setLocationRelativeTo(null);//centralizada
      //janela.setLocation(100, 150); //define a posição da janela coluna e linha
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //ao fechar a janela, encerra a aplicação
  }

  //Método para mostrar a Janela
  public void mostraJanela() {
      janela.setVisible(true); //torna a janea visível
  }
}