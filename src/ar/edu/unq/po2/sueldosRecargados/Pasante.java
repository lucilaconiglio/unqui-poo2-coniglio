package ar.edu.unq.po2.sueldosRecargados;

public class Pasante extends Empleado{

	private int horasTrabajadas;

	public Pasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	double calcularSueldoBruto() {
		return 40 * this.horasTrabajadas;
	}
	
}
