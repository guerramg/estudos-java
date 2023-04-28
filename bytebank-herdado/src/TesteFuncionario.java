
public class TesteFuncionario {

	public static void main(String[] args) {

//		Funcionario nico = new Funcionario(); CLASSE ABSTRATA
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("01221251-00");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
