package ar.edu.unq.po2.palabrasOrdenadas;

import javax.swing.DefaultListModel;

public class AdaptadorListaDePalabras  extends DefaultListModel<String>{

	private ListaDePalabrasOrdenadas listaDePalabrasOrdenadas;
	 	
    @Override
    public void addElement(String palabra) {
        listaDePalabrasOrdenadas.agregarPalabra(palabra);
        fireContentsChanged(this, 0, listaDePalabrasOrdenadas.cantidadDePalabras() - 1);
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
