package com.autocampos.jpa.view;



import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import com.autocampos.jpa.controllers.impl.CarroService;
import com.autocampos.jpa.models.Carro;


public class VeiculosView {
	private JFrame janela;

	private JButton cadastroVeiculo;
	private JButton deleteVeiculo;

	private JButton pesquisaVeiculo;
	private JTextField buscaAcom;

	private JLabel descricao;

	private JList <String> listaVeiculos;

    private JTextArea areaTexto;
	
	CarroService carroService = new CarroService();
   
	
	
public VeiculosView(){
	this.iniciaComponentes();
}


void iniciaComponentes(){

	listaVeiculos = new JList<String>();
	
	janela = new JFrame("Veiculos Cadastrados");
	JLabel titulo = new JLabel("Veiculos");

    areaTexto = new JTextArea();
    areaTexto.setBounds(20, 50, 350, 120);
	cadastroVeiculo = new JButton("Cadastrar");
	deleteVeiculo = new JButton("Deletar");
	pesquisaVeiculo= new JButton("Pesquisar");

	titulo.setFont(new Font("Arial", Font.BOLD, 20));
	titulo.setBounds(140, 10, 250, 30);

	listaVeiculos.setBounds(20, 50, 350, 120);
	listaVeiculos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	listaVeiculos.setVisibleRowCount(10);

	pesquisaVeiculo.setBounds(250, 200, 140, 30);
	cadastroVeiculo.setBounds(50, 250, 140, 30);
	deleteVeiculo.setBounds(250, 250, 140, 30);

	buscaAcom = new JTextField(200);
	buscaAcom.setBounds(20, 200, 210, 30);
	descricao = new JLabel("Pesquise pelo modelo do Veiculo:");
	descricao.setBounds(20, 170, 250, 30);

	janela.setLayout(null);
	janela.setResizable(false);
	janela.setLocationRelativeTo(null);

	janela.add(titulo);
	//janela.add(listaVeiculos);
    janela.add(areaTexto);
	janela.add(cadastroVeiculo);
	janela.add(deleteVeiculo);
	janela.add(descricao);
	janela.add(pesquisaVeiculo);
	janela.add(buscaAcom);

	janela.setSize(400, 340);
	janela.setVisible(true);
	janela.setLayout(null);
	janela.setResizable(false);
	janela.setLocationRelativeTo(null);
	janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    cadastroVeiculo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
            TelaEditView formulario = new TelaEditView();	
        }
    });

    List<Carro> carros = carroService.all();
    carros.stream().forEach(carro -> {
        areaTexto.append(carro.toString());
        areaTexto.append("\n");
    });
    
    pesquisaVeiculo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String nome = buscaAcom.getText();
            areaTexto.setText(" ");
            List<Carro> carros = carroService.searchByName(nome);
            carros.stream().forEach(carro -> {
                areaTexto.append(carro.toString());
                areaTexto.append("\n");
            });
        }
    });

    deleteVeiculo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String nome = buscaAcom.getText();
            System.out.println(nome);
            areaTexto.setText(" ");
            Optional<Carro> carro = carroService.searchByName(nome).stream().findFirst();
            carroService.deleteById(carro.get().getId());

           
        }
    });

    };

    

public static void main(String[] args) {
	VeiculosView c = new VeiculosView();
}



}

	
	
	
	
	




