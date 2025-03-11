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
	}
}
