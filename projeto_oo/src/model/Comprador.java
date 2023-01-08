package model;

public class Comprador {

	private boolean deficiente;
	private double saldoComprador;
	private String nome;
	private String cpf;
	private String telefone;
	
	public Comprador() {
	}

	public Comprador(boolean deficiente, double saldoComprador, String nome, String cpf, String telefone) {
		this.deficiente = deficiente;
		this.saldoComprador = saldoComprador;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public void buscarPorMarca() {
		
	}

	@Override
	public String toString() {
		return "nome:" + getNome() + " |CPF: " + getCpf() + " |telefone: " + getTelefone() +
			   "|Saldo para compra:" + saldoComprador;
	}

	public void isDeficiente() {
		if (deficiente == true) {
			System.out.println("você ganhará 5% de desconto em sua aquisição");
		} else {
			System.out.println(" ");
		}
	}

	public double getSaldoComprador() {
		return saldoComprador;
	}

	public void setSaldoComprador(double saldoComprador) {
		this.saldoComprador = saldoComprador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}
}
