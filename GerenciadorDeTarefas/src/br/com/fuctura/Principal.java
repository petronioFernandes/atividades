package br.com.fuctura;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
			//Entrada do Usu�rio
		Scanner entradaDoUsuario = new Scanner(System.in);
		
			//Usar camelCase para nomes de vari�vel (aux na leitura) ex:
		int numeroDeTarefas = 10;
		String tipoDeTarefa;
		double duracaoDaTarefa = 1.5;
		String nome;
		
		System.out.println("Digite a quantidade de tarefas: ");
		
			//Recebendo o valor digitado
		numeroDeTarefas = entradaDoUsuario.nextInt();
		
		System.out.println("O novo numero de tarefas �: " + numeroDeTarefas);
		System.out.println(" e a dura��o da tarefa � " + duracaoDaTarefa + "minutos.");
		
			// Boolean = true ou false
		boolean desejaEnviarParaNuvem;
		System.out.println("Deseja enviar a nova quantidade para nuvem? ");
		desejaEnviarParaNuvem = entradaDoUsuario.nextBoolean();
		System.out.println("Usu�rio digitou: " + desejaEnviarParaNuvem);
		
			//String
		System.out.println("Digite o seu nome: ");
		
		nome = entradaDoUsuario.next();
		System.out.println("De acordo com voc� mesmo seu nome �: " + nome);
		
		
		
	}

}
