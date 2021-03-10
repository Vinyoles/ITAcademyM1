package nivell2;

import java.util.Scanner;

public class CalculaMitjanesApp {

	public static void main(String[] args) {
	
		//array bidimencional capaç de guardar 3 notes de 5 alumnes
		float[][] notes = new float[5][3];
		
		//assigna el mètode scanner a la variabla sca
		Scanner sca = new Scanner(System.in);
	
		//demana a l'usuari que s'introdueixin les notes dels alumnes per pantalla i el id de cada alumne
		for (int i=0; i<5; i++) {
			System.out.println("Alumne nou:");
			//notes[i][0] = Float.parseFloat(sca.nextLine());
			
			for(int j=0; j<3; j++) {
				System.out.println("Introduiu la nota #" + (j+1) + " de l'alumne " + (i+1));
				notes[i][j] = Float.parseFloat(sca.nextLine());
				while (notes[i][j]<0 || notes[i][j]>10) {
					System.out.println("Introduiu de nou la nota #" + (j+1) + " de l'alumne " + (i+1) + 
							". Les notes han de ser entre el 0 i el 10");
					notes[i][j] = Float.parseFloat(sca.nextLine());
				}
			}
		}
		
		//comprova la mitjana de cada alumne
		float mitjana;
		float sumatoriNotes = 0;
		for (int i=0; i<5; i++) {
			System.out.println("Alumne #" + (i+1));
			
			sumatoriNotes = 0; //Per resetajar la variable
			for(int j=0; j<3; j++) {
				sumatoriNotes = sumatoriNotes + notes[i][j];
			}
			mitjana = sumatoriNotes/3;
			System.out.println(mitjana + " de mitjana.");
			if (mitjana >= 5) {
				System.out.println("Alumne aprovat");
			} else {
				System.out.println("Alumne suspès");
			}
			System.out.println();
		}
	}
}
