package exercicios.Aula02;

public class VarAndConst {

	// Variaveis s� definir o tipo, nome da variavel e valor
	// Constante definir do mesmo tipo mas no come�o utilizar o "final" para tornar o valor constante
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("�rea = " + area + "m2.");
		
		raio = 15;
		area = PI * raio * raio;
		System.out.println("�rea = " + area + "m2.");

	}

}
