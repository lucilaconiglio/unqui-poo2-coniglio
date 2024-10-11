package ar.edu.unq.po2.encirptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorVocalesTest {

	private EncriptadorVocales encriptador;

	@BeforeEach
	public void setUp() {
		encriptador = new EncriptadorVocales();
	}

	@Test
	public void testEncriptarTextoSimple() {
		String resultado = encriptador.encriptar("hola");
		assertEquals("hule", resultado);
	}

	@Test
	public void testEncriptarConMayusculas() {
		String resultado = encriptador.encriptar("Hola");
		assertEquals("Hule", resultado); // Conserva mayúsculas en la primera letra
	}

	@Test
	public void testEncriptarTextoSoloVocales() {
		String resultado = encriptador.encriptar("aeiou");
		assertEquals("eioua", resultado); // Reemplaza cada vocal correctamente
	}

	@Test
	public void testDesencriptarTextoSimple() {
		String resultado = encriptador.desencriptar("hule");
		assertEquals("hola", resultado);
	}

	@Test
	public void testDesencriptarConMayusculas() {
		String resultado = encriptador.desencriptar("Hule");
		assertEquals("Hola", resultado); // Conserva mayúsculas
	}

	@Test
	public void testDesencriptarTextoSoloVocales() {
		String resultado = encriptador.desencriptar("eioua");
		assertEquals("aeiou", resultado); // Reemplaza cada vocal correctamente
	}

	@Test
	public void testEncriptarTextoConsonantes() {
		String resultado = encriptador.encriptar("xyz");
		assertEquals("xyz", resultado); // Las consonantes permanecen iguales
	}

	@Test
	public void testDesencriptarTextoConsonantes() {
		String resultado = encriptador.desencriptar("xyz");
		assertEquals("xyz", resultado); // Las consonantes permanecen iguales
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
