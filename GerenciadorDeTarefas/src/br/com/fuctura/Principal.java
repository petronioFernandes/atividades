package br.com.fuctura;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
			//Entrada do Usuário
		Scanner entradaDoUsuario = new Scanner(System.in);
		
			//Usar camelCase para nomes de variável (aux na leitura) ex:
		int numeroDeTarefas = 10;
		String tipoDeTarefa;
		double duracaoDaTarefa = 1.5;
		String nome;
		
		System.out.println("Digite a quantidade de tarefas: ");
		
			//Recebendo o valor digitado
		numeroDeTarefas = entradaDoUsuario.nextInt();
		
		System.out.println("O novo numero de tarefas é: " + numeroDeTarefas);
		System.out.println(" e a duração da tarefa é " + duracaoDaTarefa + "minutos.");
		
			// Boolean = true ou false
		boolean desejaEnviarParaNuvem;
		System.out.println("Deseja enviar a nova quantidade para nuvem? ");
		desejaEnviarParaNuvem = entradaDoUsuario.nextBoolean();
		System.out.println("Usuário digitou: " + desejaEnviarParaNuvem);
		
			//String
		System.out.println("Digite o seu nome: ");
		
		nome = entradaDoUsuario.next();
		System.out.println("De acordo com você mesmo seu nome é: " + nome);
		
		
		
	}

}
