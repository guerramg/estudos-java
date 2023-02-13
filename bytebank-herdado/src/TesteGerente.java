
public class TesteGerente {

	public static void main(String[] args) {

	Gerente g1 = new Gerente();
	g1.setNome("Guerra");
	g1.setCpf("1231513-00");
	g1.setSalario(3800);
	
	
	System.out.println(g1.getNome());
	System.out.println(g1.getSalario());
	System.out.println(g1.getBonificacao());
	
	g1.setSenha(2400);
	boolean autenticou = g1.autentica(2400);
	
	System.out.println(autenticou);

	}

}
