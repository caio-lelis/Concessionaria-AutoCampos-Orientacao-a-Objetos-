package projeto_oo;

public class Concessionaria {
	private String nomeLoja;
	private String endereco;
	private String cnpj;
	private String telefone;

	public Concessionaria(String nomeLoja, String endereco, String cnpj, String telefone) {

		this.nomeLoja = nomeLoja;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Loja:" + nomeLoja + "|CNPJ: " + cnpj + "|Endereço: " + endereco + "|Telefone:" + telefone;
	}

	public String getNome() {
		return nomeLoja;
	}

	public void setNome(String nome) {
		this.nomeLoja = nome;
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