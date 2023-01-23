package model;

public class Moto extends Veiculo {
	
	private int cilindradas;

	
	//______________Métodos________________________________________//
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

	
	//_____________________Declarando construtor______________________//   Moto Check

	@Override
	public String toString() {
		return "|Marca: " + marca + " |Moto: " + modelo + "valor: " + valor ;
			
	}


}

