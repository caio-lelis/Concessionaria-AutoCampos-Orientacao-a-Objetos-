package com.autocampos.jpa.view;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.autocampos.jpa.controllers.impl.CarroService;
import com.autocampos.jpa.controllers.impl.VendaService;
import com.autocampos.jpa.models.Carro;
import com.autocampos.jpa.models.Venda;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaEditVendaView {

    private JFrame janela = new JFrame("Edição Vendas");
    private JLabel labelNome = new JLabel("Comprador: ");
    private JTextField valorComprador;
    private JLabel labelSala = new JLabel("Data da Venda: ");
    private JTextField valorDataVenda;
    private JLabel labelHora = new JLabel("Veiculo: ");
    private JTextField valorVeiculo;
    private JButton botaoSalvar;

    private CarroService carroService = new CarroService();
    private VendaService vendaService = new VendaService();

    public TelaEditVendaView() {

        this.iniciaComponentes();

    }

    void iniciaComponentes() {
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
       
        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Venda venda = new Venda();
            venda.setComprador(valorComprador.getText());
            venda.setDataVenda(valorDataVenda.getText());
            Carro carro = carroService.searchByName(valorVeiculo.getText()).get(0);
            venda.setVeiculoId(carro.getId());
            JOptionPane.showMessageDialog(null, carro.toString());
            vendaService.insert(venda);
        }
        
        });

    }

    public static void main(String[] args) {
        TelaEditVendaView d = new TelaEditVendaView();
    }

}