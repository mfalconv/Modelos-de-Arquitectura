import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepository {
    private List<Libro> listaDeLibros;
    private List<Usuario> listaDeUsuarios;

    public BibliotecaRepository() {
        this.listaDeLibros = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaDeLibros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        listaDeUsuarios.add(usuario);
    }

    public List<Libro> obtenerLibrosDisponibles() {
        List<Libro> librosDisponibles = new ArrayList<>();
        for (Libro libro : listaDeLibros) {
            if (libro.isDisponible()) {
                librosDisponibles.add(libro);
            }
        }
        return librosDisponibles;
    }
}
