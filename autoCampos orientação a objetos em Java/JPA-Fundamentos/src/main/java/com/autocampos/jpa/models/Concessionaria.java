package com.autocampos.jpa.models;

import java.util.ArrayList;

/**
 * Classe Concessionaria simula uma concession�ria.
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
	 * Cria o objeto da classe Concessionaria sem par�metro
	 * */
	public Concessionaria() {
	}
	
	/**
	 * Cria o objeto da classe Concessionaria com os pr�prios par�metros
	 * @param nome
	 * 		  Nome da concession�ria
	 * @param endereco
	 * 		  Endereco da concession�ria
	 * @param cnpj
	 * 		  CNPJ da concession�ria
	 * @param telefone
	 * 		  Telefone da concession�ria
	 * @param listaVeiculos
	 * 		  Lista de ve�culos da concession�ria
	 * */
	public Concessionaria(String nome, String endereco, String cnpj, String telefone,
						  ArrayList <Veiculo> listaVeiculos) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.setListaVeiculos(listaVeiculos);
	}

	
	
	//______________M�todos________________________________________//
	
	/**
	 * Retorna o nome da classe Concession�ria
	 * @return String
	 * */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome da classe Concession�ria
	 * @param nome
	 * */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o endere�o da classe Concession�ria
	 * @return String
	 * */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * Define o endereco da classe Concession�ria
	 * @param endereco
	 * */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * Retorna o cnpj da classe Concession�ria
	 * @return String
	 * */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * Define o cnpj da classe Concession�ria
	 * @param cnpj
	 * */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Retorna o telefone da classe Concession�ria
	 * @return String
	 * */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Define o telefone da classe Concession�ria
	 * @param telefone
	 * */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	//Crud de Veiculo
	
	/**
	 * Retorna a lista de ve�culos da vari�vel listaVeiculos
	 * @return ArrayList
	 * */
	public ArrayList <Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}
	
	/**
	 * Adiciona um ve�culo a vari�vel listaVeiculos
	 * @param veiculo
	 * */
	public void adicionarVeiculo(Veiculo veiculo){
		listaVeiculos.add(veiculo);	
	}
	
	/**
	 * Remove um ve�culo da vari�vel listaVeiculos
	 * @param veiculo
	 * */
	public void removerVeiculo(Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);			
	}
	
	/**
	 * Lista ve�culos por valor da vari�vel listaVeiculos
	 * */
	public void listagemPorValor(){
	}
	
	/**
	 * Define a lista de ve�culos da classe Concession�ria
	 * @param listaVeiculos
	 * */
	public void setListaVeiculos(ArrayList <Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	
	
	
	
	//_____________________Declarando construtor______________________// 
		
	/**
	* Sobrescreve o m�todo toString() da classe Object. Constr�i uma String contendo o
	* valor de algumas vari�veis da classe Concession�ria.
	* @return String
	* */
	@Override
	public String toString() {
		return "Loja: " + nome + "Veiculos a venda: " +listaVeiculos ;
	}
	
}