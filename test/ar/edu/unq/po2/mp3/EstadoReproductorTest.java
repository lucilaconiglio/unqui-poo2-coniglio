package ar.edu.unq.po2.mp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstadoReproductorTest {

    private Song song;

    @BeforeEach
    public void setUp() {
        song = new Song(); 
    }

    @Test
    public void testPlayEnSeleccionDeCancionesCambiaAReproduciendo() {
        assertTrue(song.getEstadoReproductor() instanceof SeleccionDeCanciones);
        song.play();
        assertTrue(song.getEstadoReproductor() instanceof Reproduciendo);
    }

    @Test
    public void testPauseEnSeleccionDeCancionesLanzaError() {
        assertThrows(Error.class, () -> song.pause());
    }

    @Test
    public void testPlayEnReproduciendoLanzaError() {
        assertThrows(Error.class, () -> song.play());
    }

    @Test
    public void testPauseEnReproduciendoCambiaAPausado() {
    	song.play();
        song.pause();
        assertTrue(song.getEstadoReproductor() instanceof Pausado);
    }

    @Test
    public void testStopEnReproduciendoCambiaASeleccionDeCanciones() {
    	song.play();
        song.stop();
        assertTrue(song.getEstadoReproductor() instanceof SeleccionDeCanciones);
    }

    @Test
    public void testPlayEnPausadoLanzaError() {
    	song.play();
        song.stop();
        assertThrows(Error.class, () -> song.play());
    }

    @Test
    public void testPauseEnPausadoCambiaAReproduciendo() {
    	song.pause();
        song.pause();
        assertTrue(song.getEstadoReproductor() instanceof Reproduciendo);
    }


}
