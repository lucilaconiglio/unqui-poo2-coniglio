package ar.edu.unq.po2.palabrasOrdenadas;

import javax.swing.DefaultListModel;

public class AdaptadorListaDePalabras extends DefaultListModel<String> {

	private final ListaDePalabrasOrdenadas listaDePalabrasOrdenadas;

	public AdaptadorListaDePalabras() {
		this.listaDePalabrasOrdenadas = new ListaDePalabrasOrdenadas();
	}

	@Override
	public void addElement(String palabra) {
		listaDePalabrasOrdenadas.agregarPalabra(palabra);
	}

	@Override
	public String getElementAt(int index) {
		return listaDePalabrasOrdenadas.getPalabraDePosicion(index);
	}

	@Override
	public int getSize() {
		return listaDePalabrasOrdenadas.cantidadDePalabras();
	}
}
