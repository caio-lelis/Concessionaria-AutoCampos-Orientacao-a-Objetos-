package model;

public class Concessionaria {
	private String nome;
	private String endereco;
	private String cnpj;
	private String telefone;

	public Concessionaria() {
	}
	
	public Concessionaria(String nome, String endereco, String cnpj, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public void listagemPorValor(){
		
	}
	
	@Override
	public String toString() {
		return "Loja:" + nome + "|CNPJ: " + cnpj + "|Endereço: " + endereco + "|Telefone:" + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}