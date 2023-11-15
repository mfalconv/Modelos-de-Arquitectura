public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Getters y setters

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("El libro no está disponible en este momento.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto con éxito.");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
