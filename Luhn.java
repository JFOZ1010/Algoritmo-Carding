package ALGORITMO;
/*
 * Autor: JF0Z PWned. 
 * purpose: this is the implementation of my luhn algorithm in java with the purpose of being able to verify card numbers and IMEI.
 * 
 */
public class Luhn {
	private static int ja; 

	
	public static boolean verificacionLuhn(int [] digitos) { //16 digitos. 
		int sum = 0; 
		int length = digitos.length; // 16. 
		for(int i = 1; i<16; i++) {
			int digit = digitos[length - i - 1]; 
			
			if(i%2 == 0){ //cada segunda posicion de los numeros ... 
				digit = digit *2;  //se duplican, y si el resultado es mayor de 9 --> se suman las dos cifras y ese será el numero. 
			}
			if(digit > 9) {
				digit = digit -9; //para los numeros de 2 cifras. ejm: 12 - 9 = 3 ; --> 1 + 2 = 3; 
		}
			
			sum = sum + digit; //sumar cada de una de las cifras del numero (Card - IMEI);
						
			System.out.println(digit);
			
	}
		//un simple condicional para verificar como ultimo paso, la certeza de si el numero es correcto. 
		if(sum %10 == 0) {
		System.out.println("el numero valido de la suma total es: " + sum); 
		}else {
			System.out.println("El numero y su total, no son validos, por ende error. "); 
		}

		return sum % 10 == 0 ;  //ya si la suma de los numeros me retorna un 0 como residuo entre la division entre 10;

	}


}
