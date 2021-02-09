package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 453);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jMnArquivo = new JMenu("Arquivo");
		menuBar.add(jMnArquivo);
		
		JMenuItem jMnSair = new JMenuItem("Sair");
		jMnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jMnArquivo.add(jMnSair);
		
		JMenu jMnCadastro = new JMenu("Cadastro");
		menuBar.add(jMnCadastro);
		
		JMenuItem jMnAluno = new JMenuItem("Aluno");
		jMnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CadastraAluno cA = new CadastraAluno();
				cA.setVisible(true);
			}
		});
		jMnCadastro.add(jMnAluno);
		
		JMenuItem jMnProfessor = new JMenuItem("Professor");
		jMnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroProfessor cP = new CadastroProfessor();
				cP.setVisible(true);
			}
		});
		jMnCadastro.add(jMnProfessor);
			
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
