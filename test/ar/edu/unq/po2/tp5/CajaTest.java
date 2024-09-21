package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CajaTest {

	private ProductoCooperativa arroz;
	private ProductoEmpresaTradicional vino;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		arroz = new ProductoCooperativa(18d, 20);
		vino = new ProductoEmpresaTradicional(55d, 150);
	}
	
	@Test
	void registrarDosProductos() {
		caja.registrarProducto(arroz);
		caja.registrarProducto(vino);
		assertEquals(caja.getMontoTotal(), 71.2);
		
	}
	
	@Test
	void verificarStock() { 
		assertEquals(arroz.getStock(), 20);
		assertEquals(vino.getStock(), 150);
		caja.registrarProducto(arroz);
		caja.registrarProducto(vino);
		caja.registrarProducto(vino);
		caja.registrarProducto(vino);
		assertEquals(arroz.getStock(), 19);
		assertEquals(vino.getStock(), 147);
	}


}
