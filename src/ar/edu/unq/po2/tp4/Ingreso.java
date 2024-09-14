package ar.edu.unq.po2.tp4;


public class Ingreso {

	private Mes mesDePercepcion;
	private String concepto;
	private double monto;
	
	public Ingreso(Mes mesDePercepcion, String concepto, Double monto){
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	
	public double getMonto() {
		return monto;
	}
	
    public boolean esImponible() {
        return true;
    }
}
