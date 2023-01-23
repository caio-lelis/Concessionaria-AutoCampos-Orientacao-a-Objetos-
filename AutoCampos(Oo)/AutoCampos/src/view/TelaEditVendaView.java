package view;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaEditVendaView  {

	
	private JFrame janela = new JFrame ("Edição Vendas");
	private JLabel labelNome = new JLabel("Comprador: ");
	private JTextField valorNome;
	private JLabel labelSala = new JLabel("Data da Venda: ");
	private JTextField valorSala;
	private JLabel labelHora = new JLabel("Veiculo: ");
	private JTextField valorHora;
	private JButton botaoSalvar; 	
	
	public TelaEditVendaView(){
	
	valorNome = new JTextField(200);
	valorSala = new JTextField(200);
	valorHora = new JTextField(200);	
	botaoSalvar = new JButton("Salvar");
	
	
	labelNome.setBounds(30,20, 100, 25);
	valorNome.setBounds(136,20, 200, 25);
	labelSala.setBounds(30,50, 100, 25);
	valorSala.setBounds(136,50, 200, 25);
	labelHora.setBounds(30,80, 100, 25);
	valorHora.setBounds(136,80, 200, 25);
	botaoSalvar.setBounds(150, 130, 115, 30);
	
	janela.add(labelNome);
	janela.add(valorNome);
	janela.add(labelSala);
	janela.add(valorSala);
	janela.add(labelHora);
	janela.add(valorHora);
	janela.add(botaoSalvar);
	
	
	janela.setLayout(null);
	janela.setSize(400, 300);
	janela.setVisible(true);
	janela.setResizable(false);
	janela.setLocationRelativeTo(null);
	janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		}
	
	
	public static void main(String[] args) {
		TelaEditVendaView d = new TelaEditVendaView();
		}
		
}
