package br.com.modelo;

import java.util.Scanner;

public class Tarefa {
	
	public static void main(String[]args) {
		
		Scanner entradaUsuario = new Scanner (System.in);
		
		int numeroDePessoas = 0, soma;
		String sobrenome;
		boolean estavaNaFesta;
		
		System.out.println("Digite o seu sobrenome:");
		sobrenome = entradaUsuario.next();
		
		System.out.println("\nOl� " + sobrenome + ", voc� estava na festa?");
		estavaNaFesta = entradaUsuario.nextBoolean();
		
		System.out.println("\nQuantas pessoas voc� viu na festa?");
		
		numeroDePessoas = entradaUsuario.nextInt();
			//Essa soma n�o est� funcionando.
		soma = numeroDePessoas++;
		
		System.out.println(sobrenome + ", ent�o a festa tinha " + soma);
	}
	
}