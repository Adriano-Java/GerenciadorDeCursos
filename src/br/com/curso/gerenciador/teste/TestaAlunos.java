package br.com.curso.gerenciador.teste;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunosAntigos = new HashSet<>();//Use Set para trabalhar exclusivamente com conjuntos.
		
		Collection<String> alunos = new HashSet<>();//Use a classe mãe para trabalhar de forma mais genérica.

		alunos.add("Geulri Ramon");
		alunos.add("Silvia Conson");
		alunos.add("Wendel Abromovizt");
		alunos.add("Ludmila Rabelo de Oliveira");
		alunos.add("Lucas Monteiro");
		alunos.add("Thiago Bernadinho");
		
		alunosAntigos.add("Leandro Marinho");
		alunosAntigos.add("Paulo Sérgio Dutra");
		alunosAntigos.add("Waldery Nascimento");
		alunosAntigos.add("Bruno Nascimento");
		
		alunosAntigos.forEach(aluno -> System.out.println(aluno));
		
		//em Set não há o "get". Use o boolean para rastrear um elemento do conjunto.
		boolean alunoMatriculado = alunos.contains("Claudinei Borges Rabelo");
		System.out.println(alunoMatriculado);

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		alunos.remove("Lucas Monteiro");
			System.out.println(alunos.size());
			System.out.println(alunos);
	}

}
