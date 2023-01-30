package com.autocampos.jpa.view;

import javax.swing.*;

import com.autocampos.jpa.controllers.impl.CarroService;
import com.autocampos.jpa.models.Carro;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
public class BuscaPrecoView{

	private JTextArea areaTexto;
  private CarroService carroService = new CarroService();
   
  public BuscaPrecoView() {
    this.iniciaComponentes();
  }



  void iniciaComponentes(){
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
    JLabel valores = new JLabel("Preço máximo desejado: ");
    valores.setBounds(10, 15, 150, 70);
    
    JTextField valorPesquisa = new JTextField(200);
    valorPesquisa.setBounds(130, 40, 200, 25);
    // Cria o botão
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

  public static void main(String[] args) {
    new BuscaPrecoView();
  }
}