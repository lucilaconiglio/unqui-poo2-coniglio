package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

    @Test
    public void testGetTotalPercibido() {
        Trabajador trabajador = new Trabajador();
        trabajador.addIngreso(new Ingreso(Mes.ENERO, "Salario", 1000.0));
        trabajador.addIngreso(new IngresoPorHorasExtras(Mes.FEBRERO, "Horas Extras", 200.0, 5));

        assertEquals(1200.0, trabajador.getTotalPercibido());
    }

    @Test
    public void testGetMontoImponible() {
        Trabajador trabajador = new Trabajador();
        trabajador.addIngreso(new Ingreso(Mes.ENERO, "Salario", 1000.0));
        trabajador.addIngreso(new IngresoPorHorasExtras(Mes.FEBRERO, "Horas Extras", 200.0, 5));

        assertEquals(1000.0, trabajador.getMontoImponible());
    }
    
    @Test
    public void testGetImpuestoAPagar() {
        Trabajador trabajador = new Trabajador();
        trabajador.addIngreso(new Ingreso(Mes.ENERO, "Salario", 1000.0));
        trabajador.addIngreso(new IngresoPorHorasExtras(Mes.FEBRERO, "Horas Extras", 200.0, 5));

        assertEquals(20.0, trabajador.getImpuestoAPagar());
    }

}
