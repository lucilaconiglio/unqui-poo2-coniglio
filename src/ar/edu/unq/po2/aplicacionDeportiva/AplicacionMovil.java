package ar.edu.unq.po2.aplicacionDeportiva;

import java.util.List;

public class AplicacionMovil extends Observer{

	private List<String> interesContrincantes;
	
	public AplicacionMovil(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esDeInteres(Partido partido) {
		super(partido) ||
		getInteresConstrncantes().stream()
         .anyMatch(contrincante -> partido.getContrincantes().contains(contrincante));
	}
	
	public List<String>  getInteresConstrncantes() {
		return interesContrincantes;
	}
	
	public void addInteresConstrncantes(String contrincante) {
		interesContrincantes.add(contrincante);
	}
	
	public void removeInteresConstrncantes(String contrincante) {
		interesContrincantes.remove(contrincante);
	}

}
