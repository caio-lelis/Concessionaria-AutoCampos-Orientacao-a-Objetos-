package projeto_oo;

public class Cliente extends Pessoa {
	
	private boolean deficiente;
	private double saldoCliente;

	public Cliente(String nome, String cpf, String endereco , boolean deficiente) {
		super();
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public double getSaldoCliente() {
		return saldoCliente;
	}

	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}
	
	public void getDeficiente (boolean deficiente) {
		this.deficiente = deficiente;
	}

}
