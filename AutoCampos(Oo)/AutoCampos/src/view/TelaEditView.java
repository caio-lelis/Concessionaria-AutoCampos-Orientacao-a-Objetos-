package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaEditView {
	private JFrame janela = new JFrame ("Edição Veiculos");
	private JLabel labelNome = new JLabel("Marca: ");
	private JTextField valorNome;
	private JLabel labelModelo = new JLabel("Modelo: ");
	private JTextField valorModelo;
	private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	private JLabel labelAno = new JLabel("Ano: ");
	private JTextField valorAno;
	private JLabel labelValor = new JLabel("Valor");
	private JTextField valorValor;
	private JButton botaoSalvar; 
	// Bot�es
		//private JButton botaoExcluir = new JButton("Excluir");
		//private JButton botaoSalvar = new JButton("Salvar");
	
		
		
public TelaEditView() {
			
	valorNome = new JTextField(200);
	valorModelo = new JTextField(200);
	valorCor = new JTextField(200);
	valorAno = new JTextField(200);
	valorValor = new JTextField(200);
	botaoSalvar = new JButton("Salvar");	
		
	
	labelNome.setBounds(30,20, 100, 25);
	valorNome.setBounds(136,20, 200, 25);
	labelModelo.setBounds(30,50, 100, 25);
	valorModelo.setBounds(136,50, 200, 25);
	labelCor.setBounds(30,80, 100, 25);
	valorCor.setBounds(136,80, 200, 25);
	labelAno.setBounds(30,110, 100, 25);
	valorAno.setBounds(136,110, 200, 25);
	labelValor.setBounds(30,140, 100, 25);
	valorValor.setBounds(136,140, 200, 25);
	botaoSalvar.setBounds(150, 200, 115, 30);		
	
	janela.add(labelNome);
	janela.add(valorNome);
	janela.add(labelModelo);
	janela.add(valorModelo);
	janela.add(labelCor);
	janela.add(valorCor);
	janela.add(labelAno);
	janela.add(valorAno);
	janela.add(labelValor);
	janela.add(valorValor);
	janela.setLayout(null);
	janela.setSize(400, 300);
	janela.setVisible(true);
	janela.setResizable(false);
	janela.setLocationRelativeTo(null);
	janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	janela.add(botaoSalvar);
			
			
			
			
	}	
		
		public static void main(String[] args) {
			TelaEditView v = new TelaEditView();
		}
		
}
