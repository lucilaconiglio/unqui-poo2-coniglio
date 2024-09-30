package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaServicio;
	
	public Impuesto(Agencia agencia, double tasaServicio) {
		super(agencia);
		this.tasaServicio = tasaServicio;
	}

	@Override
	public double getMonto() {
		return tasaServicio;
	}

}
