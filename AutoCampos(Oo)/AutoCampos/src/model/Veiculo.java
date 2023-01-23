package model;

abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected String cor;
	protected int ano;
	protected double valor;
	
	
	public Veiculo(String marca, String modelo, String cor, int ano, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	}

	//______________Métodos________________________________________//

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
		return "Marca: " + marca + " Carro: " + modelo +  " valor: " + valor;
			
	}
}
