package nivell1;

import java.util.*;

public class ClasseMain {

	public static void main(String[] args) {
/*
- Fase 4
Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).  
Ompliu els nous arrays lletra per lletra. 
Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
*/
		
		///FASE 1
		
		//declara les variables
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		
		//assigna el mètode scanner a la variabla sca
		Scanner sca = new Scanner(System.in);
		
		//inicialitza les variables per consola
		System.out.println("Introduiu el nom de la primera ciutat:");
		ciutat1 = sca.nextLine();
		System.out.println("Introduiu el nom de la segona ciutat:");
		ciutat2 = sca.nextLine();
		System.out.println("Introduiu el nom de la tercera ciutat:");
		ciutat3 = sca.nextLine();
		System.out.println("Introduiu el nom de la quarta ciutat:");
		ciutat4 = sca.nextLine();
		System.out.println("Introduiu el nom de la cinquena ciutat:");
		ciutat5 = sca.nextLine();
		System.out.println("Introduiu el nom de la sisena ciutat:");
		ciutat6 = sca.nextLine();
		
		//imprimeix les variables introduides per consola
		System.out.println ("Les ciutats introduides són: " + ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + ciutat4 + ", " + 
		ciutat5 + " i " + ciutat6);
		
		
		///FASE 2
		
		//converteix les variables en una array
		String[] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
		
		//ordena alfabèticament l'array a través del mètode sort
		Arrays.sort(arrayCiutats);
		
		//imprimeix les ciutats de l'array ordenades alfabèticament
		System.out.println();
		System.out.println("Les ciutats ordenades alfabèticament són:");
		for (int i=0;i< arrayCiutats.length; i++) {
			System.out.println(arrayCiutats[i]);
		}
		
		///FASE 3
		
		//declara i inicialitza l'array Ciutats Modificades a partir de l'array ciutats
		String[] arrayCiutatsModificades = arrayCiutats;
		
		//va primer paraula per paraula i després caràcter a caràcter buscant si hi ha alguna a i substituint-la per un 4
		for (int i=0; i<arrayCiutats.length; i++) {
			for (int j=0; j<arrayCiutats[i].length(); j++) {
				if (arrayCiutats[i].charAt(j) == 'a') {
					//divideix el string de cada element a index "i", i retalla el string abans i després de el caràcter a, que substitueix per un 4
					arrayCiutatsModificades[i] = arrayCiutats[i].substring(0,j) + '4' + arrayCiutats[i].substring(j+1, arrayCiutats[i].length());
				}
			}
		}
		
		//imprimeix les ciutats modificades de l'array
		System.out.println();
		System.out.println("Les ciutats amb les 'a' substituides per '4' són:");
		for (int i=0;i< arrayCiutatsModificades.length; i++) {
			System.out.println(arrayCiutatsModificades[i]);
		}
		
		///FASE 4
		//Inicialitza les arrays de caracter per guardar caràcter a caràcter els noms de la ciutat
		char[] lletresCiutat1 = new char[ciutat1.length()];
		char[] lletresCiutat2 = new char[ciutat2.length()];
		char[] lletresCiutat3 = new char[ciutat3.length()];
		char[] lletresCiutat4 = new char[ciutat4.length()];
		char[] lletresCiutat5 = new char[ciutat5.length()];
		char[] lletresCiutat6 = new char[ciutat6.length()];
		
		//Guarda les ciutats lletra a lletra 
		for (int i=0; i<ciutat1.length(); i++) {
			lletresCiutat1[i] = ciutat1.charAt(i);
		}
		for (int i=0; i<ciutat2.length(); i++) {
			lletresCiutat2[i] = ciutat2.charAt(i);
		}
		for (int i=0; i<ciutat3.length(); i++) {
			lletresCiutat3[i] = ciutat3.charAt(i);
		}
		for (int i=0; i<ciutat4.length(); i++) {
			lletresCiutat4[i] = ciutat4.charAt(i);
		}
		for (int i=0; i<ciutat5.length(); i++) {
			lletresCiutat5[i] = ciutat5.charAt(i);
		}
		for (int i=0; i<ciutat6.length(); i++) {
			lletresCiutat6[i] = ciutat6.charAt(i);
		}
		
		//mostra els noms invertits de les ciutats
		for(int i=lletresCiutat1.length; i>0; i--) {
			System.out.print(lletresCiutat1[i-1]);
		}
		System.out.println();
		for(int i=lletresCiutat2.length; i>0; i--) {
			System.out.print(lletresCiutat2[i-1]);
		}
		System.out.println();
		for(int i=lletresCiutat3.length; i>0; i--) {
			System.out.print(lletresCiutat3[i-1]);
		}
		System.out.println();
		for(int i=lletresCiutat4.length; i>0; i--) {
			System.out.print(lletresCiutat4[i-1]);
		}
		System.out.println();
		for(int i=lletresCiutat5.length; i>0; i--) {
			System.out.print(lletresCiutat5[i-1]);
		}
		System.out.println();
		for(int i=lletresCiutat6.length; i>0; i--) {
			System.out.print(lletresCiutat6[i-1]);
		}
		System.out.println();
	}
}
