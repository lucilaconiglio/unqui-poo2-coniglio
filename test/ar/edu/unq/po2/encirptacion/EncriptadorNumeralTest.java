package ar.edu.unq.po2.encirptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNumeralTest {

	private EncriptadorNumeral encriptador;

	@BeforeEach
	public void setUp() {
		encriptador = new EncriptadorNumeral();
	}

	@Test
	public void testEncriptarTextoSimple() {
		String resultado = encriptador.encriptar("hola");
		assertEquals("8,15,12,1", resultado);
	}

	@Test
	public void testEncriptarConEspacio() {
		String resultado = encriptador.encriptar("hola mundo");
		assertEquals("8,15,12,1,0,13,21,14,4,15", resultado);
	}

	@Test
	public void testEncriptarConLetrasMayusculas() {
		String resultado = encriptador.encriptar("Hola Mundo");
		assertEquals("8,15,12,1,0,13,21,14,4,15", resultado);
	}

	@Test
	public void testDesencriptarTextoSimple() {
		String resultado = encriptador.desencriptar("8,15,12,1");
		assertEquals("hola", resultado);
	}

	@Test
	public void testDesencriptarConEspacio() {
		String resultado = encriptador.desencriptar("8,15,12,1,0,13,21,14,4,15");
		assertEquals("hola mundo", resultado);
	}
}
