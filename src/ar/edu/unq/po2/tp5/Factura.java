package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Factura {

	List<Servicio> servicios = new ArrayList<>();

	public void addServicio(Servicio servicio) {
		servicios.add(servicio);
	}

	public double motoTotal() {
		return servicios.stream().mapToDouble(s -> s.montoAPagar()).sum();
	}

	
}
