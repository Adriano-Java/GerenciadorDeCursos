package br.com.curso.gerenciador.teste;

import br.com.curso.gerenciador.classes.Aluno;
import br.com.curso.gerenciador.classes.Aula;
import br.com.curso.gerenciador.classes.Curso;

public class BuscaAlunosNoCurso {
	
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
		Aluno a6 = new Aluno("Ludmila Rabelo de Oliveira", 27983);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		javaColecoes.matricula(a6);
		
		System.out.println("Bucar aluno cuja matricula seja 34567:");
		Aluno aluno = javaColecoes.buscaMatriculado(34567);
		System.out.println("Aluno: " + aluno);
	}

}
