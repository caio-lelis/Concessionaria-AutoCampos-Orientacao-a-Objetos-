package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class MenuView {

	private static JFrame janela = new JFrame("Menu AutoCampos");
	private static JLabel titulo = new JLabel("AutoCampos");
	JButton selecionaVeiculos = new JButton("Veiculos");
	JButton selecionaVendas = new JButton("Vendas");
	JButton selecionaBuscas = new JButton("Buscas");
	
	
	public MenuView() {
		inciaComponentes();
	}

	void inciaComponentes() {
		// Determinando tamanho dos �cones

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(130, 10, 150, 50);
		selecionaVeiculos.setBounds(95, 70, 200, 40);
		selecionaVendas.setBounds(95, 125, 200, 40);
		selecionaBuscas.setBounds(95, 180, 200, 40);

		// Gerando janela com os par�metros especificados

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(selecionaVeiculos);
		janela.add(selecionaVendas);
		janela.add(selecionaBuscas);

		// Determinando tamanho padr�o da janela

		janela.setSize(400, 300);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setVisible(true);
		
		//Adicionando ActionListener aos botões
		selecionaVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VendasView janelaVendas = new VendasView();		
			}
		});
		
		selecionaVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VeiculosView janelaVeiculos = new VeiculosView();		
			}
		});
		
		
		selecionaBuscas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuscaMarcaView janelaBusca = new BuscaMarcaView();		
			}
		});
		
	}

	public static void main(String[] args) {
		MenuView menu = new MenuView();
		
	
	}
	

	//@Override
	/*public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
			
		if (src == selecionaVeiculos) new VeiculosView();
			
		
		if (src == selecionaVendas) new VendasView();
			
		if (src == selecionaBuscas)	new BuscaMarcaView();
		
		
		
	}*/
	
	
}
