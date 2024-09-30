package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Cobrable> cobrables = new ArrayList<>();
	
	public void registrar(Cobrable cobrable){
		cobrable.registrarPago();
		cobrables.add(cobrable);
	}
	
	public double getMontoTotal() {
		return cobrables.stream()
					  .mapToDouble(p->p.getMonto())
					  .sum();
	}
	
	
}
