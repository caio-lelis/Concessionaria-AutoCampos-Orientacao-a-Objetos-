package com.autocampos.jpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name="veiculos")
@Inheritance(strategy = InheritanceType.JOINED)
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
	
	
	public Veiculo(String marca, String modelo, String cor, int ano, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	}

	public Veiculo() {
		
	}
	//______________Métodos________________________________________//

	public int getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

	
	//_____________________Declarando construtor______________________//   Veiculo Check
	
	@Override
	public String toString() {
		return "Marca:  " + marca + " Carro:  " + modelo +  " Valor:  " + valor +"\n";
			
	}
}