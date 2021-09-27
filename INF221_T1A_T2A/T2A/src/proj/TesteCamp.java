package proj;

import org.junit.*;
import static org.junit.Assert.*;

public class TesteCamp {
	
	
	@Test
	public void test1() {
		
		Campeonato c = new Campeonato(5);
		
		c.newPartida(1, 102, 2, 62);
		c.newPartida(1, 128, 3, 127);
		c.newPartida(1, 144, 4, 80);
		c.newPartida(1, 102, 5, 101);
		c.newPartida(2, 62, 3, 61);
		c.newPartida(2, 100, 4, 80);
		c.newPartida(2, 88, 5, 82);
		c.newPartida(3, 79, 4, 90);
		c.newPartida(3, 87, 5, 100);
		c.newPartida(4, 110, 5, 99);
		
		assertEquals("1 2 4 5 3", c.tabelaFinal());
	}
	
	@Test
	public void test2() {
		
		Campeonato c = new Campeonato(3);
		
		c.newPartida(1, 90, 2, 30);
		c.newPartida(1, 30, 3, 90);
		c.newPartida(2, 120, 3, 30);
		assertEquals("2 1 3", c.tabelaFinal());
	}
	
	@Test
	public void test3() {
		
		Campeonato c = new Campeonato(3);
		
		c.newPartida(1, 30, 2, 10);
		c.newPartida(1, 10, 3, 0);
		c.newPartida(2, 10, 3, 50);
		assertEquals("1 3 2", c.tabelaFinal());
	}
	
	@Test
	public void test4() {
		
		Campeonato c = new Campeonato(3);
		
		c.newPartida(1, 40, 3, 80);
		c.newPartida(1, 80, 2, 40);
		c.newPartida(2, 80, 3, 40);
		assertEquals("1 2 3", c.tabelaFinal());
	}
	
}
