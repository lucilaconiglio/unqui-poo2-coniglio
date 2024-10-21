package ar.edu.unq.po2.concursoDePreguntasYRespuestas;

public abstract class EstadoJuego {

	public abstract EstadoJuego siguienteEstado();
	
	public abstract Boolean condicion(Juego juego);
	
	public void irASiguienteEstado(Juego juego) {
		juego.setEstadoJuego(siguienteEstado());
	}

	public abstract void notificarInicioDeJuego(Juego juego);
	
	public abstract void recibirPregunta(Juego juego, Participante participante, String pregunta);

	public abstract void notificarRespuestaCorrecta(Juego juego, Participante participante);
	
	public abstract void notificarRespuestaIncorrecta(Juego juego, Participante participante);
	
	public abstract void notificarRespuestaCorrectaGeneral(Juego juego, Participante participante, String string);
	
	public abstract void notificarGanador(Juego juego, Participante participante);
}
