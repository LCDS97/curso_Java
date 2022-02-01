package desafio.Conversao;

import java.util.Scanner;

public class ConversaoMediaSalarial {
	
// a partir do Scanner, vai pegar 3 strings usando NextLine
	// eles vao receber 3 salarios e calcular a media do funcionario
		// ele pode separar as casas decimais com virgula ou ponto
			// somar os 3 salarios e dar a media, esse eh desafio
	public static void main(String[] args) {
		// Definindo input de usuário
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salario: R$");
		String salario = entrada.nextLine();
		salario = salario.replace(",", ".");
		
		System.out.print("Digite sua maior venda: R$");
		String comissao = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu total de valor de vendas em R$: R$");
		String vendas = entrada.nextLine().replace(",", ".");
		
		double salarioDouble = Double.parseDouble(salario);
		double comissaoDouble = Double.parseDouble(comissao);
		double vendasDouble = Double.parseDouble(vendas);
		
		double bonus = (salarioDouble + comissaoDouble + vendasDouble) / 3;
		System.out.printf("Seu bonus é de R$%.2f", bonus);
		
		
		entrada.close();
		// Consegui concluir desafio
			// Unica diferença é que no caso eu coloquei a conversão da variavel com o replace sendo que ja poderia declarar na própria linha da função nextLine()
	}
	
}
