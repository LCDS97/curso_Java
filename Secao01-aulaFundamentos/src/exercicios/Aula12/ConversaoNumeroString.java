package exercicios.Aula12;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 1000;
		// toString transformar o numero inteiro em String e partir dessa convers�o, pode fazer fun��es de string, ex: length
		System.out.println(num1.toString().length());
		
		// Nesse caso usando o direto o tipo ja pode fazer a convers�o
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		

	}

}
