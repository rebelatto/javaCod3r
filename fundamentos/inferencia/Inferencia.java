package fundamentos.inferencia;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		var b = 4.5;
		System.out.println(b);
		var c = "my string";
		/**
		 * c = a + b -> devido a inferência isso gera erro 
		 * -> Type mismatch: cannot convert from double to String 
		 * a variavel c por inferencia é do tipo string, não é possivel 
		 * fazer operações que não seja de string, mesmo com essa "facilidade"
		 *  java não deixa de ser fortmente tipado.
		 */ 
		System.out.println(c);

		double d; 
		d = 123.65;
		System.out.println(d);


		/**
		 * Inferencia dessa forma não funciona, pois, usando o var sem iniciar a variavel
		 * e = 123.45; //declarou a variavel em uma linha
		 * var e;  // inicializou em outra não é possivel som a inferencia de tipos
		 *        //sendo necessario inicializar tudo na declaração
		 * System.out.println(e);
		 *  */
		
		 var e = 123.45;
		 System.out.println(e);


	}
}
