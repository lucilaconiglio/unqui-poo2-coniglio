package ar.edu.unq.po2.encirptacion;

public class EncriptadorVocales implements Encriptador{

	
	@Override
	public String encriptar(String texto) {
		StringBuilder resultado = new StringBuilder();
		for (char c: texto.toCharArray()) {
			resultado.append(siguienteVocal(c));
		}
		return resultado.toString();
	}

	@Override
	public String desencriptar(String texto) {
		StringBuilder resultado = new StringBuilder();
		for (char c: texto.toCharArray()) {
			resultado.append(vocalAnterior(c));
		}
		return resultado.toString();
	}

    // Método que devuelve la siguiente vocal
    private char siguienteVocal(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': return Character.isUpperCase(c) ? 'E' : 'e';
            case 'e': return Character.isUpperCase(c) ? 'I' : 'i';
            case 'i': return Character.isUpperCase(c) ? 'O' : 'o';
            case 'o': return Character.isUpperCase(c) ? 'U' : 'u';
            case 'u': return Character.isUpperCase(c) ? 'A' : 'a';
            default: return c; // Si no es vocal, se mantiene igual
        }
    }
    
    // Método que devuelve la vocal anterior en el orden
    private char vocalAnterior(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': return Character.isUpperCase(c) ? 'U' : 'u';
            case 'e': return Character.isUpperCase(c) ? 'A' : 'a';
            case 'i': return Character.isUpperCase(c) ? 'E' : 'e';
            case 'o': return Character.isUpperCase(c) ? 'I' : 'i';
            case 'u': return Character.isUpperCase(c) ? 'O' : 'o';
            default: return c; // Si no es vocal, se mantiene igual
        }
    }
}
