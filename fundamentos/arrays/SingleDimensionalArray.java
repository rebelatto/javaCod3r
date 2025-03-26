package fundamentos.arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
	
		/**
		 * Declarin an array
		 * int [] marks;
		 * marks = new int[5];
		 * 
		 * or 
		 * 
		 * int[] marks = new int [5]; 
		 * 
		 * Initializing an array
		 * 
		 * int[] marks = new int [5] {10, 20, 30, 40, 50}
		 * 
		 * Declare and Assign
		 
		 * 
		 * this form is more cust
		 */

		 int [] marks = new int [5];
		 marks[0] = 100;
		 marks[1] = 60;
		 marks[2]  = 78;
		 marks [3] = 43;
		 marks [4] = 80;

		 for (int i = 0; i < marks.length; i ++){
			 
			 System.out.println(marks[i] + " ");
		 }
		 System.out.println("-----------------------------");
		 for (int value : marks){
			System.out.println(value + " ");
		 }
	}

}
