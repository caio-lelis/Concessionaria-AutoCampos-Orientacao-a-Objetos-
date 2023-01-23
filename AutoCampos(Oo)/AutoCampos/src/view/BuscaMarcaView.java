package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class BuscaMarcaView {
	  public BuscaMarcaView() {
		    // Cria a JFrame


		  	JFrame frame = new JFrame("Busca por marca");
		    frame.setSize(400, 300);
		    frame.setLayout(null);
		    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		    // Cria a JList
		    String[] listData = {"Ford", "Tesla", "Fiat"};
		    JList<String> list = new JList<>(listData);
		    list.setBounds(100,50,200,100);
		    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		    
		    
		    //Adiciona JLabel
		    JLabel marcas = new JLabel("Marca desejada: ");
		    marcas.setBounds(150, 0, 150, 70);
		    
		    // Adiciona a JList ao JFrame
		    frame.add(list);

		    //Centraliza o JFrame na tela
		    frame.setLocationRelativeTo(null);
		    
		    // Cria o botão
		    JButton botaoBuscar = new JButton("Busca");
		    //botaoBuscar.setBounds(150,165,115,30);
		    botaoBuscar.setBounds(50,165,115,30);
		   
		    
		    
		    //Outro Botão
		    JButton botaoBuscaPreco = new JButton("Filtrar por preço");
		    botaoBuscaPreco.setBounds(190,165,155,30);
		    
		    
		    frame.add(botaoBuscaPreco);
		    frame.add(botaoBuscar);
		    frame.add(marcas);
		    
		    
		    
		    // Exibe a JFrame
		    frame.setVisible(true);
		  
	  }
		
	  public static void main(String[] args) {
			BuscaMarcaView marca = new BuscaMarcaView();
		}	


}


