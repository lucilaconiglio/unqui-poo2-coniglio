package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Factura  {
	
	List<Servicio> servicios = new ArrayList<>();
	List<Impuesto> impuestos = new ArrayList<>();
	

	public void registrarPago(Agencia agencia) {
		agencia.registrarPago(this);
	}
	
	
}
