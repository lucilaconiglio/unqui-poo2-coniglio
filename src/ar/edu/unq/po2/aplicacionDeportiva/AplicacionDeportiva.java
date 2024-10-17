package ar.edu.unq.po2.aplicacionDeportiva;

import java.util.ArrayList;

public class AplicacionDeportiva {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private ArrayList<Partido> partidos = new ArrayList<Partido>();

	public void ingresar(Partido partido) {
		partidos.add(partido);
		notificar(partido);
	}

	private void notificar(Partido partido) {
		for(Observer s: observers) {
			s.notificar(partido);
		}
	}
	
	public void suscribir(Observer servidor) {
		observers.add(servidor);
	}
	
	public void desuscribir(Observer servidor) {
		observers.remove(servidor);
	}
	

}
