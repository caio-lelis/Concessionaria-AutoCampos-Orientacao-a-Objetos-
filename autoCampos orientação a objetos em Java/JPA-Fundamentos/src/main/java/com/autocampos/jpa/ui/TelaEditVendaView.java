package com.autocampos.jpa.ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.autocampos.jpa.models.Carro;
import com.autocampos.jpa.models.Venda;
import com.autocampos.jpa.services.impl.CarroService;
import com.autocampos.jpa.services.impl.VendaService;


/**
 * Classe TelaEditVendaView serve de interface para gerenciamento de vendas.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.2
 * */
public class TelaEditVendaView {

    private JFrame janela = new JFrame("Edicao de Vendas");
    private JLabel labelNome = new JLabel("Comprador: ");
    private JTextField valorComprador;
    private JLabel labelSala = new JLabel("Data da Venda: ");
    private JTextField valorDataVenda;
    private JLabel labelHora = new JLabel("Veiculo: ");
    private JTextField valorVeiculo;
    private JButton botaoSalvar;
    private CarroService carroService = new CarroService();
    private VendaService vendaService = new VendaService();
    
    /**
	 * Inicia os componentes do método iniciaComponentes
	 * */
    public TelaEditVendaView() {

        this.iniciaComponentes();

    }
    
    /**
	 * Cria o contêiner e seus componentes da classe TelaEditVendaView
	 * */
    public String iniciaComponentes() {
        valorComprador = new JTextField(200);
        valorDataVenda = new JTextField(200);
        valorVeiculo = new JTextField(200);
        botaoSalvar = new JButton("Salvar");

        labelNome.setBounds(30, 20, 100, 25);
        valorComprador.setBounds(136, 20, 200, 25);
        labelSala.setBounds(30, 50, 100, 25);
        valorDataVenda.setBounds(136, 50, 200, 25);
        labelHora.setBounds(30, 80, 100, 25);
        valorVeiculo.setBounds(136, 80, 200, 25);
        botaoSalvar.setBounds(150, 130, 115, 30);

        janela.add(labelNome);
        janela.add(valorComprador);
        janela.add(labelSala);
        janela.add(valorDataVenda);
        janela.add(labelHora);
        janela.add(valorVeiculo);
        janela.add(botaoSalvar);

        janela.setLayout(null);
        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        Venda venda = new Venda();
        
        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            venda.setComprador(valorComprador.getText());
            venda.setDataVenda(valorDataVenda.getText());
            Carro carro = carroService.searchByName(valorVeiculo.getText()).get(0);
            venda.setVeiculoId(carro.getId());
            JOptionPane.showMessageDialog(null, carro.toString());
            vendaService.insert(venda);
        }
        
        });
        
        return venda.getDataVenda();
    }
    
    /**
	 * Inicia a classe TelaEditVendaView
	 * @param args
	 * */
    public static void main(String[] args) {
        TelaEditVendaView d = new TelaEditVendaView();
    }

}