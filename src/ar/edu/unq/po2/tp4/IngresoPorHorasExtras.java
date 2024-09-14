package ar.edu.unq.po2.tp4;


public class IngresoPorHorasExtras extends Ingreso{

	private int horasExtras;
	
	public IngresoPorHorasExtras(Mes mesDePercepcion, String concepto, Double monto, int horasExtras){
		super(mesDePercepcion, concepto, monto);
		this.horasExtras = horasExtras;
	}
	
	
	 @Override
    public boolean esImponible() {
        return false;
    }
}
