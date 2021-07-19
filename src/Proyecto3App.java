
public class Proyecto3App {

	public static void main(String[] args) {
		// Se crean 2 libros
		Libro lib1 = new Libro("00001", "El camino de los reyes", "Brandon Sanderson", 900);
		Libro lib2 = new Libro("00002", "El nombre del viento", "Patrick Rothfuss", 1400);
		
		// Muestra los dos libros por consola usando toString() de libro
		System.out.println(lib1.toString());
		System.out.println(lib2.toString());

		// Mostrat cual tiene mas paginas
		int compare = lib1.compareTo(lib2);
		if (compare == 0) {
			System.out.println("Ambos libros tienen el mismo numero de páginas");
		} else {
			if (compare < 0) {
				System.out.println(lib1.getTitulo() +" tiene más paginas");
			} else {
				System.out.println(lib2.getTitulo() +" tiene más paginas");
			}
		}
	}

}
