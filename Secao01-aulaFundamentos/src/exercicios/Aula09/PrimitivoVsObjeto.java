package exercicios.Aula09;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		String s = new String("texto");
		s.toUpperCase();
		
		// Pequeno m�dulo do curso explicando diferen�as entre Valores Primitivos e Objetos
		
		// Wrapers s�o a vers�o objeto dos tipos primitivos;
		int a = 123;
		System.out.println(a);
	}

}
