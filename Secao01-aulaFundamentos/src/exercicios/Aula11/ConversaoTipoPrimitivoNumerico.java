package exercicios.Aula11;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// Impl�cita
		// Java auto-converte para double para o valor 1.0
		double a = 1;
		System.out.println(a);
		
		// Convers�o explicita para transformar o Java transformar o Float
		// Expl�cita (CAST)
		float b = (float) 1.1223;
		System.out.println(b);
		
		// Quando voc� faz convers�o explicita voce esta ciente que pode haver perda de valores
		
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		

	}

}
