import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaDeLibros;
    private List<Usuario> listaDeUsuarios;

    public Biblioteca() {
        this.listaDeLibros = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
    }

    // Métodos para gestionar libros y usuarios

    public Libro buscarLibroPorAutor(String autor) {
        for (Libro libro : listaDeLibros) {
            if (libro.getAutor().equals(autor) && libro.isDisponible()) {
                return libro;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorID(String ID) {
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getID().equals(ID)) {
                return usuario;
            }
        }
        return null;
    }
}
