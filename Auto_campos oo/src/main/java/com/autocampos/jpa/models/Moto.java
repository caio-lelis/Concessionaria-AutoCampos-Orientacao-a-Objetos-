package com.autocampos.jpa.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "motos")
public class Moto extends Veiculo{

    @Column(name ="cilindradas")
    private int cilindradas;

	
	//______________Métodos________________________________________//
	public Moto(String marca, String modelo, String cor, int ano, double valor, int cilindradas) {
		super(marca, modelo, cor, ano, valor);
		this.cilindradas = cilindradas;
	}
	
	public Moto() {
		super();
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}	

	
	//_____________________Declarando construtor______________________//   Moto Check

	@Override
	public String toString() {
		return "Marca: " + marca + " Moto: " + modelo + " Valor: " + valor + "\n" ;
			
	}
}
