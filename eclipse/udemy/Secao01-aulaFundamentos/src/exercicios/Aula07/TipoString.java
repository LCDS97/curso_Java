package exercicios.Aula07;

public class TipoString {
	public static void main(String [] args) {
		System.out.println("Ola pessoal".charAt(4)); // charAt pega o valor do index desejado em rela��o a String selecionada
		
		String s = "Boa tarde"; // String � um valor imutavel, ou seja, voce consegue modificar o valor de s mas n�o consegue modificar o valor original
		s = s.toUpperCase(); // Nesse caso voce esta substituindo o valor de s, pelo m�todo UpperCase e definindo um novo valor, n�o modificando ele
		System.out.println(s.concat("!!!"));
		System.out.println(s + "???");
	}
}
