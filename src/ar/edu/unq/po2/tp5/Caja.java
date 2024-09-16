package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Producto> productos = new ArrayList<>();
	
	public void registrarProducto(Producto producto){
		producto.decrementarStock();
		productos.add(producto);
	}
	
	public double getMontoTotal() {
		return productos.stream()
					  .mapToDouble(p->p.getPrecio())
					  .sum();
	}
	
	
}
