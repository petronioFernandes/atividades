package br.com.aula04;

import java.util.Scanner;

public class UtilizandoArray {
	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		
	//Declarando array já com a variavel
		int quantVetor = 5;
		String [] nomesAlunos = new String[quantVetor];
		double [] notasAlunos = new double[quantVetor];
		int [] idadesAlunos = new int[quantVetor];
		
			for(int contador = 0; contador <quantVetor; contador++) {
		
		System.out.println("\nDigite o nome do aluno " + contador + " :");
		nomesAlunos[contador] = entradaUsuario.next();
		
		System.out.println("\nDigite a nota de " + nomesAlunos[contador] + " :");
		notasAlunos[contador]= entradaUsuario.nextDouble();
		
		System.out.println("\nDigite a idade de " + nomesAlunos[contador] + " :");
		idadesAlunos[contador] = entradaUsuario.nextInt();
		
		}
			for(int contador = 0;contador <quantVetor; contador++) {
				
				System.out.println("\n\nNome do aluno: " + nomesAlunos[contador]);
				System.out.println("\nA nota de " + nomesAlunos[contador] + " foi: " + notasAlunos[contador]);
				System.out.println("\nA idade de " + nomesAlunos[contador] + " é: " + idadesAlunos[contador]);
			}
			
			System.out.println("\n\nPrograma finalizado!");
	}
}
