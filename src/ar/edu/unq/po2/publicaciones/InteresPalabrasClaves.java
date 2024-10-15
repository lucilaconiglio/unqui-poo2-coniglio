package ar.edu.unq.po2.publicaciones;

public class InteresPalabrasClaves extends Interes {
		
	public InteresPalabrasClaves(String valorDeInteres) {
		super(valorDeInteres);
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getFiliaciones()
				       .stream()
				       .anyMatch(p -> p.equals(getValorDeInteres()));
	}
	
}
