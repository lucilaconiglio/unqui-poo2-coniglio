package ar.edu.unq.po2.tp3;

public class Numeros {
	
	public static int cantidadDeNumerosPares(int numero) {
		
		int cantidadNumPares = 0;
		int valor = numero;
		Counter counter = new Counter();
		
		while (valor > 0) {
	        int digito = valor % 10;   // Extraemos el último dígito
	        counter.addNumber(digito); // Lo añadimos al Counter
	        valor = valor / 10;        // Eliminamos el último dígito
		}
		
		return counter.getNumerosPares();
	}
	
    // Función que encuentra el número con más dígitos pares en un arreglo
    public static int numeroConMasDigitosPares(int[] arreglo) {
        int maximoNumero = arreglo[0]; // Iniciar con el primer número del arreglo
        int maximoDigitosPares = cantidadDeNumerosPares(arreglo[0]);
        
 
        for (int i = 1; i < arreglo.length; i++) {
            int digitosParesActuales = cantidadDeNumerosPares(arreglo[i]);
            
           
            if (digitosParesActuales > maximoDigitosPares) {
                maximoNumero = arreglo[i];
                maximoDigitosPares = digitosParesActuales;
            }
        }
        
        return maximoNumero; 
    }
}
    

