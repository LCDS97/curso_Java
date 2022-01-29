package exercicios.Aula08;

import java.util.Scanner;

public class Console {
	public static void main(String [] args) {
		// Aqui estou definindo para valores para aparecer no console
		System.out.print("Bom Dia");
		System.out.print(" dia!!");
		
		
		System.out.print("\n");
		
		// Caso necessita que tenha quebra de linha, utilizamos o adicional do ln depois do print
		System.out.println("Boa");
		System.out.println("Tarde!");
		
		// Aqui utilizamos o recurso format chamando pelo atalho com o adicional do f no final do print
		System.out.printf("Megasena números: %d %d %d %d %d %d %d %d %n", 12, 7,88, 99, 73, 66, 34, 65);
		// Para cada valor de porcetagem, ele substitui pelo variavel, ou valores definido após a virgula
		// Voce define o tipo com as seguintes atalhos
		// %s = string, %d = valores inteiros, %f = Valores doubles, %n = Quebra de linha
		
		// Exemplo de definição de casa decimais:
		System.out.printf("Salário: R$%.1f%n", 1234.5678);
		
		// Definindo input de usuário
		Scanner entrada = new Scanner(System.in);
		
		// OBS: Out = Output de um sistema para o usuário / In = Entrada de usuário para o sistema receber
		

		// Exemplo utilizando o input do usuário
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o que você achou desse código: ");
		String digitado = entrada.nextLine();
		
		System.out.print("Digite sua avaliação de 0 a 10: ");
		int idade = entrada.nextInt();
		

		
		System.out.printf("%s  digitou a sua avaliação sobre o código: %nSua observação: %s %nDeu a seguinte avaliação sobre o código: %d",
				nome, digitado, idade);
		
		// Fechando o scanner para finalizar o input do usuário para economizar recursos/memórias do sistema
		entrada.close();
		
		
	}
}
