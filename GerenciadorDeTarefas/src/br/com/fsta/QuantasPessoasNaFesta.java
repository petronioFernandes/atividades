package br.com.fsta;

import java.util.Scanner;

public class QuantasPessoasNaFesta {

	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);

		int numPessoas, soma, opcao12 = 0;
		String nome;

		System.out.println("Ol�, tudo bem? Qual o seu Nome:");
		nome = entradaUsuario.next();

		System.out.println("\nOk " + nome + " voc� estava na festa?");
		System.out.println("\n1 - SIM\n2 - N�O");
		opcao12 = entradaUsuario.nextInt();

		if (opcao12 == 1) {
			System.out.println("\nQuantas pessoas voc� viu por l�?");
			numPessoas = entradaUsuario.nextInt();
			numPessoas = numPessoas + 1;
			System.out.println("\nEnt�o, " + nome + ", na festa haviam " + numPessoas);
		}

		if (opcao12 == 2) {
			System.out.println(
					"\nEnt�o se voc� n�o foi, " + nome + ", n�o h� como voc� saber quantas pessoas estavam na festa.");
		}

		else if (opcao12 != 1 && opcao12 != 2) {
			System.out.println("\nOP��O INVALIDA!");
		}
	}
}
