package TiposAldeanos;

import Clases.Aldeano;
import Clases.Propiedades;

import java.util.ArrayList;

public class Herrero extends Aldeano {

    private int herramientasForjadas;

    public Herrero(String nombre, double dinero, String dni, int edad, char sexo, ArrayList<Propiedades> propiedades, int herramientasForjadas) {
        super(nombre, propiedades, dinero, sexo, dni, edad);
        this.herramientasForjadas = herramientasForjadas;
    }

    public int getHerramientasForjadas() {
        return herramientasForjadas;
    }

    public void setHerramientasForjadas(int herramientasForjadas) {
        this.herramientasForjadas = herramientasForjadas;
    }

    @Override
    public void trabajar(){
        herramientasForjadas++;
        setDinero(getDinero() + 50);
        System.out.println(getNombre()+ "Ha forjado una herramienta, hoy lleva "+getHerramientasForjadas());
    }
}
