public final class Circulo {
    private double radio;
    private String color;
    private int centroX, centroY;

    public Circulo() { // crea un círculo de radio 50, negro y centro en (100,100)
        radio = 50;
        color = "negro";
        centroX = 100;
        centroY = 100;
    }

    public Circulo(double r) { // crea un círculo de radio r, negro y centro en (100,100)

        setRadio(r);
        color = "Blanco";
        centroX = 0;
        centroY = 0;
    }

    public double getRadio() { // consulta el radio del círculo
        return radio;
    }

    public void setRadio(double nuevoRadio) { // actualiza el radio del círculo a nuevoRadio
        if (nuevoRadio < 0)
            radio = 0;
        else
            radio = nuevoRadio;
    }

    public void decrece() { // decrementa el radio del círculo
        radio = radio / 1.3;
    }

    public double area() { // calcula el área del círculo
        return Math.PI * radio * radio;
    }

    public void mostrarDatos() { // obtiene un String con las componentes del círculo

        System.out.println(
                "Circulo de radio " + radio + ", color " + color + " , centro (" + centroX + "," + centroY
                        + ") y su área es " + area());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCentroX() {
        return centroX;
    }

    public void setCentroX(int cx) {
        centroX = cx;
    }

    public int getCentroY() {
        return centroY;
    }

    public void setCentroY(int cy) {
        centroY = cy;
    }
}
