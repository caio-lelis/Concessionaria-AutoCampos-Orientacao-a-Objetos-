package projeto_oo;

public class Venda {
	private Cliente cliente;
	private Vendedor vendedor;
	private String tipoPagamento;
	private Veiculo veiculo;

	public Venda(Cliente cliente, Vendedor vendedor, String tipoPagamento, Veiculo veiculo) {
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.tipoPagamento = tipoPagamento;
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "Cliente: " + cliente + "|Vendedor:" + vendedor + "|Veiculo:" + veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void negociacao() {
		if (cliente.getSaldoCliente() >= veiculo.getValor()) {
			System.out.println("Você pode comprar o veiculo");
		} else {
			System.out.println("Você não tem dinheiro suficiente para a compra!");
		}
	}
}
