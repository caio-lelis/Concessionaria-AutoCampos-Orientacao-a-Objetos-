package model;

public class Venda {
	private Comprador comprador;
	private String dataVenda;
	private Veiculo veiculo;

	public Venda() {
	}
	
	public Venda(Comprador comprador, String tipoPagamento, Veiculo veiculo) {
		this.comprador = comprador;
		this.dataVenda = tipoPagamento;
		this.veiculo = veiculo;
	}
	//______________Métodos________________________________________//
	
	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public String getTipoPagamento() {
		return dataVenda;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.dataVenda = tipoPagamento;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void negociacao() {
		if (comprador.getSaldoComprador() >= veiculo.getValor()) {
			System.out.println("Você pode comprar o veiculo");
		} else {
			System.out.println("Você não tem dinheiro suficiente para a compra!");
		}
	}


	//_____________________Declarando construtor______________________// 
	
	@Override
	public String toString() {
		return "Cliente: " + comprador + "|Veiculo:" + veiculo + "Data da Venda: " + dataVenda;
	}

}
