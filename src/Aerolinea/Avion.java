package Aerolinea;

import java.io.Serializable;// clase para serializar
import java.util.ArrayList;

public class Avion implements Serializable { // se crea la clase e implementa serializacion

	private static final long serialVersionUID; // atributo con el codigo de serializacion

	private Asiento asientos; // se crean los atributos requeridos para la clase
	private final String AEROLINEA;
	private final String ID;
	private String horarioSalida;
	private String horarioLlegada;
	private final String DESTINO;
	private final String ORIGEN;
	private ArrayList<Maleta> equipajes = new ArrayList<>();

	public Avion(String aerolinea, String id, String tiempoSalida, String tiempoLlegada, String Destino,
			String origen) {
		this.AEROLINEA = aerolinea;
		this.ID = id;
		this.horarioSalida = tiempoSalida;
		this.horarioLlegada = tiempoLlegada;
		this.DESTINO = Destino;
		this.ORIGEN = origen;
	}

	public void addEquipaje(Maleta equipaje) {// añade equipaje a la lista de equipajes
		this.equipajes.add(equipaje);
	}

	public void deleteEquipaje(Maleta equipaje) {
		this.equipajes.remove(equipaje);
	}

	public void setHorarioSalida(String horarioSalida) {
		this.horarioSalida = horarioSalida;
	}

	public void setHorarioLlegada(String horariollegada) {
		this.horarioLlegada = horariollegada;
	}

	public Asiento getAsientos() {
		return this.asientos;
	}

	public String getAerolinea() {
		return this.AEROLINEA;
	}

	public String getId() {
		return this.ID;
	}

	public String getHorarioSalida() {
		return this.horarioSalida;
	}

	public String getHorarioLlegada() {
		return this.horarioLlegada;
	}

	public String getDestino() {
		return this.DESTINO;
	}

	public String getOrigen() {
		return this.ORIGEN;
	}

	public ArrayList<Maleta> getEquipajes() {
		return this.equipajes;
	}
}
