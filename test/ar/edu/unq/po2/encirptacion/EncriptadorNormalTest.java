package ar.edu.unq.po2.encirptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorNormalTest {

	private EncriptadorNormal encriptador;

	@BeforeEach
	public void setUp() {
		encriptador = new EncriptadorNormal();
	}

	@Test
	public void testEncriptarTextoSimple() {
		String resultado = encriptador.encriptar("hola mundo");
		assertEquals("mundo hola", resultado);
	}

	@Test
	public void testEncriptarTextoConUnaSolaPalabra() {
		String resultado = encriptador.encriptar("hola");
		assertEquals("hola", resultado); // Si solo hay una palabra, no debe cambiar
	}

	@Test
	public void testEncriptarTextoConEspaciosExtras() {
		String resultado = encriptador.encriptar("   hola   mundo  ");
		assertEquals("mundo   hola   ", resultado); // Debe manejar correctamente los espacios extras
	}

	@Test
	public void testDesencriptarTextoSimple() {
		String resultado = encriptador.desencriptar("mundo hola");
		assertEquals("hola mundo", resultado);
	}

	@Test
	public void testDesencriptarTextoConUnaSolaPalabra() {
		String resultado = encriptador.desencriptar("hola");
		assertEquals("hola", resultado); // Si solo hay una palabra, no debe cambiar
	}

	@Test
	public void testEncriptarTextoVacio() {
		String resultado = encriptador.encriptar("");
		assertEquals("", resultado); // No hay nada que encriptar
	}

	@Test
	public void testDesencriptarTextoVacio() {
		String resultado = encriptador.desencriptar("");
		assertEquals("", resultado); // No hay nada que desencriptar
	}
}
