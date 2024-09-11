package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	
	public ProductoPrimeraNecesidad(String _nombre, double _precioBaseDelProducto, Boolean _preciosCuidados) {
		super(_nombre, _precioBaseDelProducto, _preciosCuidados);
	}

	public ProductoPrimeraNecesidad(String _nombre, double _precioBaseDelProducto) {
		super(_nombre, _precioBaseDelProducto);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
	
}

