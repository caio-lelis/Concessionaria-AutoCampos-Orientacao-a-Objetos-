package com.autocampos.jpa.models;

import java.util.ArrayList;

/**
 * Classe Concessionaria simula uma concessionária.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.4
 */
public class Concessionaria {
	private String nome;
	private String endereco;
	private String cnpj;
	private String telefone;
	private ArrayList <Veiculo> listaVeiculos = new ArrayList <Veiculo> ();
	
	/**
	 * Cria o objeto da classe Concessionaria sem parâmetro
	 * */
	public Concessionaria() {
	}
	
	/**
	 * Cria o objeto da classe Concessionaria com os próprios parâmetros
	 * @param nome
	 * 		  Nome da concessionária
	 * @param endereco
	 * 		  Endereco da concessionária
	 * @param cnpj
	 * 		  CNPJ da concessionária
	 * @param telefone
	 * 		  Telefone da concessionária
	 * @param listaVeiculos
	 * 		  Lista de veículos da concessionária
	 * */
	public Concessionaria(String nome, String endereco, String cnpj, String telefone,
						  ArrayList <Veiculo> listaVeiculos) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.setListaVeiculos(listaVeiculos);
	}

	
	
	//______________Métodos________________________________________//
	
	/**
	 * Retorna o nome da classe Concessionária
	 * @return String
	 * */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome da classe Concessionária
	 * @param nome
	 * */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o endereço da classe Concessionária
	 * @return String
	 * */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * Define o endereco da classe Concessionária
	 * @param endereco
	 * */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * Retorna o cnpj da classe Concessionária
	 * @return String
	 * */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * Define o cnpj da classe Concessionária
	 * @param cnpj
	 * */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Retorna o telefone da classe Concessionária
	 * @return String
	 * */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Define o telefone da classe Concessionária
	 * @param telefone
	 * */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	//Crud de Veiculo
	
	/**
	 * Retorna a lista de veículos da variável listaVeiculos
	 * @return ArrayList
	 * */
	public ArrayList <Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}
	
	/**
	 * Adiciona um veículo a variável listaVeiculos
	 * @param veiculo
	 * */
	public void adicionarVeiculo(Veiculo veiculo){
		listaVeiculos.add(veiculo);	
	}
	
	/**
	 * Remove um veículo da variável listaVeiculos
	 * @param veiculo
	 * */
	public void removerVeiculo(Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);			
	}
	
	/**
	 * Lista veículos por valor da variável listaVeiculos
	 * */
	public void listagemPorValor(){
	}
	
	/**
	 * Define a lista de veículos da classe Concessionária
	 * @param listaVeiculos
	 * */
	public void setListaVeiculos(ArrayList <Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	
	
	
	
	//_____________________Declarando construtor______________________// 
		
	/**
	* Sobrescreve o método toString() da classe Object. Constrói uma String contendo o
	* valor de algumas variáveis da classe Concessionária.
	* @return String
	* */
	@Override
	public String toString() {
		return "Loja: " + nome + "Veiculos a venda: " +listaVeiculos ;
	}
	
}