public class Libro extends Material {
    private final String autor;
    private final String isbn;

    public Libro(String codigo, String titulo, int anio, boolean disponible, String autor, String isbn) {
        super(codigo, titulo, anio, disponible);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }
}