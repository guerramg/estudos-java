package bytebank;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.saldo = 300;
		
		System.out.println(conta.saldo);
		
		conta.deposita(150);
		
		System.out.println(conta.saldo);
		
		boolean retorno = conta.saca(1500);
		
		if(retorno == true) {
			System.out.println("Seu saque foi feito com sucesso!");
			System.out.println("Seu saldo atual é: " + conta.saldo);
		}else {
			System.out.println("Seu saldo é insuficiente!");
			System.out.println("Seu saldo atual é: " + conta.saldo);
		}
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		System.out.println(contaMarcela.saldo);
		
		conta.transfere(150, contaMarcela);
	
		System.out.println("Saldo conta principal" + conta.saldo);
		System.out.println("Saldo conta marcela" + contaMarcela.saldo);

	}

}
