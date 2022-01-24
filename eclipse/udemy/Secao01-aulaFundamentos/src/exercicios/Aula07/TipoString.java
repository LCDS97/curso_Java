package exercicios.Aula07;

public class TipoString {
	public static void main(String [] args) {
		System.out.println("Ola pessoal".charAt(4)); // charAt pega o valor do index desejado em relação a String selecionada
		
		String s = "Boa tarde"; // String é um valor imutavel, ou seja, voce consegue modificar o valor de s mas não consegue modificar o valor original
		s = s.toUpperCase(); // Nesse caso voce esta substituindo o valor de s, pelo método UpperCase e definindo um novo valor, não modificando ele
		System.out.println(s.concat("!!!"));
		System.out.println(s + "???");
	}
}
