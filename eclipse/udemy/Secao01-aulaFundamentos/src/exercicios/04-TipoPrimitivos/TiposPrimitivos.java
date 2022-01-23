package exercicios.TipoPrimitivos;

public class TiposPrimitivos {
	
	public static void main(String [] args) {
		// Informações do funcionário para testar os tipos primitivos
		
		// Tipos Númericos Inteiros
		byte anosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Para declarar que é uma variavel Long é necessário identificar no final do número com a letra "L"
		
		// Tipos Númericos reais
		float salario = 11_445.44F; // Para declarar que é uma variavel Float é necessário identificar no final do número com a letra "F"
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // Ou True para valores booleanos
		
		//Tipo Caractere
		char status = 'A'; // Char somente aceita um unico caractere
		
		// Dias de empresa
		System.out.println("Quantos dias de empresa: " + anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println("Quantos voos fez pela empresa? " + NumeroDeVoos / 2);
		
		// Pontos por real
		System.out.println("Quantos pontos de milhas acumuladas pela vendas? " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O funcionário do id: " + id + ", ganha de salário no momento -> " + salario);
		System.out.println("Esta de férias? " + estaDeFerias);
		System.out.println("Status nessa semana: " + status);
		
	}

}
