import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {

	private Counter counter;
	
    @BeforeEach
    void setUp() throws Exception {
        counter = new Counter();
        
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
        
    }

    
	@Test
	void testNumerosPares() {
		int cantidad = counter.getNumerosPares();
		assertEquals(cantidad, 1);
	}
	
	@Test
	void testNumerosImpares() {
		int cantidad = counter.getNumerosImpares();
		assertEquals(cantidad, 9);
	}
	
	@Test
	void testNumerosMultiplosDeTres() {
		int cantidad = counter.getNumerosMultiplos(3);
		assertEquals(cantidad, 2); // los numeros que son multiplos de tres: 3 y 9
	}

}
