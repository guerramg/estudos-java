
public class Gerente extends Funcionario implements Autenticavel {


	private AutenticacaoUtil autenticador;
	
	public Gerente() { //Construtor
		
		this.autenticador = new AutenticacaoUtil();
		
	}
	
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	

	
}
