package model;

public class Caminhao extends Veiculo {

	private double tamanhoCarroceria;

	public Caminhao(String marca, String modelo, String cor, int ano, double valor,
					double tamanhoCarroceria) {
		super(marca, modelo, cor, ano, valor);
		this.tamanhoCarroceria = tamanhoCarroceria;
	}

	public double getTamanhoCarroceria() {
		return tamanhoCarroceria;
	}

	public void setTamanhoCarroceria(double tamanhoCarroceria) {
		this.tamanhoCarroceria = tamanhoCarroceria;
	}
}
