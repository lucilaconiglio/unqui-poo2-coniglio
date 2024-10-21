package ar.edu.unq.po2.juegoDeEstrategia;

public interface Personaje {
	
	public void caminar(Punto punto);
	
	public void addPersonaje(Personaje personaje);
	
	public void removePersonaje(Personaje personaje);
	
	public Personaje getPersonaje();
	
}