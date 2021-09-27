package proj;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int N, X, Y, Z, W;
		
		N = ler.nextInt();
		
		Campeonato camp;
		
		N = ler.nextInt();
		camp = new Campeonato(N);
		
		for(int i = 0; i < (N*(N-1)/2); i++) {
			
			X = ler.nextInt();
			Y = ler.nextInt();
			Z = ler.nextInt();
			W = ler.nextInt();
			
			camp.newPartida(X,Y,Z,W);
		}
		System.out.println(camp.tabelaFinal());
		ler.close();
	}
}
