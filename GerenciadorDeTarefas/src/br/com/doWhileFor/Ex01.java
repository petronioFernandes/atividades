/*PROGRAMA COLHE NOTA DO ALUNO
 *CASO O VALOR DIGITADO SEJA MAIOR QUE 10 EXIBE MSG DE ERRO E RETORNA PEDINDO PRA DIGITAR UM VALOR ENTRE 0 E 10
 *DIGITANDO VALOR CORRETO O PROGRAM DIZ SE O ALUNO FOI APROVADO OU REPROVADO E PERGUNTA SE QUER CONTINUAR A DIGITAR AS NOTAS
 *COM OPÇÃO PARA FINALIZAR O PROGRAMA*/

package br.com.doWhileFor;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		double nota = 0;
		int opcao12 = 1;

		Scanner entradaUsuario = new Scanner(System.in);

		while (opcao12 == 1) {

			System.out.println("\nEntre com uma nota: ");
			nota = entradaUsuario.nextDouble();

			while (nota > 10) {
				System.out.println("\nNOTA INVALIDA, somente são aceitos valores entre 0 E 10!");
				System.out.println("\nDigite a nota do aluno:");
				nota = entradaUsuario.nextDouble();
			}
			if (nota >= 7) {
				System.out.println("\nAluno aprovado!");

			} else {
				System.out.println("\nAluno reprovado!");
			}
			System.out.println("\nDeseja continuar?");
			System.out.println("1 - SIM\n2 - NÃO");
			opcao12 = entradaUsuario.nextInt();
		}
		System.out.println("\nPrograma finalizado!");
	}
}