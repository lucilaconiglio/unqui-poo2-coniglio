package ar.edu.unq.po2.videoJuego;

public class UnJugador implements EstadoJuego{

	@Override
	public void ingresarFicha(MaquinaDeVideoJuego juego) {
		juego.setEstadoJuego(new DosJugadores());
		
	}

	@Override
	public void iniciar(MaquinaDeVideoJuego juego) {
		System.out.println("Iniciando el juego con un jugador.");
	}

}
