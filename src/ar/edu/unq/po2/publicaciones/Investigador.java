package ar.edu.unq.po2.publicaciones;

import java.util.ArrayList;

public class Investigador implements Observer{
	
	private String nombre;
	
	private ArrayList<Interes> intereses;
	
	public Investigador(String nombre) {
		this.nombre = nombre;
		intereses = new ArrayList<Interes>();
	}
	
	public void addInteres(Interes interes) {
		intereses.add(interes); 
	}
	
	public void removeInteres(Interes interes) {
		intereses.remove(interes); 
	}

	@Override
	public void notificar(Articulo articulo) {
		if(estaSuscripto(articulo)) {
			System.out.println("el investigador esta siendo notificado");
		}
		
	}
	
	private Boolean estaSuscripto(Articulo articulo) {
		boolean estaSuscripto = false;
		for(Interes a: intereses) {
			if (a.esDeInteres(articulo)) {
				estaSuscripto = true;
			}
		}
		return estaSuscripto;
	}
}
