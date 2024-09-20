public class Mangas {

    private String nombre;
    private int pages;
    private String genero;

    public Mangas (String nombre ,int pages , String genero){
        this.nombre = nombre;
        this.pages = pages;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
