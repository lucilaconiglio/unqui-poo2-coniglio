package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String _nombre, String _direccion) {
		this.nombre = _nombre;
		this.direccion = _direccion;
		this.productos = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream()
							 .mapToDouble(p -> p.getPrecio())
							 .sum();
	}
}
