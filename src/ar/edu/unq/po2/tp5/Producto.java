package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable{

	protected double precio;
	protected int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	@Override
	public double getMonto() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void incrementarStock(int cantidad) {
		stock += cantidad;
	}
	
	private void decrementarStock() {
		// verificar stock
		stock -= 1;
	}
	
	@Override
	public void registrarPago() {
		decrementarStock();
	}
	
	
	
	
}
