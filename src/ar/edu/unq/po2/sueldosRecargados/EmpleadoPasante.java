package ar.edu.unq.po2.sueldosRecargados;

public class EmpleadoPasante extends Empleado {

	private int horasTrabajadas;

	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	double calcularSueldoBruto() {
		return 40 * this.horasTrabajadas;
	}

}
