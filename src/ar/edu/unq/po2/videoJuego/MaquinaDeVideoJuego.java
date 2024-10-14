package ar.edu.unq.po2.videoJuego;

public class MaquinaDeVideoJuego {

	private EstadoJuego estadoJuego;

	public MaquinaDeVideoJuego() {
		this.estadoJuego = new SinFichas();
	}

	public void iniciar() {
		this.estadoJuego.iniciar(this);
	}
	
	public void finalizar() {
		this.estadoJuego = new SinFichas();
	}

	public void ingresarFicha() {
		this.estadoJuego.ingresarFicha(this);
	}
	
	public void setEstadoJuego(EstadoJuego estadoJuego) {
		this.estadoJuego = estadoJuego;
	}

}
