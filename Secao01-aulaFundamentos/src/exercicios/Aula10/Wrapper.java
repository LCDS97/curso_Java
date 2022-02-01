package exercicios.Aula10;


public class Wrapper {

	public static void main(String[] args) {
		// Wrapper = Envolve, Embrulha, Pacota

		// Wraper de byte
		Byte b = 100;
		Short s = 1000;
		
		// Wrapper de Integer
		// Integer = int // Convertendo valor string em inteiro com o parseInt
		Integer i = Integer.parseInt("25");
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 5);
		System.out.println(l / 3);
		
		Float f = 123.20F;
		System.out.println(f);
		
		Double d = 123.4567;
		System.out.println(d);
		
		
		// Wrapper de Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		// Wrapper de Character
		Character c = '#';
		System.out.println(c + "...");
		
		// Existem uma versão orientado a objeto para cada tipo primitivo 
		// Todas são iguais mas utiliza letra Maiuscula para declarar ele, tirando o int que é Integer

	}

}
