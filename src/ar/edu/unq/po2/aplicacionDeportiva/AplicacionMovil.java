package ar.edu.unq.po2.aplicacionDeportiva;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil extends Servidor {

	private List<String> interesContrincantes;

	public AplicacionMovil(String nombre) {
		super(nombre);
		this.interesContrincantes = new ArrayList<String>();
	}

	@Override
	protected boolean esDeInteres(Partido partido) {
		return super.esDeInteres(partido) || getInteresConstrncantes().stream()
				.anyMatch(contrincante -> partido.getContrincantes().contains(contrincante));
	}

	public List<String> getInteresConstrncantes() {
		return interesContrincantes;
	}

	public void addInteresConstrncantes(String contrincante) {
		interesContrincantes.add(contrincante);
	}

	public void removeInteresConstrncantes(String contrincante) {
		interesContrincantes.remove(contrincante);
	}

}
