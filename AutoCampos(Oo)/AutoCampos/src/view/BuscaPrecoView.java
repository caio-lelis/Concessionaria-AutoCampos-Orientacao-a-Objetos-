package view;

import javax.swing.*;
import java.awt.*;

public class BuscaPrecoView{
  public static void main(String[] args) {
    // Cria a JFrame
    JFrame frame = new JFrame("Busca por preço");
    frame.setSize(400, 300);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Centraliza a JFrame na tela
    frame.setLocationRelativeTo(null);

    
    //Criando JLabel
    JLabel valores = new JLabel("Preço desejado: ");
    valores.setBounds(150, 0, 150, 70);
    // Cria a JList
    String[] listData = {"15.000", "30.000", "45.000"};
    JList<String> list = new JList<>(listData);
    list.setBounds(100,50,200,100);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Adiciona a JList ao JFrame
    frame.add(list);

    // Cria o botão
    JButton button = new JButton("Buscar");
    button.setBounds(150,165,115,30);
    frame.add(button);
    frame.add(valores);
    // Exibe a JFrame
    frame.setVisible(true);
  }
}
