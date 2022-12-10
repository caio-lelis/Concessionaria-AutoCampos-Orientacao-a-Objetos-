package projeto_oo;

public class Cliente extends Pessoa {
	
	private boolean deficiente;

	public Cliente(String nome, String cpf, String endereco , boolean deficiente) {
		super(nome, cpf, endereco);
	}

	public boolean Deficiente() {
		return deficiente;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}
	
	public void getDeficiente (boolean deficiente) {
		this.deficiente = deficiente;
	}

}
