package nivell3;

import java.util.Scanner;

public class FibronacciApp {

	public static void main(String[] args) {
		/* Fonament teòric:
		 * 
		 * En notació matemàtica, els numeros de fibronacci es corresponen a Fn, essent n la posició en la sèrie, 0 = F0, 1 = F1, 
		 * 1 = F2, 2 = F3, 3 = F4 ..... Xn = Fn
		 * 
		 * Amb la successió de fibronacci es pot aproximar al número d'or (Φ) de la següent manera:
		 * 
		 * 
		 * Φ =  lim   (Fn+1 / Fn)
		 *     n -> ∞ 
		 * 
		 *  
		 * Es pot resoldre que la següent expresió permet calcular el número anterior a qualsevol punt de la successió:
		 * 
		 * Fn-1 = Fn / Φ
		 * 
		*/
		
		//assigna el mètode scanner a la variabla sca
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Introduiu el primer número de la succeció de fibronacci");
		int iniFn = Integer.parseInt(sca.nextLine());
		
		System.out.println("Introduiu l'últim número de la succeció de fibronacci");
		int finalFn = Integer.parseInt(sca.nextLine());
		
		int fn; //numero de fibronacci a la posició n
		int fnAnterior;
		
		//calcula el número d'or i l'enmagatzema a la variable phi
		double phi = (1 + Math.sqrt(5)) / 2;
		
		//calcula el Fn-1
		fnAnterior = (int) Math.round(iniFn / phi);
		
		//assigna el valor inicial a fn
		fn = iniFn;
		
		//ploteja la successió de Fibronacci entre els dos nombres
		while (fn <= finalFn) {
			int temp = fn;
			System.out.print(fn + " ");
			fn = fn + fnAnterior;
			fnAnterior = temp;
		}
	}
}
