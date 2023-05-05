package hr.epam.test;


import java.util.Arrays;

public class SumPair {

	public static void main(String[] args) {

		int[] brojevi = { 2, 7, 11, 15 };
		int suma = 22;

		System.out.println(Arrays.toString(calculateResult(brojevi, suma)));

	}

	public static int[] calculateResult(int[] brojevi, int sum) {		
		
		int[] result = new int[2];	
		
		for (int i = 0; i < (brojevi.length - 1); i++) {	
			for (int j = (i + 1); j < brojevi.length; j++) {
				if(brojevi[i] + brojevi[j] == sum) {			
					result[0] = i; 
					result[1] = j; 		
					return result;
				}
			}
		}
		
		return null;
	
	}

}
