package com.autocampos.jpa.models;

import javax.persistence.*;

@Entity
@Table(name = "carros")

/**
 * Classe Carro simula o comportamento de um carro e herda da classe Veiculo.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.8
 * */
public class Carro extends Veiculo {
	
    @Column(name ="carro_num_portas")
	private int numPortas;
		
    /**
	 * Cria o objeto da classe Carro com o pr�prio par�metro e os par�metros de Veiculo
	 * @param marca
	 * 		  Marca do carro
	 * @param modelo
	 * 		  Modelo do carro
	 * @param cor
	 * 		  Cor do carro
	 * @param ano
	 * 	 	  Ano de fabrica��o do carro
	 * @param valor
	 * 		  Valor do carro
	 * @param numPortas
	 * 		  N�mero de portas do carro
	 * */
	public Carro(String marca, String modelo, String cor, int ano, double valor, int numPortas) {
		super(marca, modelo, cor, ano, valor);
		this.numPortas = numPortas;
	}

	 
	//______________M�todos________________________________________//
	
	/**
	 * Cria o objeto da classe Carro sem par�metros
	 * */
	public Carro() {
		super();
	}

	/**
	 * Retorna o n�mero de portas do carro
	 * @return int
	 * */
	public int getNumPortas() {
		return numPortas;
	}
	
	/**
	 * Define o n�mero de portas do carro
	 * @param numPortas
	 * */
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}



	//_____________________Declarando construtor______________________//   Carro Check
	
	/**
	 * Sobrescreve o m�todo toString() das classes Object e Veiculo . Constr�i uma String
	 * contendo o valor algumas vari�veis da classe Veiculo.
	 * @return String
	 * */
	@Override
	public String toString() {
		return ("Marca: " + marca + " Modelo: " + modelo + " Valor: " + valor+"");
			
	}

}