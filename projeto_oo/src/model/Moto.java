package model;

public class Moto extends Veiculo {
	
	private int cilindradas;

	public Moto(String marca, String modelo, String cor, int ano, double valor, int cilindradas) {
		super(marca, modelo, cor, ano, valor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}	
}
