package br.com.fsta;

import java.util.Scanner;

public class QuantasPessoasNaFesta {

	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);

		int numPessoas, soma, opcao12 = 0;
		String nome;

		System.out.println("Olá, tudo bem? Qual o seu Nome:");
		nome = entradaUsuario.next();

		System.out.println("\nOk " + nome + " você estava na festa?");
		System.out.println("\n1 - SIM\n2 - NÃO");
		opcao12 = entradaUsuario.nextInt();

		if (opcao12 == 1) {
			System.out.println("\nQuantas pessoas você viu por lá?");
			numPessoas = entradaUsuario.nextInt();
			numPessoas = numPessoas + 1;
			System.out.println("\nEntão, " + nome + ", na festa haviam " + numPessoas);
		}

		if (opcao12 == 2) {
			System.out.println(
					"\nEntão se você não foi, " + nome + ", não há como você saber quantas pessoas estavam na festa.");
		}

		else if (opcao12 != 1 && opcao12 != 2) {
			System.out.println("\nOPÇÃO INVALIDA!");
		}
	}
}
