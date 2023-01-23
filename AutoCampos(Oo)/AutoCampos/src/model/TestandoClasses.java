package model;

import java.util.ArrayList;

public class TestandoClasses {

public static void main(String[] args) {
				
				
				//Criando lista de veiculos
ArrayList <Veiculo> listaVeiculos = new ArrayList <Veiculo> ();
				// Testando Cliente

//Comprador joao = new Comprador(false, 20.000, "João", "1420145", "61-91111-1111");
//System.out.println(joao);
//joao.isDeficiente();

				// Testando Veiculo
Veiculo sandero = new Carro("Renault", "Sandero", "preto", 2019, 32.555, 4);
System.out.println(sandero);
Veiculo Fiat500 = new Carro("Fiat", "Fiat500", "branco", 2014,31000,2);
Veiculo SCross = new Carro ("Suzuki" ,"SCross", "Marrom",2016,60000,4 );
Veiculo uno = new Carro ("Fiat" ,"Uno", "amrelo",1999,22000,2);				
Veiculo Bis = new Moto("Honda", "Bis", "Vermelha", 2010, 8000, 200);
				
				//Adicionando veiculos no array
listaVeiculos.add(sandero);
listaVeiculos.add(Fiat500);
listaVeiculos.add(SCross);
listaVeiculos.add(uno);
listaVeiculos.add(Bis);			

				// Testando Concessionária
Concessionaria AutoCampos = new Concessionaria("AutoCampos", "Gama-DF", "68667507687", "61 99987-2057",listaVeiculos);
System.out.println(AutoCampos);

				// Testando Venda e método negociação
//Venda venda = new Venda(joao, "débito", sandero);
//System.out.println(venda);
		//	venda.negociacao();
				// Rodando array de veiculos cadastrados
System.out.println(listaVeiculos);


}

	}


