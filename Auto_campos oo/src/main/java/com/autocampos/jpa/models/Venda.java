package com.autocampos.jpa.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
@Table(name="vendas")
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

	public Venda() {
	}
	
	public Venda(String comprador, String dataVenda, int veiculoId) {
		this.comprador = comprador;
		this.dataVenda = dataVenda;
		this.veiculoId = veiculoId;
	}
	//______________Métodos________________________________________//
	
	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(int veiculoId) {
		this.veiculoId = veiculoId;
	}

	public int getId() {
		return id;
	}



	//_____________________Declarando construtor______________________// 
	
	@Override
	public String toString() {
		return "Cliente: " + comprador + " Veiculo:" + veiculoId + " Data da Venda: " + dataVenda +"\n";
	}

} 
