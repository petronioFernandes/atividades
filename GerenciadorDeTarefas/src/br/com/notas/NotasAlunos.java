package br.com.notas;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {

		Scanner entradaUsuario = new Scanner(System.in);

		double notaAluno;
		int saida = 1;

		while (saida == 1) {
			System.out.println("Digite a nota do aluno:");
			notaAluno = entradaUsuario.nextDouble();
			if (notaAluno >= 7) {
				System.out.println("\nALUNO APROVADO!!");

			} else {
				System.out.println("\nALUNO REPROVADO!");
			}
			System.out.println("Deseja continuar?");
			System.out.println("1 - SIM\n2 - NÃO");
			saida = entradaUsuario.nextInt();
		}
	}
}
