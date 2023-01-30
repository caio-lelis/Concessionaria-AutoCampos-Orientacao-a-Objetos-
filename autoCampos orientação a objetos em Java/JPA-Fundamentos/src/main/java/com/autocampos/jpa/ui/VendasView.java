package com.autocampos.jpa.ui;

import java.awt.Font;
import javax.swing.*;
import com.autocampos.jpa.models.Venda;
import com.autocampos.jpa.services.impl.VendaService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;

/**
 * Classe VendasView serve de interface para busca de vendas.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.2
 * */
public class VendasView {
	private JFrame janela;
	private JButton cadastroVenda;
	private JButton deleteVenda;
	private JButton pesquisaVeiculo;
	private JTextField buscaAcom;
	private JLabel descricao;
	private VendaService vendaService = new VendaService();
	private JTextArea areaTexto;
		
	/**
	 * Cria o cont�iner e seus componentes da classe VendasView
	 * */
	public VendasView() {
		janela = new JFrame("Vendas Cadastradas");
		JLabel titulo = new JLabel("Vendas");

		cadastroVenda = new JButton("Cadastrar");
		deleteVenda = new JButton("Deletar");
		pesquisaVeiculo= new JButton("Pesquisar");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(140, 10, 250, 30);

		
		pesquisaVeiculo.setBounds(245, 200, 140, 30);
		cadastroVenda.setBounds(50, 250, 140, 30);
		deleteVenda.setBounds(200, 250, 140, 30);

		buscaAcom = new JTextField(200);
		buscaAcom.setBounds(20, 200, 210, 30);
		descricao = new JLabel("Pesquise pelo Comprador");
		descricao.setBounds(20, 170, 250, 30);

		areaTexto = new JTextArea();
    	areaTexto.setBounds(20, 50, 350, 120);

		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		janela.add(titulo);
		janela.add(areaTexto);
		janela.add(cadastroVenda);
		janela.add(deleteVenda);
		janela.add(descricao);
		janela.add(pesquisaVeiculo);
		janela.add(buscaAcom);
		janela.add(areaTexto);

		janela.setSize(400, 340);
		janela.setVisible(true);
		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
		cadastroVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaEditVendaView telaCadastroVenda = new TelaEditVendaView();		
			}
		});

		pesquisaVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String comprador = buscaAcom.getText();
				List<Venda> vendas = vendaService.searchByName(comprador);
				JOptionPane.showMessageDialog(null, vendas.toString());
				areaTexto.setText(vendas.toString());
			}
		});

		deleteVenda.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String comprador = buscaAcom.getText();
				System.out.println(comprador);
				areaTexto.setText(" ");
				Optional<Venda> venda = vendaService.searchByName(comprador).stream().findFirst();
				vendaService.deleteById(venda.get().getId());   
			}
		});
		

	}
	
	/**
	 * Inicia a classe VendasView
	 * @param args
	 * */
	public static void main(String[] args) {
		VendasView v = new VendasView();
	}

}