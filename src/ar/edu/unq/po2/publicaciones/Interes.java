package ar.edu.unq.po2.publicaciones;

public abstract class  Interes {
	
	private String valorDeInteres;
	
	public Interes(String valorDeInteres) {
		this.valorDeInteres = valorDeInteres;
	}
	
	public abstract boolean esDeInteres(Articulo articulo);

	public String getValorDeInteres() {
		return valorDeInteres;
	}
}