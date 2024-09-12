package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	
	double descuento;
	
	public ProductoPrimeraNecesidad(String _nombre, double _precioBaseDelProducto, Boolean _preciosCuidados, double _descuento) {
		super(_nombre, _precioBaseDelProducto, _preciosCuidados);
		this.descuento = _descuento;
	}

	public ProductoPrimeraNecesidad(String _nombre, double _precioBaseDelProducto, double _descuento) {
		super(_nombre, _precioBaseDelProducto);
		this.descuento = _descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * descuento;
	}
	
	
}

