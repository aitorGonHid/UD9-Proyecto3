
public class Libro implements Comparable<Libro>{
	
	// Atributos
	private String isbn;
	private String titulo;
	private String autor;
	private int paginas;
	
	// Constructores
	public Libro() {
	}
	
	public Libro(String isbn, String titulo, String autor, int paginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	// Getters & setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return "El libro con isbn " + isbn + " creado por el autor "+ autor +" tienes " + paginas + " páginas.";
	}
	@Override
	public int compareTo (Libro lib) {
		// si el libro que llama a la funcion tiene mas paginas devolverá result < 0
		// si ambos libros tienen el mismo numero de páginas devolverá 0
		// si el libro pasado como parametro tiene más páginas devolverá result > 0
		int result = lib.getPaginas() - this.getPaginas();
		
		return result;
	}	
}
