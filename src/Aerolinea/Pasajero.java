package Aerolinea;

import java.io.Serializable;
import Aerolinea.Maleta;
import Aerolinea.Usuario;
import java.util.ArrayList;

public class Pasajero {
    private static final long serialVersionUID;

    private String nombre;
    private boolean trabajador;
    private Maleta equipaje;
    private Usuario cuenta;

    public Pasajero(String nombre, boolean trabajador, Maleta equipaje, Usuario cuenta) {
        this.nombre = nombre;
        this.trabajador = trabajador;
        this.equipaje = equipaje;
        this.cuenta = cuenta;
    }

    public void comprarBoleto() {

    }

}