package exercicios.Aula05;

public class NotacaoPonto {
	
	// Notação Ponto é comportamento e atributos de métodos que você pode aplicar no Java
	
	public static void main (String[] args) {
		double a = 2.3;
		String s = "Eh nada"; // Para declarar string é necessário declarar em String

		
		s = s.replace("nada", "sim"); // Método de replace de string
		s = s.toUpperCase(); // Atribuição de variavel para executar o método do UpperCase
		s = s.concat("!!!"); // Método para concatenação de strings
		
		System.out.println(s);
		
		String y = "Eh nada".replace("NADA", "nada");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador ".", a unica coisa que armazena é seu próprio valor
		
	}
}
