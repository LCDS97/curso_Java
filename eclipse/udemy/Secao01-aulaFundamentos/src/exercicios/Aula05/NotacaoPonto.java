package exercicios.Aula05;

public class NotacaoPonto {
	
	// Nota��o Ponto � comportamento e atributos de m�todos que voc� pode aplicar no Java
	
	public static void main (String[] args) {
		double a = 2.3;
		String s = "Eh nada"; // Para declarar string � necess�rio declarar em String

		
		s = s.replace("nada", "sim"); // M�todo de replace de string
		s = s.toUpperCase(); // Atribui��o de variavel para executar o m�todo do UpperCase
		s = s.concat("!!!"); // M�todo para concatena��o de strings
		
		System.out.println(s);
		
		String y = "Eh nada".replace("NADA", "nada");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador ".", a unica coisa que armazena � seu pr�prio valor
		
	}
}
