package com.autocampos.jpa.ui;

import javax.swing.*;
import com.autocampos.jpa.services.impl.CarroService;
import com.autocampos.jpa.models.Carro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Classe BuscaPrecoView serve de interface para a busca de veículos por preço.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.2
 * */
public class BuscaPrecoView{

	private JTextArea areaTexto;
	private CarroService carroService = new CarroService();
  
    /**
	  * Inicia a interface do método iniciaComponentes
	  * */
	public BuscaPrecoView() {
		this.iniciaComponentes();
	}


    /**
	  * Cria o contêiner e seus componentes da classe BuscaPrecoView
	  * */
	public void iniciaComponentes(){
		// Cria a JFrame
	    JFrame frame = new JFrame("Busca por preço");
	    frame.setSize(400, 300);
	    frame.setLayout(null);
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	    areaTexto = new JTextArea();
	    areaTexto.setBounds(20, 80, 350, 120);
	
	    // Centraliza a JFrame na tela
	    frame.setLocationRelativeTo(null);
	
	    
	    //Criando JLabel
	    JLabel valores = new JLabel("Preco maximo desejado: ");
	    valores.setBounds(10, 15, 150, 70);
	    
	    JTextField valorPesquisa = new JTextField(200);
	    valorPesquisa.setBounds(130, 40, 200, 25);
	    // Cria o botÃ£o
	    JButton button = new JButton("Buscar");
	    button.setBounds(150,215,115,30);
	    frame.add(button);
	    frame.add(valores);
	    frame.add(valorPesquisa);
	    frame.add(areaTexto);
	    // Exibe a JFrame
	    frame.setVisible(true);
	
	    button.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent e){
	        String nome = valorPesquisa.getText();
	        areaTexto.setText(" ");
	        List<Carro> carros = carroService.searchByValor(Double.parseDouble(nome));
	        carros.stream().forEach(carro -> {
	          areaTexto.append(carro.toString());
	          areaTexto.append("\n");
	        });
	      }
	    });
	}
	  
	/**
	  * Inicia a classe BuscaPrecoView
	  * @param args
	  * */
	public static void main(String[] args) {
		new BuscaPrecoView();
	}
}