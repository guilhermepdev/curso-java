package aulas;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
	 	Scanner sc = new Scanner(System.in);
	 	
	 	System.out.println("Digite um número inteiro: ");
	 	int primeiroNumero = sc.nextInt();
	 	
	 	System.out.println("Digite o segundo número inteiro: ");
	 	int segundoNumero = sc.nextInt();
	 	
	 	int multiplicacao = primeiroNumero * segundoNumero;
	 	System.out.println("O resultado da multiplicação é: " + multiplicacao);
	 	
	    sc.close();

	}

}
