package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

abstract class Factura implements Cobrable {
	
	private Agencia agencia;
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	

	@Override
	public void registrarPago() {
		getAgencia().registrarPago(this);
		
	}
	
}
