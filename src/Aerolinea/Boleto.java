package Aerolinea;

import java.io.Serializable;
import java.util.ArrayList;

import Aerolinea.*;

public class Boleto implements Serializable {
    private static final long serialVersionUID;

    private String id;
    private String tipo;
    private Usuario propietario;

    private String origen;
    private String destino;

    private int valor;
    private int init_valor;
    private Maleta[] equipaje;
    private Asiento asiento;

    public Boleto(String id, String tipo, Usuario propietario, Maleta[] equipaje, Asiento asiento, int init_valor,
            String origen, String destino) {

        this.origen = origen;
        this.destino = destino;

        this.id = id;
        this.tipo = tipo;
        this.propietario = propietario;
        this.valor = init_valor;
        this.equipaje = equipaje;
        this.asiento = asiento;
    }

    public void updateValor() {
        int valorEquipaje = 0;
        for (Maleta maleta : equipaje) {
            valorEquipaje += maleta.calcularPrecio();
        }
        this.valor = init_valor + valorEquipaje;
    }

    public void resetEquipaje() {
        this.equipaje = null;
        this.updateValor();
    }

    public String getOrigenDestino() {
        return this.origen + " - " + this.destino;
    }

    // ...get and set

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getInit_valor() {
        return this.init_valor;
    }

    public void setInit_valor(int init_valor) {
        this.init_valor = init_valor;
    }

    public Maleta[] getEquipaje() {
        return this.equipaje;
    }

    public void setEquipaje(Maleta[] equipaje) {
        this.equipaje = equipaje;
    }

    public Asiento getAsiento() {
        return this.asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

}