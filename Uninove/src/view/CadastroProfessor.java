package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Tela.Endereco;
import Tela.Professor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.LongAccumulator;
import java.awt.event.ActionEvent;

public class CadastroProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField jTxtNome;
	private JTextField jTxtMatricula;
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
	private JTextField jTxtSalario;
	private JTextField jTxtDtContratacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor frame = new CadastroProfessor();
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
	public CadastroProfessor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 773, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 757, 476);
		contentPane.add(panel);
		
		JLabel jLbNome = new JLabel("Nome:");
		jLbNome.setBounds(59, 85, 58, 26);
		panel.add(jLbNome);
		
		jTxtNome = new JTextField();
		jTxtNome.setColumns(10);
		jTxtNome.setBounds(143, 91, 272, 20);
		panel.add(jTxtNome);
		
		JLabel jLbMatricula = new JLabel("Matricula:");
		jLbMatricula.setBounds(59, 57, 74, 14);
		panel.add(jLbMatricula);
		
		jTxtMatricula = new JTextField();
		jTxtMatricula.setColumns(10);
		jTxtMatricula.setBounds(143, 57, 131, 20);
		panel.add(jTxtMatricula);
		
		JLabel jLbeCpf = new JLabel("CPF:");
		jLbeCpf.setBounds(59, 135, 28, 14);
		panel.add(jLbeCpf);
		
		jTxtCpf = new JTextField();
		jTxtCpf.setColumns(10);
		jTxtCpf.setBounds(143, 135, 131, 20);
		panel.add(jTxtCpf);
		
		JLabel jLbRg = new JLabel("RG:");
		jLbRg.setBounds(59, 171, 46, 14);
		panel.add(jLbRg);
		
		jTxtRg = new JTextField();
		jTxtRg.setColumns(10);
		jTxtRg.setBounds(143, 166, 131, 20);
		panel.add(jTxtRg);
		
		JLabel jLbDtNasc = new JLabel("Data de Nac:");
		jLbDtNasc.setBounds(59, 211, 74, 14);
		panel.add(jLbDtNasc);
		
		jTxtDtNasc = new JTextField();
		jTxtDtNasc.setColumns(10);
		jTxtDtNasc.setBounds(143, 208, 86, 20);
		panel.add(jTxtDtNasc);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(50, 253, 652, 155);
		panel.add(panel_1);
		
		JLabel label_5 = new JLabel("Endere\u00E7o do Aluno:");
		label_5.setBounds(20, 11, 130, 14);
		panel_1.add(label_5);
		
		JLabel jLbLogradouro = new JLabel("Logradouro");
		jLbLogradouro.setBounds(30, 36, 79, 14);
		panel_1.add(jLbLogradouro);
		
		JLabel jLbBairro = new JLabel("Bairro:");
		jLbBairro.setBounds(40, 61, 46, 14);
		panel_1.add(jLbBairro);
		
		jTxtLogradouro = new JTextField();
		jTxtLogradouro.setColumns(10);
		jTxtLogradouro.setBounds(114, 36, 396, 20);
		panel_1.add(jTxtLogradouro);
		
		JLabel jLbNumero = new JLabel("N:");
		jLbNumero.setBounds(520, 39, 46, 14);
		panel_1.add(jLbNumero);
		
		jTxtNumero = new JTextField();
		jTxtNumero.setColumns(10);
		jTxtNumero.setBounds(539, 33, 66, 20);
		panel_1.add(jTxtNumero);
		
		jTxtBairro = new JTextField();
		jTxtBairro.setColumns(10);
		jTxtBairro.setBounds(92, 61, 232, 20);
		panel_1.add(jTxtBairro);
		
		JLabel jLbCidade = new JLabel("Cidade:");
		jLbCidade.setBounds(40, 94, 46, 14);
		panel_1.add(jLbCidade);
		
		jTxtCidade = new JTextField();
		jTxtCidade.setColumns(10);
		jTxtCidade.setBounds(92, 91, 162, 20);
		panel_1.add(jTxtCidade);
		
		JLabel jLbEstado = new JLabel("Estado:");
		jLbEstado.setBounds(278, 92, 46, 14);
		panel_1.add(jLbEstado);
		
		jTxtEstado = new JTextField();
		jTxtEstado.setColumns(10);
		jTxtEstado.setBounds(338, 91, 39, 20);
		panel_1.add(jTxtEstado);
		
		JLabel jLbComplemento = new JLabel("Complemento:");
		jLbComplemento.setBounds(346, 61, 92, 14);
		panel_1.add(jLbComplemento);
		
		jTxtComplemento = new JTextField();
		jTxtComplemento.setColumns(10);
		jTxtComplemento.setBounds(441, 58, 118, 20);
		panel_1.add(jTxtComplemento);
		
		JLabel jLbCep = new JLabel("CEP:");
		jLbCep.setBounds(30, 125, 46, 14);
		panel_1.add(jLbCep);
		
		jTxtCep = new JTextField();
		jTxtCep.setColumns(10);
		jTxtCep.setBounds(92, 122, 100, 20);
		panel_1.add(jTxtCep);
		
		JButton button = new JButton("CADASTRAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//chamar a classe professor
				Professor p = new Professor();
				
				try {
					
					p.setCpf(jTxtCpf.getText());
					p.setDataNasc(jTxtDtNasc.getText());
					p.setDtContratacao(jTxtDtContratacao.getText());
					
					//chamar a classe endereço 
					Endereco ep = new Endereco();
					
					ep.setBairro(jTxtBairro.getText());
					ep.setCep(Long.parseLong(jTxtCep.getText()));
					ep.setCidade(jTxtCidade.getText());
					ep.setComplemento(jTxtComplemento.getText());
					ep.setEstado(jTxtEstado.getText());
					ep.setLogradouro(jTxtLogradouro.getText());
					ep.setNumero(Integer.parseInt(jTxtNumero.getText()));
					ep.setPais("Brasil");
					
					//adicionar a classe endereço para adicionar os campos
					p.setEndereco(ep);
					p.setMatricula(Long.parseLong(jTxtMatricula.getText()));
					p.setNome(jTxtNome.getText());
					p.setRg(jTxtRg.getText());
					p.setSalario(Double.parseDouble(jTxtSalario.getText()));
				
					
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
				finally {
					JOptionPane.showMessageDialog(null, "Aluno Criado com sucesso","Aluno criado", JOptionPane.INFORMATION_MESSAGE);
				}
				}
		});
		button.setBounds(565, 430, 131, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Limpar");
		button_1.addActionListener(new ActionListener() {
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
					jTxtMatricula.setText("");
					jTxtRg.setText("");
					jTxtSalario.setText("");
				}
			}
				
		});
		button_1.setBounds(426, 430, 112, 23);
		panel.add(button_1);
		
		jTxtSalario = new JTextField();
		jTxtSalario.setColumns(10);
		jTxtSalario.setBounds(465, 54, 131, 20);
		panel.add(jTxtSalario);
		
		JLabel jLbSalario = new JLabel("Salario:");
		jLbSalario.setBounds(418, 57, 46, 14);
		panel.add(jLbSalario);
		
		JLabel jLblDtContratacao = new JLabel("Dt Contrata\u00E7\u00E3o");
		jLblDtContratacao.setBounds(378, 135, 86, 14);
		panel.add(jLblDtContratacao);
		
		jTxtDtContratacao = new JTextField();
		jTxtDtContratacao.setBounds(465, 132, 94, 20);
		panel.add(jTxtDtContratacao);
		jTxtDtContratacao.setColumns(10);
	}
}
