package model;

public class Carro extends Veiculo {
	
	public int numPortas;

	public Carro(String marca, String modelo, String cor, int ano, double valor, int numPortas) {
		super(marca, modelo, cor, ano, valor);
		this.numPortas = numPortas;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
}
