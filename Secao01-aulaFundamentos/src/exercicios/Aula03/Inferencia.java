package exercicios.Aula03;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		
		// Vai inferir o tipo pelo valor que coloquei, n�o precisei declarar o tipo dele, pois o Java identificou pelo valor o tipo dele
		var b = 4.5;
		System.out.println(b);
		
		var c ="Texto";
		System.out.println(c);
		
		// No Java n�o consegue alterar o tipo de variavel ap�s a mesma ser declarada, tanto se voce n�o declarar como o Java descobrindo mesmo
	}
}
