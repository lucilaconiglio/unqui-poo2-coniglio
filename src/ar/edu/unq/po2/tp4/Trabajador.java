package ar.edu.unq.po2.tp4;

import static org.junit.Assume.assumeFalse;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	List<Ingreso> ingresos = new ArrayList<Ingreso>(); 
	private double tasaImpuesto = 0.02;
	
	public void addIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		return this.ingresos.stream()
							.mapToDouble(i -> i.getMonto())
							.sum();
	}
	
	public double getImpuestoAPagar() {
		return getMontoImponible() * tasaImpuesto;
	}
	
	public double getMontoImponible() {
		return this.ingresos.stream()
							.filter(i -> i.esImponible())
							.mapToDouble(i -> i.getMonto())
							.sum();
	}

}
