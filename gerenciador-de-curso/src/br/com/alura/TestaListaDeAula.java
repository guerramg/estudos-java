package br.com.alura;

import java.util.ArrayList;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayList", 21);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamento", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
	
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		
	}

}
