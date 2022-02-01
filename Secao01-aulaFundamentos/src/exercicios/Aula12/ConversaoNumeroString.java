package exercicios.Aula12;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 1000;
		// toString transformar o numero inteiro em String e partir dessa conversão, pode fazer funções de string, ex: length
		System.out.println(num1.toString().length());
		
		// Nesse caso usando o direto o tipo ja pode fazer a conversão
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		

	}

}
