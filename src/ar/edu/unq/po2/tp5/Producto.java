package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable{

	private double monto;
	private int stock;
	
	public Producto(double monto, int stock) {
		this.monto = monto;
		this.stock = stock;
	}
	
	@Override
	public double getMonto() {
		return monto;
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
