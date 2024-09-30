package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Servicio extends Factura{
	
	private double costoPorUnidadConsumida;
	private double cantidadDeUnidadesConsumidas;

	
	public Servicio(Agencia agencia, double costoPorUnidadConsumida, double cantidadDeUnidadesConsumidas) {
		super(agencia);
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	@Override
	public double getMonto() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}
	
}
