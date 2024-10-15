package ar.edu.unq.po2.publicaciones;

public class InteresLugarDePublicacion extends Interes {

	public InteresLugarDePublicacion(String valorDeInteres) {
		super(valorDeInteres);
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return this.getValorDeInteres() == articulo.getLugarDePublicacion();
	}
}