package ar.edu.unq.po2.videoJuego;

public class SinFichas implements EstadoJuego {


	@Override
	public void ingresarFicha(MaquinaDeVideoJuego juego) {
		juego.setEstadoJuego(new UnJugador());
	}

	@Override
	public void iniciar(MaquinaDeVideoJuego juego) {
		System.out.println("Ingrese una ficha para un jugador, o dos para dos jugadores.");
	}
	
}
