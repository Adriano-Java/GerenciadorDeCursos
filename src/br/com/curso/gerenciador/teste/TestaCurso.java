package br.com.curso.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.curso.gerenciador.classes.Aula;
import br.com.curso.gerenciador.classes.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javacole��es = new Curso("Dominando as Collections", "Paulo Silveira");
		List<Aula> aulasImutaveis = javacole��es.getAulas();
		System.out.println(aulasImutaveis);
		
		javacole��es.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javacole��es.adiciona(new Aula("Criando uma Aula", 20));
		javacole��es.adiciona(new Aula("Modelando com cole��es", 24));
		
		System.out.println(javacole��es.getAulas());
		
		//a pr�pria ArrayList tem um "for" embutido. Logo, apenas passe a List como par�metro.
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javacole��es.getTempoTotal());
	}

}
