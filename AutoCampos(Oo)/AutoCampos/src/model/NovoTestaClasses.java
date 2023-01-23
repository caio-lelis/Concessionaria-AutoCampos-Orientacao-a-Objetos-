package model;

import java.util.ArrayList;

public class NovoTestaClasses {

	public static void main(String[] args) {
		
		ArrayList <Veiculo> listaVeiculos2 = new ArrayList <Veiculo> ();
		
		//Testando Construtor comprador
		Comprador a = new Comprador(25000,"Caio" ,"14280194645");
		System.out.println(a);

	
	
	
		//Testando COnstrutor Veiculo e arraylist
		
		Veiculo corsa = new Carro("Chevrolet","Corsa", "Preto", 2010, 15000, 2);
		
		Veiculo moto1 = new Moto("Honda","CBR", "Azul", 2017 , 23000, 850);
		
		listaVeiculos2.add(moto1);
	
		listaVeiculos2.add(corsa);
		
		
		//System.out.println(listaVeiculos2);
		
	
		//Testando Construtor de Concessionárias e vendo se ele executa o array de Veiculos que compõem a concessionária
		
		
		Concessionaria AutoCampos = new Concessionaria("AutoCampos", "Gama-DF","155.025.459-85", "(61) 99516-2518", listaVeiculos2);
		System.out.println(AutoCampos);
	
	
	
	
	}

}
