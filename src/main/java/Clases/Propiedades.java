package Clases;

public abstract class Propiedades {
    private double precio;
    private int metrosCuadrados;

    public Propiedades(double precio, int metrosCuadrados) {

        this.precio = precio;
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Propiedades{" +
                "precio=" + precio +
                "metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}
