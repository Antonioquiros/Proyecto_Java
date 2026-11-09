package Clases;

import java.util.ArrayList;

public abstract class Aldeano {
    private String nombre;
    private String dni;
    private int edad;
    private char sexo;
    private double dinero;
    private ArrayList<Propiedades> propiedades;

    public Aldeano(String nombre, ArrayList<Propiedades> propiedades, double dinero, char sexo, String dni, int edad) {
        this.nombre = nombre;
        this.propiedades = propiedades;
        this.dinero = dinero;
        this.sexo = sexo;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Propiedades> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Propiedades> propiedades) {
        this.propiedades = propiedades;
    }

    public abstract void trabajar();

    @Override
    public String toString() {
        return "Aldeano{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", dinero=" + dinero +
                ", propiedades=" + propiedades +
                '}';
    }
}
