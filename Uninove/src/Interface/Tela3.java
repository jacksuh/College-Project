package Interface;

import java.awt.GridLayout;
import javax.swing.*;
 
public class Tela3 extends JFrame {
 
    private JLabel lblNome, lblRenda;
    private JTextField txtNome, txtRenda;
    private JButton btnSalvar, btnSair;
 
    //Construtor:
    public Tela3() {
 
        setTitle("Exemplo com GridLayout"); //Titulo da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2)); //Numero de células (linhas X Colunas)
        setSize(600, 200); //tamanho da tela
        setLocation(300, 200); // POsição da tela
 
        //Campos:
        lblNome = new JLabel("Nome:");
        add(lblNome);
        txtNome = new JTextField();
        add(txtNome);
        lblRenda = new JLabel("Renda:");
        add(lblRenda);
        txtRenda = new JTextField();
        add(txtRenda);
        btnSalvar = new JButton("Salvar");
        add(btnSalvar);
        btnSair = new JButton("Sair");
        add(btnSair);
    }
}