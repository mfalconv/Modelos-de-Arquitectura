import java.util.List;

public class BibliotecaUI {
    private BibliotecaService bibliotecaService;

    public BibliotecaUI() {
        this.bibliotecaService = new BibliotecaService();
    }

    public void iniciar() {
        // Simulación de inicialización de la interfaz de usuario
        Usuario usuario = new Usuario("0001", "Juan");
        bibliotecaService.agregarUsuario(usuario);

        Libro libro1 = new Libro("123456", "La Sombra del Viento", "Carlos Ruiz Zafón");
        Libro libro2 = new Libro("789012", "Cien años de soledad", "Gabriel García Márquez");

        bibliotecaService.agregarLibro(libro1);
        bibliotecaService.agregarLibro(libro2);

        // Obtener libros disponibles
        List<Libro> librosDisponibles = bibliotecaService.obtenerLibrosDisponibles();
        System.out.println("Libros disponibles:");
        for (Libro libro : librosDisponibles) {
            System.out.println(libro);
        }

        // Simulación de préstamo y devolución
        bibliotecaService.realizarPrestamo(usuario, librosDisponibles.get(0));
        bibliotecaService.realizarPrestamo(usuario, librosDisponibles.get(1));

        bibliotecaService.devolverLibro(usuario, librosDisponibles.get(0));

        // Obtener libros disponibles después de las operaciones
        librosDisponibles = bibliotecaService.obtenerLibrosDisponibles();
        System.out.println("\nLibros disponibles después de las operaciones:");
        for (Libro libro : librosDisponibles) {
            System.out.println(libro);
        }
    }
}
