package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
 
//Como temos eventos, a classe herda de jFrame E implementa a ActionListener
public class Aplicativo extends JFrame implements ActionListener {
 
    //Atributos locais da classe:
    private JPanel pnlCampos, pnlTabela, pnlBotoes, pnlNome, pnlTelefone, pnlCidade;
    private TitledBorder tituloPnlCampos, tituloPnlTabela, tituloPnlBotoes;
    private JLabel lblNome, lblTelefone, lblCidade;
    private JTextField txtNome;
    private JFormattedTextField txtTelefone;
    private MaskFormatter mskTelefone;
    private JTable tblClientes;
    private DefaultTableModel tblClientesModel;
    JButton btnAdicionar, btnLimpar;
    private JComboBox cmbCidades;
    private DefaultComboBoxModel cmbCidadesModel;
 
    //Construtor, que coloca tudo no lugar
    public Aplicativo() {
        definirJanela(); //Chama o m�todo que seta as propriedades da janela
        pnlCampos = new JPanel(new GridLayout(3, 1)); //Um painel para os campos
        tituloPnlCampos = BorderFactory.createTitledBorder("Cadastro de Clientes");
        pnlCampos.setBorder(tituloPnlCampos);
 
        //Painel para os bot�es:
        pnlBotoes = new JPanel(new FlowLayout());
        tituloPnlBotoes = BorderFactory.createTitledBorder("Bot�es");
        pnlBotoes.setBorder(tituloPnlBotoes);
 
        //Painel para a tabela
        pnlTabela = new JPanel(new GridLayout(1, 1));
        tituloPnlTabela = BorderFactory.createTitledBorder("Tabela de Dados");
        pnlTabela.setBorder(tituloPnlTabela);
 
        //Seta os labels
        lblNome = new JLabel("Nome");
        lblTelefone = new JLabel("Telefone");
        lblCidade = new JLabel("Cidade");
        txtNome = new JTextField(50);
 
        //Cria um campo de texto com uma m�scara para o telefone
        try {
            mskTelefone = new MaskFormatter("(##)####-####");
            mskTelefone.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "M�scara incorreta");
        }
        txtTelefone = new JFormattedTextField(mskTelefone);
        cmbCidadesModel = new DefaultComboBoxModel();
        cmbCidades = new JComboBox(cmbCidadesModel);
 
        //Cidades para o combo de sele��o
        String cidade1 = "S�o Paulo";
        String cidade2 = "Rio de Janeiro";
        String cidade3 = "Campinas";
 
        //Acrescenta as cidades
        cmbCidadesModel.addElement(cidade1);
        cmbCidadesModel.addElement(cidade2);
        cmbCidadesModel.addElement(cidade3);
        pnlNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNome.add(lblNome);
        pnlNome.add(txtNome);
        pnlCampos.add(pnlNome);
 
        pnlTelefone = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlTelefone.add(lblTelefone);
        pnlTelefone.add(txtTelefone);
        pnlCampos.add(pnlTelefone);
 
        pnlCidade = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlCidade.add(lblCidade);
        pnlCidade.add(cmbCidades);
        pnlCampos.add(pnlCidade);
 
        //Seta os bot�es
        btnAdicionar = new JButton("Adicionar � tabela");
        btnAdicionar.addActionListener(this); //Adiciona o Listener ao bot�o
        btnLimpar = new JButton("Limpar campos");
        btnLimpar.addActionListener(this); //Adiciona o Listener ao bot�o
        pnlBotoes.add(btnAdicionar);
        pnlBotoes.add(btnLimpar);
 
        //Define a tabela
        String[] cols = {"Nome", "Telefone", "Cidade"};
        tblClientesModel = new DefaultTableModel(cols, 3);
        tblClientes = new JTable(tblClientesModel);
        tblClientesModel.setNumRows(0);
 
        JScrollPane scrRolagem = new JScrollPane(tblClientes,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnlTabela.add(scrRolagem);
 
        add(pnlCampos, BorderLayout.NORTH);
        add(pnlBotoes, BorderLayout.CENTER);
        add(pnlTabela, BorderLayout.SOUTH);
    }
 
    //m�todo para setar algumas proprietdades da janela
    private void definirJanela() {
        setTitle("Aplica��o de cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(800, 700);
        setLocation(200, 80);
    }
 
    //M�todo main
    public static void main(String args[]) {
        Aplicativo ap = new Aplicativo();
        ap.setVisible(true);
    }
 
    //Sobrescrita obrigat�ria da interface ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         A ideia � assim: � um listerner para todos os bot�es.
         O Listener deve identificar qual bot�o foi clicado e disparar
         uma a��o espec�fica para cada um
         */
        if (e.getSource() == btnAdicionar) { //Para o bot�o adicionar
            String[] linha = {txtNome.getText(),
                txtTelefone.getText(),
                cmbCidadesModel.getSelectedItem().toString()};
            tblClientesModel.addRow(linha);
            JOptionPane.showMessageDialog(this, "Dados adicionados", "Feito", JOptionPane.PLAIN_MESSAGE);
        } else if (e.getSource() == btnLimpar) { //Para o bot�o limpar
            int op = JOptionPane.showConfirmDialog(this, "Quer, realmente, limpar os campos?", "Limpar", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == 0) {
                txtNome.setText(null);
                txtTelefone.setText(null);
                cmbCidadesModel.setSelectedItem("S�o Paulo");
                txtNome.requestFocus(); //Coloca o cursor no txtNome
            }
        }
    }
}