package model;

import java.util.ArrayList;

public class Concessionaria {
	private String nome;
	private String endereco;
	private String cnpj;
	private String telefone;
	private ArrayList <Veiculo> listaVeiculos = new ArrayList <Veiculo> ();

	public Concessionaria() {
	}
	
	public Concessionaria(String nome, String endereco, String cnpj, String telefone,  ArrayList <Veiculo> listaVeiculos) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.setListaVeiculos(listaVeiculos);
	}

	
	
	//______________Métodos________________________________________//
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	//Crud de Veiculo
	
	public ArrayList <Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}
	
	public void adicionarVeiculo(Veiculo veiculo){
		listaVeiculos.add(veiculo);	
	}
	public void removerViculo(Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);			
	}

	public void listagemPorValor(){
	}
	
	public void setListaVeiculos(ArrayList <Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	
	
	
	
	//_____________________Declarando construtor______________________// 
	
		@Override
		public String toString() {
			return "Loja:" + nome + "Veiculos a venda: " +listaVeiculos ;
		}
	
	
	

}