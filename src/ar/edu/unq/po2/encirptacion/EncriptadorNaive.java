package ar.edu.unq.po2.encirptacion;

public class EncriptadorNaive {

	private Encriptador currentEncriptador;

	public EncriptadorNaive(Encriptador currentEncriptador) {
		this.currentEncriptador = currentEncriptador;
	}
	
	public Encriptador getEncriptador() {
		return this.currentEncriptador;
	}
	
	public void setEncriptador(Encriptador encriptador) {
		this.currentEncriptador = encriptador;
	}
	
}
