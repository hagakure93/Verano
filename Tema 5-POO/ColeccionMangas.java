
public class ColeccionMangas {
    public static void main(String[] args) {
        // Así se crea el array de objetos Mangas
        Mangas[] coleccionMangas = new Mangas[5];

        // Para introducir los datos de cada objeto
        coleccionMangas[0] = new Mangas("Naruto", 500, "shonen");
        coleccionMangas[1] = new Mangas("GTO", 300, "Nekketsu");
        coleccionMangas[2] = new Mangas("Akira", 340, "seinen");
        coleccionMangas[3] = new Mangas("ikkitousen", 220, "ecchi");
        coleccionMangas[4] = new Mangas("Gintama", 1200, "shonen");

        mostrarArray(coleccionMangas);

    }

    static void mostrarArray(Mangas[] coleccion) {
        for (Mangas manga : coleccion) {
            System.out.println("Nombre: " + manga.getNombre() + ", Páginas: " + manga.getPages() + ", Género: "
                    + manga.getGenero());
        }
    }

}
