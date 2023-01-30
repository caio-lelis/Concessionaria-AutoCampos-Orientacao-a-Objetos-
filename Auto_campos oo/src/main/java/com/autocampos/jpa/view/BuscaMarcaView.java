package com.autocampos.jpa.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

import com.autocampos.jpa.controllers.impl.CarroService;
import com.autocampos.jpa.models.Carro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class BuscaMarcaView {
	private JTextArea areaTexto;
	  private CarroService carroService = new CarroService();

	  public BuscaMarcaView() {
		    // Cria a JFrame


		  	JFrame frame = new JFrame("Busca por marca");
		    frame.setSize(400, 300);
		    frame.setLayout(null);
		    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		   
		    
		    
		    //Adiciona JLabel
		    JLabel marcas = new JLabel("Marca desejada: ");
		    marcas.setBounds(150, 0, 150, 70);
		    
		    //Cria Text Area

			areaTexto = new JTextArea();
    		areaTexto.setBounds(20, 50, 350, 120);

		    //Centraliza o JFrame na tela
		    frame.setLocationRelativeTo(null);
		    
		    // Cria o botão
		    JButton botaoBuscar = new JButton("Busca");
		    //botaoBuscar.setBounds(150,165,115,30);
		    botaoBuscar.setBounds(50,180,115,30);
		   
		    
		    
		    //Outro Botão
		    JButton botaoBuscaPreco = new JButton("Filtrar por preço");
		    botaoBuscaPreco.setBounds(190,180,155,30);
		    
		    
		    frame.add(botaoBuscaPreco);
		    frame.add(botaoBuscar);
		    frame.add(marcas);
		    frame.add(areaTexto);
		    
		    
		    // Exibe a JFrame
		    frame.setVisible(true);

			botaoBuscar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String nome = areaTexto.getText();
					areaTexto.setText(" ");
					List<Carro> carros = carroService.searchByMarca(nome);
					carros.stream().forEach(carro -> {
						areaTexto.append(carro.toString());
						areaTexto.append("\n");
					});
				}
			});

			botaoBuscaPreco.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					BuscaPrecoView preco = new BuscaPrecoView();
				}
			});
		  
	  }
		
	  public static void main(String[] args) {
			BuscaMarcaView marca = new BuscaMarcaView();
		}	


}

