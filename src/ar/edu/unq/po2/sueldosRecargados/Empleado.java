package ar.edu.unq.po2.sueldosRecargados;

public abstract class Empleado {
			
	abstract double calcularSueldoBruto();

	public final double sueldo() {
	    return calcularSueldoBruto() * 0.87;  // 87% del sueldo bruto, ya descontado el 13%
	}


}
