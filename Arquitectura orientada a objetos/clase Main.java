public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("123456", "La Sombra del Viento", "Carlos Ruiz Zafón");
        Libro libro2 = new Libro("789012", "Cien años de soledad", "Gabriel García Márquez");

        Usuario usuario1 = new Usuario("0001", "Juan");
        Usuario usuario2 = new Usuario("0002", "María");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Simulación de préstamo y devolución
        usuario1.realizarPrestamo(biblioteca.buscarLibroPorAutor("Carlos Ruiz Zafón"));
        usuario2.realizarPrestamo(biblioteca.buscarLibroPorAutor("Gabriel García Márquez"));

        usuario1.devolverLibro(libro1);

        // Mostrar información de la biblioteca
        System.out.println("\nEstado de la Biblioteca:");
        System.out.println("Libros disponibles:");
        for (Libro libro : biblioteca.getListaDeLibros()) {
            System.out.println(libro);
        }

        System.out.println("\nUsuarios:");
        for (Usuario usuario : biblioteca.getListaDeUsuarios()) {
            System.out.println(usuario);
        }
    }
}
