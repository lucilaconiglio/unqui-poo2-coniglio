package ar.edu.unq.po2.publicaciones;

import java.util.ArrayList;

public class SistemaDePublicacion {
	
	ArrayList<Articulo> articulos = new ArrayList<Articulo>();
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void cargar(Articulo articulo) {
		articulos.add(articulo);
		notificar(articulo);
	}
	
	private void notificar(Articulo articulo) {
		for(Observer o : observers) {
			o.notificar(articulo);
		}
	}
	
	public void suscribir(Investigador investigador) {
		observers.add(investigador);
	}
	
	public void desuscribir(Investigador investigador) {
		observers.remove(investigador);
	}
}
