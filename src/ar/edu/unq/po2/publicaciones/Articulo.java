package ar.edu.unq.po2.publicaciones;

import java.util.List;

public class Articulo {
	
	private String titulo;
	
	private List<String> autores;
	
	private List<String> filiaciones;
	
	private String tipoDeArticulo;
	
	private String lugarDePublicacion;
	
	private List<String> palabrasClaves;
	
	public Articulo(String titulo, List<String> autores, List<String> filiaciones, String tipoDeArticulo, String lugarDePublicacion, List<String> palabrasClaves) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClaves = palabrasClaves;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}
	
	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}
	
	public  List<String> getAutores() {
		return autores;
	}
	
	public  List<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	public  List<String> getFiliaciones() {
		return filiaciones;
	}

	
}
