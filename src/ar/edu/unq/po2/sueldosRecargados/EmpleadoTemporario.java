package ar.edu.unq.po2.sueldosRecargados;

public class EmpleadoTemporario extends Empleado{

	private Boolean tieneFamilia;
	private int horasTrabajadas;
	
	public EmpleadoTemporario(Boolean tieneFamilia, int horasTrabajadas){
		this.tieneFamilia = tieneFamilia;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	double calcularSueldoBruto() {
		return 1000 + (this.horasTrabajadas * 5) + this.bonoFamiliar();
	}

	private double bonoFamiliar() {
	    return tieneFamilia ? 100 : 0;
	}

}
