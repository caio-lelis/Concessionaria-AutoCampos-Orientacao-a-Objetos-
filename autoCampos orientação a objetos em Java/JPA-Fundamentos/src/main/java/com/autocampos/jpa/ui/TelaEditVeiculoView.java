package com.autocampos.jpa.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.autocampos.jpa.models.Carro;
import com.autocampos.jpa.models.Moto;
import com.autocampos.jpa.services.impl.CarroService;

/**
 * Classe TelaEditVeiculoView serve de interface para cadastro de veículos.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.2
 * */
public class TelaEditVeiculoView {
    private JFrame janela = new JFrame("Edicao de Veiculos");
    private JLabel labelNome = new JLabel("Marca: ");
    private JTextField valorMarca;
    private JLabel labelModelo = new JLabel("Modelo: ");
    private JTextField valorModelo;
    private JLabel labelCor = new JLabel("Cor: ");
    private JTextField valorCor;
    private JLabel labelAno = new JLabel("Ano: ");
    private JTextField valorAno;
    private JLabel labelValor = new JLabel("Valor");
    private JTextField valorValor;
    private JLabel labelNumPortas = new JLabel("N Portas");
    private JTextField valorNumPortas;
    private JLabel labelCilindradas = new JLabel("Cilindradas");
    private JTextField valorCilindradas;
    private JButton botaoSalvar;
    // Botï¿½es
    // private JButton botaoExcluir = new JButton("Excluir");
    // private JButton botaoSalvar = new JButton("Salvar");
    private CarroService carroService = new CarroService();
    
    /**
	 * Inicia os componentes da método iniciaComponentes
	 * */
    public TelaEditVeiculoView() {

       this.iniciaComponentes();

    }
    
    /**
	 * Cria o contêiner e seus componentes da classe TelaEditVendaView
	 * */
    public void iniciaComponentes(){
        valorMarca = new JTextField(200);
        valorModelo = new JTextField(200);
        valorCor = new JTextField(200);
        valorAno = new JTextField(200);
        valorValor = new JTextField(200);
        valorCilindradas = new JTextField(200);
        valorNumPortas = new JTextField(200);
        botaoSalvar = new JButton("Salvar");

        labelNome.setBounds(30, 20, 100, 25);
        valorMarca.setBounds(136, 20, 200, 25);
        labelModelo.setBounds(30, 50, 100, 25);
        valorModelo.setBounds(136, 50, 200, 25);
        labelCor.setBounds(30, 80, 100, 25);
        valorCor.setBounds(136, 80, 200, 25);
        labelAno.setBounds(30, 110, 100, 25);
        valorAno.setBounds(136, 110, 200, 25);
        labelValor.setBounds(30, 140, 100, 25);
        valorValor.setBounds(136, 140, 200, 25);
        labelNumPortas.setBounds(30, 170, 200, 25);
        valorNumPortas.setBounds(136, 170, 200, 25);
        labelCilindradas.setBounds(30, 200, 200, 25);
        valorCilindradas.setBounds(136, 200, 200, 25);
        botaoSalvar.setBounds(150, 230, 115, 30);
        

        janela.add(labelNome);
        janela.add(valorMarca);
        janela.add(labelModelo);
        janela.add(valorModelo);
        janela.add(labelCor);
        janela.add(valorCor);
        janela.add(labelAno);
        janela.add(valorAno);
        janela.add(labelValor);
        janela.add(valorValor);
        janela.add(labelNumPortas);
        janela.add(valorNumPortas);
        janela.add(labelCilindradas);
        janela.add(valorCilindradas);
        janela.setLayout(null);
        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.add(botaoSalvar);

        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if(valorCilindradas.getText().isEmpty()){
              Carro carro = new Carro();
              carro.setMarca(valorMarca.getText());
              carro.setCor(valorCor.getText());
              carro.setAno(Integer.parseInt(valorAno.getText()));
              carro.setValor(Double.parseDouble(valorValor.getText()));
              carro.setModelo(valorModelo.getText());
              carro.setNumPortas(Integer.parseInt(valorNumPortas.getText()));    
              carroService.insert(carro);
            } else if(valorNumPortas.getText().isEmpty()){
                Moto moto = new Moto();
                moto.setMarca(valorMarca.getText());
                moto.setCor(valorCor.getText());
                moto.setAno(Integer.parseInt(valorAno.getText()));
                moto.setValor(Double.parseDouble(valorValor.getText()));
                moto.setModelo(valorModelo.getText());
                moto.setCilindradas((Integer.parseInt(valorCilindradas.getText())));    
                //carroService.insert(moto);
            }
        }
        
        });
    }
    
    /**
	 * Inicia a classe TelaEditVeiculoView
	 * @param args
	 * */
    public static void main(String[] args) {
        TelaEditVeiculoView v = new TelaEditVeiculoView();
    }

}