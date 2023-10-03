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
    private ArrayList<Maleta> equipaje = new ArrayList<>();
    private Asiento asiento;
    private Pasajero pasajero;
    
    //...precios
    private int valorInicial;
    private int valorEquipaje;
    //precios...

    private Vuelo vuelo;

    public Boleto(String id, String tipo, Usuario propietario, ArrayList<Maleta> equipaje, Asiento asiento,
            int init_valor,
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

    public Boleto (String origen, String destino, Usuario propietario, Vuelo vuelo) {
        this.origen = origen;
        this.destino = destino;
        this.propietario = propietario;
        this.vuelo = vuelo;
        this.pasajero = new Pasajero(destino, false, null, propietario);
        this.pasajero.setBoleto(this);
    }

    public void updateValor() {
        int temp = 0;
        for (Maleta maleta : equipaje) {
            temp += maleta.calcularPrecio();
        }
        this.valorEquipaje = temp;
        this.valor = this.valorInicial + this.valorEquipaje;
    }

    public void asignarAsiento(Asiento asiento) {
        this.asiento = asiento;
        asiento.asignarBoleto(this);
        this.valorInicial = asiento.getPrecio();
    }

    public void resetEquipaje() {
        this.equipaje = null;
        this.valor = 0;
    }

    public String getOrigenDestino() {
        return this.origen + " - " + this.destino;
    }

    public void addEquipaje(Maleta maleta) {
        this.equipaje.add(maleta);
        this.updateValor();
    }

    // ...get and set


}