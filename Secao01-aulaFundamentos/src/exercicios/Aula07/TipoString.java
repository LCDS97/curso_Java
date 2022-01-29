package exercicios.Aula07;

public class TipoString {
	public static void main(String [] args) {
		System.out.println("Ola pessoal".charAt(4)); // charAt pega o valor do index desejado em rela��o a String selecionada
		
		String s = "Boa tarde"; // String � um valor imutavel, ou seja, voce consegue modificar o valor de s mas n�o consegue modificar o valor original
		s = s.toUpperCase(); // Nesse caso voce esta substituindo o valor de s, pelo m�todo UpperCase e definindo um novo valor, n�o modificando ele
		
		System.out.println(s.concat("!!!")); // Concatenando valor
		System.out.println(s + "???"); // Concatenando outro valor utilizando operador
		// Lembre aqui esta acrescentando o valor 
		
		System.out.println(s.startsWith("Boa")); // Verificando se a string come�a com determinado valor
		System.out.println(s.toLowerCase().startsWith("boa")); // Transformando para lower case e aplicando o valor a ser verificado
		System.out.println(s.toUpperCase().endsWith("TARDE")); // Transformando para upper case e aplicando o valor a ser verificado
		System.out.println(s.length()); // Verificando o tamanho da string
		System.out.println(s.equals("boa tarde")); // Comparando valor com a fun��o equals
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Utilizando fun��o de ignorar os case e comparar o valor
		
		// Exemplo de duas formas de printas valores
		var nome = "Lucas";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// Utilizando print ln
		System.out.println("Nome: " + nome + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		System.out.println("\n");
		
		// Atribuindo a uma variavel e printando seu valor
		String fraseDeEx = "Nome Inteiro: " + nome + " " + sobrenome + "\nQuantos anos?: " + idade + "\nDindim: " + salario;
		System.out.println(fraseDeEx);
		System.out.println("\n");
		
		
		// Utilizando print f
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		// Valores com porcetagem (%) ir�o ser substitu�dos pela variaveis ap�s a virgula
		// %s = string, %d = valores inteiros, %f = Valores doubles
		// Para representar algumas casas decimais podemos personalizar o %f, informando as casas decimais que deseja que apare�a
		// %.2f = Somente duas casas decimais+
		
		// Atribuindo a uma variavel e printando esse valor com a fun��o String.format
		System.out.println("\n");
		String frase = String.format("O %s %s recebe o sal�rio de R$%.2f. e ele s� tem %d anos", nome, sobrenome, salario, idade);
		System.out.println(frase);
		
		
		
	}
}
