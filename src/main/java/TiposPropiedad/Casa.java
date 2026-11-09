package TiposPropiedad;

import Clases.Propiedades;

public class Casa extends Propiedades {
    private String calle;
    private int plantas;
    private int habitaciones;

    public Casa(double precio, int metrosCuadrados, String calle, int plantas, int habitaciones) {
        super(precio, metrosCuadrados);
        this.calle = calle;
        this.plantas = plantas;
        this.habitaciones = habitaciones;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

}
