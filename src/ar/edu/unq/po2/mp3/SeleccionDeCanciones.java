package ar.edu.unq.po2.mp3;

public class SeleccionDeCanciones implements EstadoReproductor {

	@Override
	public void play(Song song) {
		song.setEstadoReproductor(new Reproduciendo());
	}

	@Override
	public void pause(Song song) {
		throw new Error("No hay ninguna cancion seleccionada para pausar");

	}

	@Override
	public void stop(Song song) {
		// no hace nada
	}

}
