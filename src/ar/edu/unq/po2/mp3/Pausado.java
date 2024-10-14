package ar.edu.unq.po2.mp3;

public class Pausado implements EstadoReproductor{

	@Override
	public void play(Song song) {
		throw new Error("No esta en modo seleccion de canciones.");
	}

	@Override
	public void pause(Song song) {
		song.setEstadoReproductor(new Reproduciendo());	
	}


	@Override
	public void stop(Song song) {
		// no hace nada
	}

}
