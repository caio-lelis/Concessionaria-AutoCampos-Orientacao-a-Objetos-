package projeto_oo;

public class Concessionaria {
	private String nomeLoja;
	private String endereco;
	private String cnpj;
	private String telefone;
	
	public Concessionaria(String nome, String endereco, String cnpj, String telefone) {
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