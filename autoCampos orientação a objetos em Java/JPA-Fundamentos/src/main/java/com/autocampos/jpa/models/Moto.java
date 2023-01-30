package com.autocampos.jpa.models;

import javax.persistence.*;

@Entity
@Table(name = "motos")

/**
 * Classe Moto simula o comportamento de uma moto e herda da classe Veiculo.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.5
 * */
public class Moto extends Veiculo{

    @Column(name ="cilindradas")
    private int cilindradas;

	
	//______________M�todos________________________________________//
    
    /**
	 * Cria o objeto da classe Moto com o pr�prio par�metro e os par�metros de Veiculo
	 * @param marca
	 * 		  Marca da moto
	 * @param modelo
	 * 		  Modelo da moto
	 * @param cor
	 * 		  Cor da moto
	 * @param ano
	 * 	 	  Ano de fabrica��o da moto
	 * @param valor
	 * 		  Valor da moto
	 * @param cilindradas
	 * 		  Cilindradas da moto
	 * */
	public Moto(String marca, String modelo, String cor, int ano, double valor, int cilindradas) {
		super(marca, modelo, cor, ano, valor);
		this.cilindradas = cilindradas;
	}
	
	/**
	 * Cria o objeto da classe Moto sem par�metros
	 * */
	public Moto() {
		super();
	}
	
	/**
	 * Retorna as cilindradas da moto
	 * @return int
	 * */
	public int getCilindradas() {
		return cilindradas;
	}
	
	/**
	 * Define as cilindradas da moto
	 * @param cilindradas
	 * */
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}	

	
	//_____________________Declarando construtor______________________//   Moto Check
	
	/**
	 * Sobrescreve o m�todo toString() das classes Object e Veiculo . Constr�i uma String
	 * contendo o valor algumas vari�veis da classe Veiculo.
	 * @return String
	 * */
	@Override
	public String toString() {
		return "Marca: " + marca + " Moto: " + modelo + " Valor: " + valor + "" ;
			
	}
}
