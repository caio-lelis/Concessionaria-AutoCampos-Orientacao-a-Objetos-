package projeto_oo;

public class Cliente extends Pessoa {

	private boolean deficiente;
	private double saldoCliente;

	public Cliente(String nome, String cpf, String telefone, boolean deficiente, double saldoCliente) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.deficiente = deficiente;
		this.telefone = telefone;
		this.saldoCliente = saldoCliente;
	}

	@Override
	public String toString() {
		return "nome:" + getNome() + " |CPF: " + getCpf() + " |telefone: " + getTelefone() + "|Saldo para compra:"
				+ saldoCliente;
	}

	public void isDeficiente() {
		if (deficiente == true) {
			System.out.println("você ganhará 5% de desconto em sua aquisição");
		} else {
			System.out.println(" ");
		}
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

	public void getDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}

}
