package exercicios.Aula13;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// JOptionPane serve para mostrar uma tela de input para o usuario
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		
		// Valor string sendo convertido para o Double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.printf("Soma eh %.2f %n", soma);
		System.out.printf("Media e %.2f", soma / 2);
		
		

	}

}
