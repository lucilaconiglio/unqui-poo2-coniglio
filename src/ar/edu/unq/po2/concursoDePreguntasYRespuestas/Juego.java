package ar.edu.unq.po2.concursoDePreguntasYRespuestas;

import java.util.ArrayList;

public class Juego {
	
	private final int CANT_MAX_DE_PARTICIPANTES = 5;
	private final int CANT_MAX_DE_PREGUNTAS = 5;
	private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
	private ArrayList<Participante> participantes = new ArrayList<Participante>();
	private EstadoJuego estadoJuego;
	
	public Juego() {
		this.estadoJuego = new EstadoInicio();
	}
	
	public void setEstadoJuego(EstadoJuego estadoJuego) {
		this.estadoJuego = estadoJuego;
	}
	
	public void hayDisponibilidad() {
		
		
	}
	
	public void sumar(Participante participante) {
		
	}
	
	public void addPregunta(Pregunta pregunta) {
		if(preguntas.size() <= CANT_MAX_DE_PREGUNTAS) {
			preguntas.add(pregunta);
		}
	}
	
	public void removePregunta(Pregunta pregunta) {
			preguntas.remove(pregunta);
	}

}
