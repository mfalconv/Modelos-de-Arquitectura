public class Usuario {
    private String ID;
    private String nombre;

    public Usuario(String ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    // Getters y setters

    public void realizarPrestamo(Libro libro) {
        libro.prestar();
        System.out.println(nombre + " ha realizado un préstamo: " + libro);
    }

    public void devolverLibro(Libro libro) {
        libro.devolver();
        System.out.println(nombre + " ha devuelto un libro: " + libro);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
