package br.com.curso.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.curso.gerenciador.classes.Aula;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Português", 30);
		Aula a2 = new Aula("Matemática", 35);
		Aula a3 = new Aula("Geografia", 25);
		Aula a4 = new Aula("História", 25);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
	
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula:: getTempo));
		
		System.out.println(aulas);
		//forma mais simples de usar Collections.
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
