package exercicios.Aula15;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // Operador AND
		System.out.println(condicao1 || condicao2); // Operador OR
		System.out.println(condicao1 ^  condicao2); // Operador Exclusivamente OR
		System.out.println(!condicao1); // Negação lógica
		System.out.println(!condicao2);
		
		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); // Dead code é quando a primeira condição nunca chega na outra
		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU Exclusivo (XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
	}

}
