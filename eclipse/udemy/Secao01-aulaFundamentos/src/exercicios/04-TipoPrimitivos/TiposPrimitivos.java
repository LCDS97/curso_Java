package exercicios.TipoPrimitivos;

public class TiposPrimitivos {
	
	public static void main(String [] args) {
		// Informa��es do funcion�rio para testar os tipos primitivos
		
		// Tipos N�mericos Inteiros
		byte anosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Para declarar que � uma variavel Long � necess�rio identificar no final do n�mero com a letra "L"
		
		// Tipos N�mericos reais
		float salario = 11_445.44F; // Para declarar que � uma variavel Float � necess�rio identificar no final do n�mero com a letra "F"
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // Ou True para valores booleanos
		
		//Tipo Caractere
		char status = 'A'; // Char somente aceita um unico caractere
		
		// Dias de empresa
		System.out.println("Quantos dias de empresa: " + anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println("Quantos voos fez pela empresa? " + NumeroDeVoos / 2);
		
		// Pontos por real
		System.out.println("Quantos pontos de milhas acumuladas pela vendas? " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O funcion�rio do id: " + id + ", ganha de sal�rio no momento -> " + salario);
		System.out.println("Esta de f�rias? " + estaDeFerias);
		System.out.println("Status nessa semana: " + status);
		
	}

}
