package projeto_oo;

public class Vendedor extends Pessoa {

	private boolean comissaoDeVenda;
	private double precoSugerido;

	public Vendedor(String nome, String cpf, String telefone, boolean comissaoDeVenda) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.comissaoDeVenda = comissaoDeVenda;
	}

	@Override
	public String toString() {
		return "nome : " + super.getNome() + " |CPF : " + super.getCpf() + " |telefone : " + super.getTelefone();
	}

	public void isComissao() {
		if (comissaoDeVenda == true) {
			System.out.println("parabéns vendedor você ganhou uma comissão de 2%");
		} else {

		}
	}

	public void setComissao(boolean comissao) {
		this.comissaoDeVenda = comissao;
	}

	public double getPrecoSugerido() {
		return precoSugerido;
	}

	public void setPrecoSugerido(double precoSugerido) {
		this.precoSugerido = precoSugerido;
	}
}
