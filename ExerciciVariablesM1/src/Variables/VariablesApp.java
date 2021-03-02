
package Variables;

import java.util.stream.*;

public class VariablesApp {

	public static void main(String[] args) {
		
		/////NIVELL 1
		///FASE 1
		
		//Variables String amb nom i cognoms
		String nom = "Andreu";
		String cognom1r = "Vinyoles";
		String cognom2n = "Busquets";
		
		//Variables de números enters amb dia, mes i any de naixement
		int dia = 19;
		int mes = 11;
		int any = 1992;
		
		//Mostra les dades en l'ordre i apèndix demanats
		System.out.println(cognom1r + " " + cognom2n + ", " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		
		
		///FASE 2
		
		//constant que conté l'any 1948 (de traspàs)
		final int anyTraspasInicial = 1948;
		
		//calcula el número d'anys de traspàs des de 1948 (inclós) fins al meu naixement
		int numAnysTraspas;
		
		numAnysTraspas = (any - anyTraspasInicial) / 4;
		numAnysTraspas++; //per tenir en compte també al 1948
		
		System.out.println("Des del " + anyTraspasInicial + " fins al " + any + 
				" hi ha hagut " + numAnysTraspas + " anys de traspàs");
		
		
		///FASE3
		
		//bucle que guarda tots els anys de traspàs a una array
		int[] anysTraspas = new int[numAnysTraspas];
		int anyAnalitzat = anyTraspasInicial;
		int posicioArray = 0;
		
		for (int i=0; i<=(any-anyTraspasInicial); i++) {
			if (anyAnalitzat % 4 == 0) {
				anysTraspas[posicioArray] = anyAnalitzat;
				posicioArray++;
			}
			anyAnalitzat++;
		}
		
		//mostra els anys de traspàs
		String llistaAnysTraspas = "";
		for (int i=0; i<numAnysTraspas; i++) {
			if (llistaAnysTraspas == "") {
				llistaAnysTraspas = llistaAnysTraspas + anysTraspas[i];
			} else {
				llistaAnysTraspas = llistaAnysTraspas + ", " + anysTraspas[i];
			}
		}
		
		System.out.println("Els anys de traspàs durant el periode estudiat són: " + llistaAnysTraspas);
		
		
		
		///FASE 4
		
		//variables contenint nom i cognoms i data de naixament
		String nomICognoms = nom + " " + cognom1r + " i " + cognom2n;
		String dataNaixement = dia + "/" + mes + "/" + any;
		
		System.out.println("El meu nom és " + nomICognoms);
		System.out.println("Vaig neixer el " + dataNaixement);
		if (IntStream.of(anysTraspas).anyMatch(x -> x == any)) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement no és de traspàs");
		}
		
		
		
		/////NIVELL 2
		
		//Declara una variable double amb 4 decimals
		double variableDouble = 3.5469;
		int variableInt;
		float variableFloat;
		String variableString;
		
		//casteig de la variable double a cadascuna de les variables anteriors
		variableInt = (int) variableDouble;
		variableFloat = (float) variableDouble;
		variableString = String.valueOf(variableDouble);
		
		System.out.println("Double: " + variableDouble);
		System.out.println("Integer: " + variableInt);
		System.out.println("Float: " + variableFloat);
		System.out.println("String: " + variableString);
		

		/////NIVELL 3
		
		//declara i inicialitza una array int amb números del 1 al 10
		int[] arrayDecimal = IntStream.rangeClosed(1, 10).toArray();
		
		//inverteix l'array anterior (TODO Eduard, si el math.abs per calcular el valor absolut compta com una llibreria, puc pensar una altre manera...)
		for (int i=0; i<arrayDecimal.length; i++) {
			arrayDecimal[i]= Math.abs(arrayDecimal[i]-(arrayDecimal.length+1)); //s'ha de sumar 1 al valor de la longitud per fer els absoluts simètrics a 0
		}
		
		//ploteja els números de l'array
		for (int i=0; i<arrayDecimal.length; i++) {
			System.out.println(arrayDecimal[i]);
		}
	}
}
