package ar.edu.unq.po2.sueldosRecargados;

public class EmpleadoPlanta extends Empleado {

	private int cantidadDeHijos;
	
	public EmpleadoPlanta(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}
	
	@Override
	double calcularSueldoBruto() {
		return this.sueldoBasico() + this.bonoPorHijo();
	}
	
	private double bonoPorHijo() {
		return 150 * this.cantidadDeHijos;
	}
	
	private double sueldoBasico() {
		return 3000;
	}
}
