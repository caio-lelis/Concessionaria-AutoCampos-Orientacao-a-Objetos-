package model;

public class TestandoClasses {

public static void main(String[] args) {

				// Testando Cliente

Comprador joao = new Comprador(false, 20.000, "João", "1420145", "61-91111-1111");
System.out.println(joao);
joao.isDeficiente();

				// Testando Veiculo
Veiculo sandero = new Carro("Renault", "Sandero", "preto", 2019, 32.555, 4);
System.out.println(sandero);

				// Testando Concessionária
Concessionaria ValeDosCarros = new Concessionaria("Vale dos Carros", "Gama-DF", "15455-45", "61 95555-5555");
System.out.println(ValeDosCarros);

				// Testando Venda e método negociação
Venda venda = new Venda(joao, "débito", sandero);
System.out.println(venda);
			venda.negociacao();

		}
	}


