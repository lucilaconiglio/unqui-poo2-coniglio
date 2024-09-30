package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Cobrable> productos = new ArrayList<>();
	
	public void registrarProducto(Cobrable cobrable){
		cobrable.registrarPago();
		productos.add(cobrable);
	}
	
	public double getMontoTotal() {
		return productos.stream()
					  .mapToDouble(p->p.getMonto())
					  .sum();
	}
	
	
}
