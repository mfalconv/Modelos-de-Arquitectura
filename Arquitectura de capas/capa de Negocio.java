import java.util.List;

public class BibliotecaService {
    private BibliotecaRepository bibliotecaRepository;

    public BibliotecaService() {
        this.bibliotecaRepository = new BibliotecaRepository();
    }

    public List<Libro> obtenerLibrosDisponibles() {
        return bibliotecaRepository.obtenerLibrosDisponibles();
    }

    public void realizarPrestamo(Usuario usuario, Libro libro) {
        if (libro.isDisponible()) {
            usuario.realizarPrestamo(libro);
            libro.prestar();
        } else {
            System.out.println("El libro no está disponible en este momento.");
        }
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.devolverLibro(libro);
        libro.devolver();
    }
}
