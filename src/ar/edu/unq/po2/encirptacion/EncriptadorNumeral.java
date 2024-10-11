package ar.edu.unq.po2.encirptacion;

public class EncriptadorNumeral implements Encriptador {

    @Override
    public String encriptar(String texto) {
        StringBuilder resultado = new StringBuilder();
        
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == ' ') {
                resultado.append("0");
            } else {
                int valorNumerico = c - 'a' + 1; // Calcula la posición de la letra en el abecedario
                resultado.append(valorNumerico);
            }
            resultado.append(","); // Añade una coma después de cada número
        }
        
        // Elimina la coma final
        resultado.setLength(resultado.length() - 1);
        
        return resultado.toString();
    }

    @Override
    public String desencriptar(String texto) {
        StringBuilder resultado = new StringBuilder();
        String[] numeros = texto.split(",");
        
        for (String numero : numeros) {
            int valorNumerico = Integer.parseInt(numero);
            if (valorNumerico == 0) {
                resultado.append(" ");
            } else {
                char letra = (char) ('a' + valorNumerico - 1); // Convierte el número a la letra correspondiente
                resultado.append(letra);
            }
        }
        
        return resultado.toString();
    }
}
