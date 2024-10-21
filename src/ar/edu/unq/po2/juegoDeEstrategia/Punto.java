package ar.edu.unq.po2.juegoDeEstrategia;

public class Punto {
	
	private int inicio;
	
	private int _final;
	
	public Punto(int inicio, int _final) {
		this.inicio = inicio;
		this._final = _final;
	}
	
	public int getInicio() {
		return inicio;
	}

	public int getFinal() {
		return _final;
	}
	
}
