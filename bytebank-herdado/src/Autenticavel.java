//o que é interfaces no java

//contrato Autenticavel
// quem assina esse contrato, precisa implementar
//metodo setSenha e autentica

public abstract interface Autenticavel {
	
	
	public abstract void setSenha(int senha);

	
	public abstract boolean autentica(int senha);

}
