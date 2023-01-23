package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class VeiculosView {
	private JFrame janela;

	private JButton cadastroVeiculo;
	private JButton refreshVeiculo;

	private JButton pesquisaVeiculo;
	private JTextField buscaAcom;

	private JLabel descricao;

	private JList <String> listaVeiculos;
	private String[] listaNomes = new String[100];
	
	
	
public VeiculosView() {
	
	
	listaVeiculos = new JList<String>();
	
	janela = new JFrame("Veiculos Cadastrados");
	JLabel titulo = new JLabel("Veiculos");

	cadastroVeiculo = new JButton("Cadastrar");
	refreshVeiculo = new JButton("Refresh");
	pesquisaVeiculo= new JButton("Pesquisar");

	titulo.setFont(new Font("Arial", Font.BOLD, 20));
	titulo.setBounds(140, 10, 250, 30);

	listaVeiculos.setBounds(20, 50, 350, 120);
	listaVeiculos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	listaVeiculos.setVisibleRowCount(10);

	pesquisaVeiculo.setBounds(275, 200, 100, 30);
	cadastroVeiculo.setBounds(70, 250, 100, 30);
	refreshVeiculo.setBounds(200, 250, 100, 30);

	buscaAcom = new JTextField(200);
	buscaAcom.setBounds(20, 200, 240, 30);
	descricao = new JLabel("Pesquise pelo nome do Veiculo");
	descricao.setBounds(20, 170, 250, 30);

	janela.setLayout(null);
	janela.setResizable(false);
	janela.setLocationRelativeTo(null);

	janela.add(titulo);
	janela.add(listaVeiculos);
	janela.add(cadastroVeiculo);
	janela.add(refreshVeiculo);
	janela.add(descricao);
	janela.add(pesquisaVeiculo);
	janela.add(buscaAcom);

	janela.setSize(400, 340);
	janela.setVisible(true);
	janela.setLayout(null);
	janela.setResizable(false);
	janela.setLocationRelativeTo(null);
	janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	/*cadastroVeiculo.addActionListener(this);
	refreshVeiculo.addActionListener(this);
	listaVeiculos.addListSelectionListener(this);
	pesquisaVeiculo.addActionListener(this);*/

}
public static void main(String[] args) {
	VeiculosView c = new VeiculosView();
}



}

	
	
	
	
	





