package projeto_oo;

public class Vendedor extends Pessoa {
	
	private boolean comissao;
	private double precoSugerido;

	public double getPrecoSugerido() {
		return precoSugerido;
	}

	public void setPrecoSugerido(double precoSugerido) {
		this.precoSugerido = precoSugerido;
	}

	public Vendedor(String nome, String cpf, String endereco, 
			boolean comissao) {
		super();
		
	}

	public boolean isComissao() {
		if (comissao == true) {
			System.out.println("Parabéns, você ganhou 5% de "
					+ "comissão referente ao valor de sua venda ");
			
		}
		return comissao;
	}

	public void setComissao(boolean comissao) {
		this.comissao = comissao;
	}

}
