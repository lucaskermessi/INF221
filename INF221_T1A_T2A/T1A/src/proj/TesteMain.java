package proj;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMain {

	ArrayList <Integer> atacantes, defensores;
	
	@Test
	public void testeNaoImpedido() {

		atacantes = new ArrayList<Integer>();
		defensores = new ArrayList<Integer>();
		
		atacantes.add(49);
		atacantes.add(123);
		
		defensores.add(20);
		defensores.add(45);
		
		
		assertEquals('N', Main.impedido(atacantes, defensores));
	}
	
	
	@Test
	public void testeImpedido() {

		atacantes = new ArrayList<Integer>();
		defensores = new ArrayList<Integer>();
		
		atacantes.add(35);
		atacantes.add(153);
		
		defensores.add(20);
		defensores.add(100);
		
		
		assertEquals('Y', Main.impedido(atacantes, defensores));
	}
	
	@Test
	public void testSemDefesa() {
		
		atacantes = new ArrayList<Integer>();
		defensores = new ArrayList<Integer>();
		
		atacantes.add(400);
		atacantes.add(1100);
		atacantes.add(270);
		
		assertEquals('Y', Main.impedido(atacantes, defensores));
	}

}
