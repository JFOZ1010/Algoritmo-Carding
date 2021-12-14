package ALGORITMO;

import java.util.Random;

public class PrincipalLuhn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Luhn obj  = new Luhn(); 
		int[] entrada;
		entrada = new int[16]; 
		Random aleatorio  = new Random();
		int num = aleatorio.nextInt(16)+0;
		/*
		entrada[0] = 5; 
		entrada[1] = 3; 
		entrada[2] = 3; 
		entrada[3] = 3; 
		entrada[4] = 0; 
		entrada[5] = 3; 
		entrada[6] = 0; 
		entrada[7] = 0; 
		entrada[8] = 0; 
		entrada[9] = 0; 
		entrada[10] = 2; 
		entrada[11] = 6; 
		entrada[12] = 7; 
		entrada[13] = 4;
		entrada[14] = 4; 
		entrada[15] = 7;
		*/
		
 				//LOS NUMEROS PARA LA TARJETA DE CREDITO EVIDENTEMENTE NO SON VALIDOS. 
		
		entrada[0] = 5; 
		entrada[1] = 0; 
		entrada[2] = 3; 
		entrada[3] = 0; 
		entrada[4] = 0; 
		entrada[5] = 0; 
		entrada[6] = 0; 
		entrada[7] = 0; 
		entrada[8] = 0; 
		entrada[9] = 0; 
		entrada[10] = 8; 
		entrada[11] = 0; 
		entrada[12] = 1; 
		entrada[13] = 0;
		entrada[14] = 1; 
		entrada[15] = 0;

		
		
/*
		entrada[0] = num; 
		System.out.println("el num Randomico #1: " + num);
		entrada[1] = num; 
		System.out.println("el num Randomico #2: " + num);
		entrada[2] = num; 
		System.out.println("el num Randomico #3: " + num);
		entrada[3] = num; 
		System.out.println("el num Randomico #4: " + num);
		entrada[4] = num; 
		System.out.println("el num Randomico #5: " + num);
		entrada[5] = num; 
		System.out.println("el num Randomico #6: " + num);
		entrada[6] = num; 
		System.out.println("el num Randomico #7: " + num);
		entrada[7] = num; 
		System.out.println("el num Randomico #8: " + num);
		entrada[8] = num;
		System.out.println("el num Randomico #9: " + num);
		entrada[9] = num; 
		System.out.println("el num Randomico #10: " + num);
		entrada[10] = num; 
		System.out.println("el num Randomico #11: " + num);
		entrada[11] = num; 
		System.out.println("el num Randomico #12: " + num);
		entrada[12] = num; 
		System.out.println("el num Randomico #13: " + num);
		entrada[13] = num;
		System.out.println("el num Randomico #14: " + num);
		entrada[14] = num; 
		System.out.println("el num Randomico #15: " + num);
		entrada[15] = num;
		System.out.println("el num Randomico #16: " + num);
		
*/		
		obj.verificacionLuhn(entrada);

	}

}
