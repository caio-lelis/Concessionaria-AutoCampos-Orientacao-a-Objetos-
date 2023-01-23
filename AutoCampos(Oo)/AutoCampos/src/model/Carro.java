package model;

public class Carro extends Veiculo {
	
	public int numPortas;
		
	public Carro(String marca, String modelo, String cor, int ano, double valor, int numPortas) {
		super(marca, modelo, cor, ano, valor);
		this.numPortas = numPortas;
	}

	
	//______________Métodos________________________________________//
	
	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}


	//_____________________Declarando construtor______________________//   Carro Check

	@Override
	public String toString() {
		return ("marca: " + marca + "modelo: " + modelo + "valor: " + valor);
			
	}

}
