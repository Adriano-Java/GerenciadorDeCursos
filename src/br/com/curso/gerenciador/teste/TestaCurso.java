package br.com.curso.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.curso.gerenciador.classes.Aula;
import br.com.curso.gerenciador.classes.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javacoleções = new Curso("Dominando as Collections", "Paulo Silveira");
		List<Aula> aulasImutaveis = javacoleções.getAulas();
		System.out.println(aulasImutaveis);
		
		javacoleções.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javacoleções.adiciona(new Aula("Criando uma Aula", 20));
		javacoleções.adiciona(new Aula("Modelando com coleções", 24));
		
		System.out.println(javacoleções.getAulas());
		
		//a própria ArrayList tem um "for" embutido. Logo, apenas passe a List como parâmetro.
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javacoleções.getTempoTotal());
	}

}
