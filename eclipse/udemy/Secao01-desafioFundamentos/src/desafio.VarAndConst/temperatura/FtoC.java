package temperatura;

public class FtoC {

	public static void main(String[] args) {
		// BASE (F� - 32) x 5/9 = �C
		// Armazenar o 32 e o 5/9 em constantes
		// F e o C em variaveis

		final double AJUSTE = 32;
		final double DIVISAO = 5.0/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * DIVISAO;
		
		System.out.println("A convers�o de Fahrenheit = " + fahrenheit + " para Celsius = " + celsius + "�C");
		

	}

}
