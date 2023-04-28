
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador a = new Administrador();
		a.setSenha(222);
		
		Autenticavel c = new Cliente(); //Poliformismo (Genérico)
		c.setSenha(258);
		
		SistemaInterno s = new SistemaInterno();
		
		s.autentica(a);
		

	}

}
