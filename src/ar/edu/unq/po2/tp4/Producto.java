package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precioBase;
	private Boolean esPrecioCuidado = false;
	
	public Producto(String _nombre, double _precioBaseDelProducto, Boolean _esPrecioCuidado) {	
		this.nombre = _nombre;
		this.precioBase = _precioBaseDelProducto;
		this.esPrecioCuidado = _esPrecioCuidado;
	}
	
	public Producto(String _nombre, double _precioBaseDelProducto) {	
		this.nombre = _nombre;
		this.precioBase = _precioBaseDelProducto;
	}
	
	
	public String getNombre(){
		return this.nombre;
	}
	
	public double getPrecio(){
		return this.precioBase;
	}
	
	public Boolean esPrecioCuidado(){
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precioBase += aumento; 
	}
	
}

