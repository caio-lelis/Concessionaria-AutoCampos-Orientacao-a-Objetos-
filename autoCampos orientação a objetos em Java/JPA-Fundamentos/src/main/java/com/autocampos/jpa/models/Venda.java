package com.autocampos.jpa.models;

import javax.persistence.*;

@Entity
@Table(name="vendas")

/**
 * Classe Venda simula uma venda.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.4
 * */
public class Venda {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="venda_id")
    private int id;
    @Column(name ="venda_comprador")
	private String comprador;
    @Column(name ="venda_data_venda")
	private String dataVenda;
	
	@Column(name ="venda_veiculo_id_fk")
	private int veiculoId;
	
	/**
	 * Cria o objeto da classe Venda sem par�metro
	 * */
	public Venda() {
	}
	
	/**
	 * Cria o objeto da classe Venda com os pr�prios par�metros
	 * @param comprador
	 * 		  Depend�ncia de comprador
	 * @param dataVenda
	 * 		  Data da aquisi��o do comprador
	 * @param veiculoId
	 * 		  Ve�culo escolhido pelo comprador
	 * */
	public Venda(String comprador, String dataVenda, int veiculoId) {
		this.comprador = comprador;
		this.dataVenda = dataVenda;
		this.veiculoId = veiculoId;
	}
	//______________M�todos________________________________________//
	
	/**
	 * Retorna o comprador da classe Venda
	 * @return String
	 * */
	public String getComprador() {
		return comprador;
	}
	
	/**
	 * Define o comprador da classe Venda
	 * @param comprador
	 * */
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	/**
	 * Retorna a data da venda da classe Venda
	 * @return String
	 * */
	public String getDataVenda() {
		return dataVenda;
	}
	
	/**
	 * Define a data da venda da classe Venda
	 * @param tipoPagamento
	 * */
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	/**
	 * Retorna o ve�culo da classe Venda
	 * @return int
	 * */
	public int getVeiculoId() {
		return veiculoId;
	}
	
	/**
	 * Define o ve�culo da classe Venda
	 * @param veiculoId
	 * */
	public void setVeiculoId(int veiculoId) {
		this.veiculoId = veiculoId;
	}
	
	/**
	 * Retorna a id do banco de dados da classe Veiculo
	 * @return int
	 * */
	public int getId() {
		return id;
	}



	//_____________________Declarando construtor______________________// 
	
	/**
	  * Sobrescreve o m�todo toString() da classe Object. Constr�i uma String contendo os
	  * valores de algumas vari�veis da classe Venda.
	  * @return String
	  * */
	@Override
	public String toString() {
		return "Cliente: " + comprador + " Veiculo:" + veiculoId + " Data da Venda: " + dataVenda +"";
	}

} 
