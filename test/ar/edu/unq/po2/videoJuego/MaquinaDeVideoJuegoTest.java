package ar.edu.unq.po2.videoJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideoJuegoTest {

	private MaquinaDeVideoJuego maquinaDeVJ;

	@BeforeEach
	public void setUp() {
		maquinaDeVJ = new MaquinaDeVideoJuego();
	}

	@Test
	void estadoSinFichasTest() {
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof SinFichas); 
		maquinaDeVJ.iniciar();
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof SinFichas); 
	}
	
	@Test
	void estadoUnJugadorTest() {
		maquinaDeVJ.ingresarFicha();
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof UnJugador); 
	}

	@Test
	void estadoDosJugadoresTest() {
		maquinaDeVJ.ingresarFicha();
		maquinaDeVJ.ingresarFicha();
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof DosJugadores); 
	}
	
	@Test
	void todosLosEstadosTest() {
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof SinFichas); 
		maquinaDeVJ.ingresarFicha();
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof UnJugador); 
		maquinaDeVJ.ingresarFicha();
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof DosJugadores); 
	}
	
	@Test
	void finalizarJuegoTest() {
		// al finalizar el juego, se vuelve al estado SinFichas
		maquinaDeVJ.ingresarFicha();
		maquinaDeVJ.ingresarFicha();
		maquinaDeVJ.iniciar();
		maquinaDeVJ.finalizar();
		assertTrue(maquinaDeVJ.getEstadoJuego() instanceof SinFichas); 
	}

}
