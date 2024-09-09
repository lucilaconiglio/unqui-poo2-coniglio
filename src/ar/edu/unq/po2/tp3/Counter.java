package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros;
	
	public Counter() {
		 this.numeros = new ArrayList<Integer>(); 
	}

	public void addNumber(int numero) {
    	this.numeros.add(numero);
    }
    
    public int getNumerosPares() {
        return (int) numeros.stream()
                .filter(numero -> numero % 2 == 0)  
                .count();                           
    }
    
    public int getNumerosImpares() {
        return (int) numeros.stream()
                .filter(numero -> numero % 2 != 0)  
                .count();                           
    }
    
    public int getNumerosMultiplos(int num) {
        return (int) numeros.stream()
                .filter(numero -> numero % num == 0)  
                .count();                           
    }
}
