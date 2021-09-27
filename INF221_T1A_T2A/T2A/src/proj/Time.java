package proj;

public class Time {
	
	int inscricao;
	int pontuacao = 0;
	int cestasFeitas = 0;
	int cestasRecebidas = 0;

	public Time(int insc) {
		
		inscricao = insc;
	}
	
	public String getId() {
		
		return Integer.toString(inscricao);
	}
	
	public void calculaPontos(int scoreA, int scoreB) {
		
		if(scoreA > scoreB) {
			cestasFeitas += scoreA;
			pontuacao += 2;
		}
		else {
			pontuacao += 1;
		}
		cestasFeitas += scoreA;
		cestasRecebidas += scoreB;
	}
	
	public void setInscricao(int a) {
		
		inscricao = a;
	}
	
	public int getScore() {
		
		return pontuacao;
	}
	
	public int getCestasFeitas() {
		
		return cestasFeitas;
	}
	
	public int getCestasRecebidas() {
		
		return cestasRecebidas;
	}
	
	public double getAverageCestas() {
		
		return cestasFeitas / cestasRecebidas;
	}
	
	public int comparar(Time b) {
		
			double cestaA1;
			double cestaA2;
			
			if(pontuacao > b.pontuacao) {
				return -1;
			}
			else if(pontuacao == b.pontuacao) {
				if(cestasRecebidas != 0) {
					cestaA1 = getAverageCestas();
				}
				else {
					cestaA1 = cestasFeitas;
				}
				
				if(b.cestasRecebidas != 0) {
					cestaA2 = b.getAverageCestas();
				}
				else {
					cestaA2 = b.cestasFeitas;
				}
				
				if(cestaA1 > cestaA2) {
					return -1;
				}
				else if(cestaA1 == cestaA2) {
					if(cestasFeitas > b.cestasFeitas) {
						return -1;
					}
					else if(cestasFeitas == b.cestasFeitas) {
						if(inscricao < b.inscricao) {
							return -1;
						}
					}
				}
			}
			return 1;
	}
		
}
