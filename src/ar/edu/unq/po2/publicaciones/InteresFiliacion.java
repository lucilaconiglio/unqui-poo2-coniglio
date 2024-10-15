package ar.edu.unq.po2.publicaciones;

public class InteresFiliacion extends Interes {
		
	public InteresFiliacion(String valorDeInteres) {
		super(valorDeInteres);
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getAutores()
				       .stream()
				       .anyMatch(p -> p.equals(getValorDeInteres()));
	}
	
}
