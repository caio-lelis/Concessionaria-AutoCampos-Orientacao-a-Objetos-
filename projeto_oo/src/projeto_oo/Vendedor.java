package projeto_oo;

public class Vendedor extends Pessoa {
	
	private boolean comissao;

	public Vendedor(String nome, String cpf, String endereco, boolean comissao) {
		super(nome, cpf, endereco);
		
	}

	public boolean isComissao() {
		if (comissao == true) {
			System.out.println("Parabéns, você ganhou 5% de comissão referente ao valor de sua venda ");
		}
		return comissao;
	}

	public void setComissao(boolean comissao) {
		this.comissao = comissao;
	}

}
