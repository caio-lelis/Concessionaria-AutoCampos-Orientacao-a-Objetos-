package com.autocampos.jpa.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Classe MenuView serve de menu para as classes de interface.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.2
 * */
public class MenuView {

	private static JFrame janela = new JFrame("Menu AutoCampos");
	private static JLabel titulo = new JLabel("AutoCampos");
	JButton selecionaVeiculos = new JButton("Veiculos");
	JButton selecionaVendas = new JButton("Vendas");
	JButton selecionaBuscas = new JButton("Buscas");
	
	/**
	 * Inicia os componentes do método iniciaComponentes
	 * @param args
	 * */
	public MenuView() {
		this.iniciaComponentes();
	}
	
	/*
	 * Cria o contêiner e seus componentes da classe MenuView
	 * */
	public void iniciaComponentes() {
		// Determinando tamanho dos ícones

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(130, 10, 150, 50);
		selecionaVeiculos.setBounds(95, 70, 200, 40);
		selecionaVendas.setBounds(95, 125, 200, 40);
		selecionaBuscas.setBounds(95, 180, 200, 40);

		// Gerando janela com os parâmetros especificados

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(selecionaVeiculos);
		janela.add(selecionaVendas);
		janela.add(selecionaBuscas);

		// Determinando tamanho padrï¿½o da janela

		janela.setSize(400, 300);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setVisible(true);
		
		//Adicionando ActionListener aos botÃµes
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

	
	/**
	 * Inicia a classe MenuView
	 * @param args
	 * */
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