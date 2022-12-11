package projeto_oo;

public class Testagem {

	public static void main(String[] args) {

		// Testando Cliente

		Cliente joao = new Cliente("João", "1420145", "61-91111-1111", false, 20.000);
		System.out.println(joao);
		joao.isDeficiente();

		// Testando Vendedor

		Vendedor Miguel = new Vendedor("Miguel", "2153212", "61 92222-2222", false);
		System.out.println(Miguel);
		Miguel.isComissao();

		// Testando Veiculo
		Veiculo sandero = new Veiculo("Renault", "Sandero", "preto", 2019, 4, 32.555);
		System.out.println(sandero);

		// Testando Concessionária
		Concessionaria ValeDosCarros = new Concessionaria("Vale dos Carros", "Gama-DF", "15455-45", "61 95555-5555");
		System.out.println(ValeDosCarros);

		// Testando Venda e método negociação
		Venda venda = new Venda(joao, Miguel, "débito", sandero);
		System.out.println(venda);
		venda.negociacao();

	}
}
