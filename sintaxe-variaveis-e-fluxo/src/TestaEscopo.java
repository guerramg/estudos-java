
public class TestaEscopo {

	public static void main(String[] args) {

		int idade = 20;
		int quantidadePessoas = 1;
		boolean acompanhado = true;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo, você esta acompanhado" );
		}
	}
}
