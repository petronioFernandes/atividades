package br.com.doWhileFor;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		int z = 0, opcao12 = 1;

		while (opcao12 == 1) {

			System.out.println("Digite um numero para o contador:");
			z = entradaUsuario.nextInt();

			for (int i = 0; i <= z; i++) {

				System.out.println(i);
			}
			System.out.println("DESEJA CONTINUAR?");
			System.out.println("1 - SIM\n2 - NÃO");
			opcao12 = entradaUsuario.nextInt();
		}
		System.out.println("\nPrograma finalizado.");
	}
}
