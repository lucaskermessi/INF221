package proj;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numAtacantes, numDefensores;
		
		while(true) {

			numAtacantes = ler.nextInt();
			numDefensores = ler.nextInt();
			if((numAtacantes<=2 && numDefensores<=0))
				break;

			ArrayList<Integer> defensores;
			ArrayList<Integer> atacantes;

			int aux;
			
			atacantes = new ArrayList<Integer>();

			for(int i=0;i<numAtacantes;i++) {

				aux = ler.nextInt();
				atacantes.add(aux);
			}
			
			defensores = new ArrayList<Integer>();
			
			for(int i=0;i<numDefensores;i++) {

				aux = ler.nextInt();
				defensores.add(aux);
			}
			System.out.println(impedido(atacantes,defensores));	
		}
		
		ler.close();
	}
	
	public static char impedido(ArrayList<Integer> atacantes, ArrayList<Integer> defensores) {

		Collections.sort(atacantes);
		Collections.sort(defensores);

		if (defensores.size()<=1 || atacantes.get(0)<defensores.get(1))
			return 'Y';
		else return 'N';
	}
	
}

