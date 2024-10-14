package ar.edu.unq.po2.mp3;

public class Song {

	private EstadoReproductor estadoReproductor;
	
	public Song() {
		estadoReproductor = new SeleccionDeCanciones();
	}

	public void play() {
		estadoReproductor.play(this);
	}

	public void pause() {
		estadoReproductor.pause(this);
	}

	public void stop() {
		estadoReproductor.stop(this);
	}

	public void setEstadoReproductor(EstadoReproductor estadoReproductor) {
		this.estadoReproductor = estadoReproductor;
	}

	public EstadoReproductor getEstadoReproductor() {
		return estadoReproductor;
	}

}
