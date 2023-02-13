
public class TesteReferencias {

	public static void main(String[] args) {

		//Funcionario g1 = new Gerente(); //variavel genérica funcionario
		Gerente g1 = new Gerente();
		
		g1.setNome("Guerra");
		g1.setSalario(5000);
		String nome = g1.getNome();
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(3800);
		
		Polimorfismo controle = new Polimorfismo();
		
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(nome);
		System.out.println(controle.getSoma());

	}

}
