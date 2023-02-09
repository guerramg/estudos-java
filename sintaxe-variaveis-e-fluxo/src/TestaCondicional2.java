
public class TestaCondicional2 {

	public static void main(String[] args) {

		int idade = 20;
		int quantidadePessoas = 1;
		boolean acompanhado = true;

		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Menor de idade, você nao pode entrar");
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo, você esta acompanhado");
		}
	}
}
