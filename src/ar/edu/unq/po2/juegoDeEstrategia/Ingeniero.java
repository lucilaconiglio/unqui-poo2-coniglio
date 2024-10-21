package ar.edu.unq.po2.juegoDeEstrategia;

public class Ingeniero implements Personaje{

	private int cantidadDeLajas;
	
	public Ingeniero(int cantidadDeLajas) {
		this.cantidadDeLajas = cantidadDeLajas;
	}
	
	@Override
	public void caminar(Punto punto) {
		// TODO Auto-generated method stub
		
	}
	
	private void dejarLahaEnElPiso() {
		cantidadDeLajas =-1; 
	}

	@Override
	public void addPersonaje(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePersonaje(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personaje getPersonaje() {
		// TODO Auto-generated method stub
		return null;
	}

}
