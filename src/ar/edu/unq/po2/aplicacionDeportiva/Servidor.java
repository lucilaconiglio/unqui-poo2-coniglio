package ar.edu.unq.po2.aplicacionDeportiva;

import java.util.ArrayList;
import java.util.List;

public abstract class Servidor implements Observer{
	
	private String nombre;
	private List<String> deportes;
	
	public Servidor(String nombre) {
		this.nombre = nombre;
		this.deportes = new ArrayList<String>();
	}
	
	public void notificar(Partido partido) {
		if(esDeInteres(partido)) {
			System.out.print("notifcar");
		}
	}
	
	protected boolean esDeInteres(Partido partido) {
		return getDeportes().stream()
				.anyMatch(p -> p.equals(partido.getDeporte()));
	}
		
	public List<String>  getDeportes() {
		return deportes;
	}
	
	public void addDeporte(String deporte) {
		deportes.add(deporte);
	}
	
	public void removeDeporte(String deporte) {
		deportes.remove(deporte);
	}
}
