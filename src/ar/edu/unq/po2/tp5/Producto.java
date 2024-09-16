package ar.edu.unq.po2.tp5;

public abstract class Producto {

	protected double precio;
	protected int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void incrementarStock(int cantidad) {
		stock += cantidad;
	}
	
	public void decrementarStock() {
		// verificar stock
		stock -= 1;
	}
	
	
	
	
}
