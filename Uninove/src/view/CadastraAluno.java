package view;


import java.awt.BorderLayout
;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.border.EtchedBorder;
import Tela.Aluno;
import Tela.Endereco;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class CadastraAluno extends JFrame {

	private JPanel contentPane;
	private JTextField jTxtNome;
	private JTextField jTxtRa;
	private JTextField jTxtCpf;
	private JTextField jTxtRg;
	private JTextField jTxtDtNasc;
	private JTextField jTxtLogradouro;
	private JTextField jTxtNumero;
	private JTextField jTxtBairro;
	private JTextField jTxtCidade;
	private JTextField jTxtEstado;
	private JTextField jTxtComplemento;
	private JTextField jTxtCep;
	private JTextField jTxtCurso;
	private JTextField jTxtNtVestibular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraAluno frame = new CadastraAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastraAluno() {
		setTitle("Cadastro de Aluno");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 747, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLbNome = new JLabel("Nome:");
		jLbNome.setBounds(59, 85, 74, 26);
		contentPane.add(jLbNome);
		
		jTxtNome = new JTextField();
		jTxtNome.setBounds(143, 91, 186, 20);
		contentPane.add(jTxtNome);
		jTxtNome.setColumns(10);
		
		JLabel jLbRa = new JLabel("RA:");
		jLbRa.setBounds(59, 57, 46, 14);
		contentPane.add(jLbRa);
		
		jTxtRa = new JTextField();
		jTxtRa.setBounds(143, 57, 131, 20);
		contentPane.add(jTxtRa);
		jTxtRa.setColumns(10);
		
		JLabel jLbCpf = new JLabel("CPF:");
		jLbCpf.setBounds(59, 135, 28, 14);
		contentPane.add(jLbCpf);
		
		jTxtCpf = new JTextField();
		jTxtCpf.setBounds(143, 135, 131, 20);
		contentPane.add(jTxtCpf);
		jTxtCpf.setColumns(10);
		
		JLabel jLbRg = new JLabel("RG:");
		jLbRg.setBounds(59, 171, 46, 14);
		contentPane.add(jLbRg);
		
		jTxtRg = new JTextField();
		jTxtRg.setBounds(143, 166, 131, 20);
		contentPane.add(jTxtRg);
		jTxtRg.setColumns(10);
		
		JLabel jLbDtNasc = new JLabel("Data de Nac:");
		jLbDtNasc.setBounds(59, 211, 74, 14);
		contentPane.add(jLbDtNasc);
		
		jTxtDtNasc = new JTextField();
		jTxtDtNasc.setBounds(143, 208, 86, 20);
		contentPane.add(jTxtDtNasc);
		jTxtDtNasc.setColumns(10);
		
		JPanel jPnEndereco = new JPanel();
		jPnEndereco.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		jPnEndereco.setBounds(50, 253, 652, 155);
		contentPane.add(jPnEndereco);
		jPnEndereco.setLayout(null);
		
		JLabel jLbTituloPnEndereco = new JLabel("Endere\u00E7o do Aluno:");
		jLbTituloPnEndereco.setBounds(20, 11, 130, 14);
		jPnEndereco.add(jLbTituloPnEndereco);
		
		JLabel jLbLogradouro = new JLabel("Logradouro");
		jLbLogradouro.setBounds(30, 36, 74, 14);
		jPnEndereco.add(jLbLogradouro);
		
		JLabel jLbBairro = new JLabel("Bairro:");
		jLbBairro.setBounds(40, 61, 46, 14);
		jPnEndereco.add(jLbBairro);
		
		jTxtLogradouro = new JTextField();
		jTxtLogradouro.setBounds(114, 36, 396, 20);
		jPnEndereco.add(jTxtLogradouro);
		jTxtLogradouro.setColumns(10);
		
		JLabel jLbNumero = new JLabel("N:");
		jLbNumero.setBounds(520, 39, 46, 14);
		jPnEndereco.add(jLbNumero);
		
		jTxtNumero = new JTextField();
		jTxtNumero.setBounds(539, 33, 66, 20);
		jPnEndereco.add(jTxtNumero);
		jTxtNumero.setColumns(10);
		
		jTxtBairro = new JTextField();
		jTxtBairro.setBounds(92, 61, 232, 20);
		jPnEndereco.add(jTxtBairro);
		jTxtBairro.setColumns(10);
		
		JLabel jLbCidade = new JLabel("Cidade:");
		jLbCidade.setBounds(40, 94, 46, 14);
		jPnEndereco.add(jLbCidade);
		
		jTxtCidade = new JTextField();
		jTxtCidade.setBounds(92, 91, 162, 20);
		jPnEndereco.add(jTxtCidade);
		jTxtCidade.setColumns(10);
		
		JLabel jLbEstado = new JLabel("Estado:");
		jLbEstado.setBounds(278, 92, 46, 14);
		jPnEndereco.add(jLbEstado);
		
		jTxtEstado = new JTextField();
		jTxtEstado.setBounds(338, 91, 39, 20);
		jPnEndereco.add(jTxtEstado);
		jTxtEstado.setColumns(10);
		
		JLabel jLbComplemento = new JLabel("Complemento:");
		jLbComplemento.setBounds(346, 61, 94, 14);
		jPnEndereco.add(jLbComplemento);
		
		jTxtComplemento = new JTextField();
		jTxtComplemento.setBounds(441, 58, 118, 20);
		jPnEndereco.add(jTxtComplemento);
		jTxtComplemento.setColumns(10);
		
		JLabel jLbCep = new JLabel("CEP:");
		jLbCep.setBounds(30, 125, 46, 14);
		jPnEndereco.add(jLbCep);
		
		jTxtCep = new JTextField();
		jTxtCep.setBounds(92, 122, 100, 20);
		jPnEndereco.add(jTxtCep);
		jTxtCep.setColumns(10);
		
		JButton JbtCadastrar = new JButton("CADASTRAR");
		JbtCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 Aluno a = new Aluno();
				
				try {
					
					a.setCpf(jTxtCpf.getText());
					a.setCurso(jTxtCurso.getText());
					a.setDataNasc(jTxtDtNasc.getText());
					
					Endereco ee = new Endereco(); 
					ee.setBairro(jTxtBairro.getText());
					long cep = Long.parseLong(jTxtCep.getText());
					ee.setCep(cep);
					ee.setCidade(jTxtCidade.getText());
					ee.setComplemento(jTxtComplemento.getText());
					ee.setEstado(jTxtEstado.getText());
					ee.setLogradouro(jTxtLogradouro.getText());
					int numero = Integer.parseInt(jTxtNumero.getText());
					ee.setNumero(numero);
					ee.setPais("Brasil");
					
					a.setEndereco(ee);
					a.setNome(jTxtNome.getText());
					a.setNotaVestibular(Float.parseFloat(jTxtNtVestibular.getText()));
					a.setRegistroAcademico(Long.parseLong(jTxtRa.getText()));
					a.setRg(jTxtRg.getText());
					
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
				finally {
					JOptionPane.showMessageDialog(null, "Aluno Criado com sucesso","Aluno criado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		JbtCadastrar.setBounds(565, 430, 131, 23);
		contentPane.add(JbtCadastrar);
		
		JButton jbtLimpar = new JButton("Limpar");
		jbtLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opc = JOptionPane.showConfirmDialog(null, "Você quer mesmo Limpar?", "Limpar",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(opc == 0) {
					jTxtBairro.setText("");
					jTxtCep.setText("");
					jTxtCidade.setText("");
					jTxtComplemento.setText("");
					jTxtCpf.setText("");
					jTxtDtNasc.setText("");
					jTxtEstado.setText("");
					jTxtLogradouro.setText("");
					jTxtNome.setText("");
					jTxtNumero.setText("");
					jTxtRa.setText("");
					jTxtRg.setText("");
				}
			}
		});
		jbtLimpar.setBounds(426, 430, 112, 23);
		contentPane.add(jbtLimpar);
		
		JLabel jLbCurso = new JLabel("Curso:");
		jLbCurso.setBounds(322, 57, 46, 14);
		contentPane.add(jLbCurso);
		
		jTxtCurso = new JTextField();
		jTxtCurso.setBounds(385, 54, 86, 20);
		contentPane.add(jTxtCurso);
		jTxtCurso.setColumns(10);
		
		JLabel jLbNotaVestibular = new JLabel("Nota Vestibular:");
		jLbNotaVestibular.setBounds(497, 57, 97, 14);
		contentPane.add(jLbNotaVestibular);
		
		jTxtNtVestibular = new JTextField();
		jTxtNtVestibular.setBounds(598, 54, 53, 20);
		contentPane.add(jTxtNtVestibular);
		jTxtNtVestibular.setColumns(10);
	}
}
