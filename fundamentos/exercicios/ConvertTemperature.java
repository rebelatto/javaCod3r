package fundamentos.exercicios;
import java.util.Scanner;

public class ConvertTemperature {
	public static void main(String[] args) {
		// (Fahrenheit - 32) * 5/9 = Celsious
		double f, c;
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Digite o valor em graus Fahrenheit: " );
		f = input.nextDouble();
		input.close();
		c = (f - AJUSTE) * (FATOR);

		System.out.println("Fahrenheit: "+  f + " é Celsius: " + c);
	}

}
