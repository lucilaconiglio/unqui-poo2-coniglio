package ar.edu.unq.po2.encirptacion;

public class RedDeComputadoras {

	private Encriptador currentEncriptador;

	public RedDeComputadoras(Encriptador currentEncriptador) {
		this.currentEncriptador = currentEncriptador;
	}
	
	public Encriptador getEncriptador() {
		return this.currentEncriptador;
	}
	
	public void setEncriptador(Encriptador encriptador) {
		this.currentEncriptador = encriptador;
	}
	
}
