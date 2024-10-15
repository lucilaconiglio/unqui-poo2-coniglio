package ar.edu.unq.po2.publicaciones;

public class InteresTipoDeArticulo extends Interes {

	public InteresTipoDeArticulo(String valorDeInteres) {
		super(valorDeInteres);
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return this.getValorDeInteres() == articulo.getTipoDeArticulo();
	}

}
