package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	private double descuentoIva = 0.9;
			
	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	@Override
	public double getPrecio() {
		return precio * descuentoIva;
	}

}
