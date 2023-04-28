package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		
		aulas.add(new Aula("Trabalhando array list", 21));

		System.out.println(aulas);
	}

}
