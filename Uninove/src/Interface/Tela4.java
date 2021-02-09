package Interface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.*;
 
public class Tela4 extends JFrame {
 
    //Propriedades locais:
    private JLabel lblNome, lblRenda;
    private JTextField txtNome, txtRenda;
    private JButton btnSalvar, btnSair;
 
    public Tela4() {
        setTitle("Exemplo com GridBagLayout"); //Titulo da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); //O que acontece quando fechar a jane;a
        setSize(700, 200); //Tamanho da janela
        setLayout(new GridBagLayout()); //Seta o gerenciador que será usado
        GridBagConstraints gridCons = new GridBagConstraints();
 
        //Seta as propriedades dos parâmetros locais:
        lblNome = new JLabel("Nome:");
        txtNome = new JTextField(45);
        lblRenda = new JLabel("Renda:");
        txtRenda = new JTextField(15);
        btnSalvar = new JButton("Salvar");
        btnSair = new JButton("Sair");
 
        //Seta a grid e posiciona os elementos:
        gridCons.gridx = 0;
        gridCons.gridy = 0;
        gridCons.gridwidth = 2;
        add(lblNome, gridCons);
 
        gridCons.gridx = 2;
        gridCons.gridy = 0;
        gridCons.gridwidth = 4;
        add(txtNome, gridCons);
 
        gridCons.gridx = 0;
        gridCons.gridy = 1;
        gridCons.gridwidth = 2;
        gridCons.insets = new Insets(15, 0, 8, 0);
        add(lblRenda, gridCons);
 
        gridCons.gridx = 2;
        gridCons.gridy = 1;
        gridCons.gridwidth = 2;
        gridCons.anchor = GridBagConstraints.WEST;
        add(txtRenda, gridCons);
 
        gridCons.gridx = 1;
        gridCons.gridy = 2;
        gridCons.gridwidth = 2;
        gridCons.insets = new Insets(5, 5, 5, 5);
        gridCons.anchor = GridBagConstraints.CENTER;
        add(btnSalvar, gridCons);
 
        gridCons.gridx = 3;
        gridCons.gridy = 2;
        gridCons.gridwidth = 2;
        gridCons.anchor = GridBagConstraints.CENTER;
        add(btnSair, gridCons);
    }
}
