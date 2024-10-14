package ar.edu.unq.po2.videoJuego;

public class DosJugadores implements EstadoJuego {

	@Override
	public void ingresarFicha(MaquinaDeVideoJuego juego) {
		// no hay mas modos 
	}

	@Override
	public void iniciar(MaquinaDeVideoJuego juego) {
		System.out.println("Iniciando el juego con dos jugadores.");
	}
	
}
