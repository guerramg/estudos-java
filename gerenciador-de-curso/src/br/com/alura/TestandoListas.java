package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";
	
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(1);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
			
		}
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
			});
		
		aulas.add("Aumentando nosso conhecimento");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
				
	}

}
