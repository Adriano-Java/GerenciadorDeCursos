package br.com.curso.gerenciador.teste;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import br.com.curso.gerenciador.classes.Aluno;
import br.com.curso.gerenciador.classes.Aula;
import br.com.curso.gerenciador.classes.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Collections", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Adriano Neto da Silva", 34567);
		Aluno a2 = new Aluno("Thiago Bernadinho", 34568);
		Aluno a3 = new Aluno("Claudinei Borges Rabelo", 34666);
		Aluno a4 = new Aluno("Guelri Ramon", 34111);
		Aluno a5 = new Aluno("Bruno Nascimento", 34569);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		
		System.out.println("Todos os alunos matriculados:");
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno a6 = new Aluno("Ludmila Rabelo de Oliveira", 27983);
		javaColecoes.matricula(a6);
		
		Aluno a7 = new Aluno("Ludmila Rabelo de Oliveira", 49123);
		Aluno a8 = new Aluno("Adriano Neto da Silva", 68443);
		
		javaColecoes.matricula(a7);
		javaColecoes.matricula(a8);
		
		System.out.println("Todos os alunos matriculados:");
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		//realizando uma busca por objeto usando equals em Set.
		Aluno Rabelo = new Aluno("Claudinei Borges Rabelo", 34666);
			System.out.println("O aluno Rabelo está matriculado?" );
			System.out.println(javaColecoes.estaMatriculado(Rabelo));
			System.out.println("O aluno a2 é equals ao Rabelo?");
			System.out.println(a2.equals(Rabelo));
			System.out.println("O aluno a3 é equals ao Rabelo?");
			System.out.println(a3.equals(Rabelo));
			
			//obrigatoriamente o seguinte é true:
			
			System.out.println(a3.hashCode() == Rabelo.hashCode());
			
		//forma arcaica de realizar um for em Set.	
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
			while (iterador.hasNext()) {
				Aluno proximo = iterador.next();
					System.out.println(proximo);
			}
			
		/*
		for (Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		*/	
		
	}

}
