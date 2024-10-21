package ar.edu.unq.po2.concursoDePreguntasYRespuestas;

public class Pregunta {
	
	private String enunciado;
	private String respuesta;
	
	public Pregunta(String enunciado, String respuesta) {
		this.enunciado = enunciado;
		this.respuesta = respuesta;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	
	public Boolean verificarRespuesta(String respuesta) {
		return respuesta == respuesta;
	}
	
}
