package ar.edu.unq.po2.publicaciones;

public class InteresAutor extends Interes {
		
	public InteresAutor(String valorDeInteres) {
		super(valorDeInteres);
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return articulo.getPalabrasClaves()
				       .stream()
				       .anyMatch(p -> p.equals(getValorDeInteres()));
	}
	
}
