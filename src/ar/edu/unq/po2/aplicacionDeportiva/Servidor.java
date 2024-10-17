package ar.edu.unq.po2.aplicacionDeportiva;

public class Servidor extends Observer{

	public Servidor(String nombre) {
		super(nombre);
	}

	@Override
	public boolean esDeInteres(Partido partido) {
		return getDeportes().stream()
					.anyMatch(p -> p.equals(partido.getDeporte()));
	}

}
