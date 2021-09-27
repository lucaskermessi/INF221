package proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato {
	
	int N, nJogos;

	ArrayList<Time> times;
	
	public Campeonato(int nTimes){
		
		N = nTimes;
		nJogos = (N*(N-1))/2;
		times = new ArrayList<Time>();
		
		for(int i = 0; i < N; i++) {

			times.add(new Time(i+1));
		}
		
	}
	
	public int getNumJogos() {
		
		return nJogos;
	}
	
	public void newPartida(int X, int Y, int Z, int W) {
		
		times.get(X-1).calculaPontos(Y, W);
		times.get(Z-1).calculaPontos(W, Y);
	}
	
	public void resolve() {
		
		Comparator<Time> comp = (Time a, Time b) -> {
			return a.comparar(b);
		};
		
		Collections.sort(times,comp);
	}
	
	public String tabelaFinal() {
		
		resolve();
		
		String tabela = times.get(0).getId();
		
		for(int i = 1;i<N;i++) {
			
			tabela += " " + times.get(i).getId();
		}
		
		return tabela;
	}
}
