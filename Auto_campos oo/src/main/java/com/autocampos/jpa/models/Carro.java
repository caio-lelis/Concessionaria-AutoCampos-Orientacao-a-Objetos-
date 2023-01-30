package com.autocampos.jpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carros")
public class Carro extends Veiculo {
	
    @Column(name ="carro_num_portas")
	public int numPortas;
		
	public Carro(String marca, String modelo, String cor, int ano, double valor, int numPortas) {
		super(marca, modelo, cor, ano, valor);
		this.numPortas = numPortas;
	}

	 
	//______________Métodos________________________________________//
	
	public Carro() {
		super();
	}


	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}



	//_____________________Declarando construtor______________________//   Carro Check

	@Override
	public String toString() {
		return ("Marca: " + marca + " Modelo:  " + modelo + " Valor:  " + valor+"\n");
			
	}

}