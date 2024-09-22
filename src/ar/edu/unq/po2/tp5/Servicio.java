package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
	
	private double costoPorUnidadConsumida;
	private double cantidadDeUnidadesConsumidas;
	private int tasaImpuesto;
	
	public Servicio(double costoPorUnidadConsumida, double cantidadDeUnidadesConsumidas, int tasaImpuesto) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
		this.tasaImpuesto = tasaImpuesto;
	}
	
	public double montoFactura() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}
	
	public double montoAPagar() {
		return montoFactura() * tasaImpuesto;
	}
}
