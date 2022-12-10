package projeto_oo;

public class TestaClasses {

	public static void main(String[] args) {
		
		Pessoa caio = new Cliente( " Caio" , " 111.124.222-45" , "Rua do Java", false); 
		
		Concessionaria a = new Concessionaria("abc", "acb", "121-2", "(61) 91111-1111");
		Pessoa d = new Vendedor(" "," "," ", true);
		d.setNome("abv");
		
		System.out.println(d.getNome());
		System.out.println(caio.getNome());
		
	}
	
	
}
