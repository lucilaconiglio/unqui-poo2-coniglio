package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
	
	private double costoPorUnidadConsumida;
	private double cantidadDeUnidadesConsumidas;
	private int tasa;
	
	public Servicio(double costoPorUnidadConsumida, double cantidadDeUnidadesConsumidas, int tasa) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
		this.tasa = tasa;
	}
	
	public double montoAPagar() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}
	
	public int getImpuesto() {
		return tasa;
	}
}
