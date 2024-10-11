package ar.edu.unq.po2.encirptacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EncriptadorNaive implements Encriptador {

    @Override
    public String encriptar(String texto) {
        List<String> palabras = Arrays.asList(texto.split(" "));
        Collections.reverse(palabras);
        return String.join(" ", palabras);
    }

    @Override
    public String desencriptar(String texto) {
        // Como el proceso de encriptación invierte las palabras,
        // desencriptar simplemente implica volver a invertir el texto.
        return encriptar(texto);
    }
}
