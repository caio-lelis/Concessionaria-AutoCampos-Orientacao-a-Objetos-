package model;

public class Comprador {

	
	private double saldoComprador;
	private String nome;
	private String cpf;
	
	
	
	public Comprador( double saldoComprador, String nome, String cpf) {
		this.saldoComprador = saldoComprador;
		this.nome = nome;
		this.cpf = cpf;	
	}
	
	//______________Métodos________________________________________//
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

	
	
	//_____________________Declarando construtor______________________//   			Comprador Check
	
	@Override
	public String toString() {
		return "nome:" + getNome()  + "/CPF: " + getCpf() +
			   "/Saldo para compra:" + getSaldoComprador();
	}
	
}
