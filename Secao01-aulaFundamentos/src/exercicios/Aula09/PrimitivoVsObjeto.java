package exercicios.Aula09;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		String s = new String("texto");
		s.toUpperCase();
		
		// Pequeno módulo do curso explicando diferenças entre Valores Primitivos e Objetos
		
		// Wrapers são a versão objeto dos tipos primitivos;
		int a = 123;
		System.out.println(a);
	}

}
