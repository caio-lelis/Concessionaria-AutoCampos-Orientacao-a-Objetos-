package com.autocampos.jpa.models;

import javax.persistence.*;

@Entity
@Table(name="veiculos")
@Inheritance(strategy = InheritanceType.JOINED)

/**
 * Classe Veiculo serve de base para as classes Carro e Moto.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.2
 * */
public abstract class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="veiculo_id")
	protected int id;

	@Column(name ="veiculo_marca")
	protected String marca;

	@Column(name ="veiculo_modelo")
	protected String modelo;

	@Column(name ="veiculo_cor")
	protected String cor;

	@Column(name ="veiculo_ano")
	protected int ano;

	@Column(name ="veiculo_valor")
	protected double valor;
	
	/**
	 * Cria o objeto da classe Veiculo com os pr�prios par�metros
	 * @param marca
	 * 		  Marca do ve�culo
	 * @param modelo
	 * 		  Modelo do ve�culo
	 * @param cor
	 * 		  Cor do ve�culo
	 * @param ano
	 * 		  Ano do ve�culo
	 * @param valor
	 * 		  Valor do ve�culo
	 * */
	public Veiculo(String marca, String modelo, String cor, int ano, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	}
	
	/**
	 * Cria o objeto da classe Veiculo sem par�metros
	 * */
	public Veiculo() {
		
	}
	
	//______________M�todos________________________________________//
	
	/**
	 * Retorna a id do banco de dados da classe Veiculo
	 * @return int
	 * */
	public int getId() {
		return id;
	}
	
	/**
	 * Retorna a marca da classe Veiculo
	 * @return String
	 * */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Define a marca da classe Veiculo
	 * @param marca
	 * */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Retorna o modelo da classe Veiculo
	 * @return String
	 * */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Define o modelo da classe Veiculo
	 * @param modelo
	 * */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Retorna a cor da classe Veiculo
	 * @return String
	 * */
	public String getCor() {
		return cor;
	}
	
	/**
	 * Define a cor da classe Veiculo
	 * @param cor
	 * */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	/**
	 * Retorna o ano da classe Veiculo
	 * @return int
	 * */
	public int getAno() {
		return ano;
	}
	
	/**
	 * Define o ano da classe Veiculo
	 * @param ano
	 * */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * Retorna o valor da classe Veiculo
	 * @return double
	 * */
	public double getValor() {
		return valor;
	}
	
	/**
	 * Define o valor da classe Veiculo
	 * @param valor
	 * */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

	
	//_____________________Declarando construtor______________________//   Veiculo Check
	
	/**
	* Sobrescreve o m�todo toString() da classe Object. Constr�i uma String contendo os
	* valores de algumas vari�veis da classe Veiculo.
	* @return String
	* */
	@Override
	public String toString() {
		return "Marca: " + marca + " Carro: " + modelo +  " Valor: " + valor + " " ;
			
	}
}