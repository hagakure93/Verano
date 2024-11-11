package EjercicioBiblioteca;

import java.time.LocalDate;

public class Libro {
    private final String titulo;
    private final Autor autor;
    private final String editorial;
    private final LocalDate fechaPublicacion;
    private final String isbn;
    private final double precio;

    public Libro(String titulo, Autor autor, String editorial, LocalDate fechaPublicacion, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + "\n"
                + "Autor: " + autor.getNombre() + " " + autor.getApellido() + "\n"
                + "Editorial: " + editorial + "\n"
                + "Fecha de publicacion: " + fechaPublicacion + "\n"
                + "ISBN: " + isbn + "\n"
                + "Precio: " + precio + "€";
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

}
