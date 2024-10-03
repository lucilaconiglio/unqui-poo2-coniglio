package ar.edu.unq.po2.sueldosRecargados;

public abstract class Empleado {
	

	abstract double valorPorHora();

	int horasTrabajadas;

	abstract double sueldoBasico();

	double descuentoPorObraSocialyAportes = 0.13;
	

	abstract void cargarHoras();
	
		
	abstract double calcularBonoFamiliar();
	
	protected double calcularValorPorHorasTrabajadas() {
		return horasTrabajadas * this.valorPorHora();
	}

	protected double sueldo() {
		return (this.calcularBonoFamiliar() + this.calcularValorPorHorasTrabajadas() + this.sueldoBasico()) * descuentoPorObraSocialyAportes;
	}
	
	protected void cobrar() {
		// reseteo la cant. de horas trabajadas a 0.
		horasTrabajadas = 0;
	}

}
